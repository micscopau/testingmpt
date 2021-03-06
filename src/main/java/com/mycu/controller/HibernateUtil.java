package com.mycu.controller;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import com.mycu.model.User;


public class HibernateUtil 
{

	public HibernateUtil()	{}
	
// A SessionFactory is set up once for an application!
   final static StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure() // configures settings from hibernate.cfg.xml
            .build();
    private static SessionFactory sessionFactory=null;

	private static SessionFactory buildSessionFactory() 
	{
	
	    try {
	        sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	        return sessionFactory;
	    }
	    catch (Exception e) 
	    {
	        // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
	        // so destroy it manually.
	        StandardServiceRegistryBuilder.destroy( registry );
	        throw new ExceptionInInitializerError(e);
	    }
	
	}

	public static SessionFactory getSessionFactory() 
	{
	    if(sessionFactory==null)
	    {
	        buildSessionFactory();
	    }
	    return sessionFactory;
	}
	
	public SessionFactory addAccount(User user)
	{
		System.out.println("/user data:" + user.getfName());
		 return sessionFactory;
	}

}