package com.mycu.controller;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mycu.controller.HibernateUtil;
import com.mycu.model.User;
public class UserDAO 
{
	private String Username,password;
	private String email,fName,lName;
	private int uID;
	
	public UserDAO()
	{
	}
	
	public User checkUser(User user)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
	    try
	    {
	    	 System.out.println("Username entered is "+user.getuserName());
	    	 session.beginTransaction();     	 
	    	 Query query = session.createQuery("from User U where U.userName = :userName");
	    	 query.setParameter("userName",user.getuserName());
	         List<User> user2 = query.list();
	         for(User user3 : user2)
	         {
	             System.out.println("UserID: "+user3.getuId()+" UserName: "+user3.getfName());
	             if(user3.getpassword().equals(user.getpassword()) && user3.getuserName().equals(user.getuserName()))
	            	 return user3;
	            // else
	            //	 return new User();
	         }
	    	//query.setParameter("userName", user.getuserName());
	         //session.flush();
	         //session.clear();  
	       session.getTransaction().commit();
	       //session.close();
	    }catch (HibernateException e) {
	        e.printStackTrace();
	    }
	    return new User();
	}
	
	
	
	public String addUser(User user)
	{
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
 		Session session = sessionFactory.openSession();
 		session.beginTransaction();
 		 session.save(user);	
 		 session.getTransaction().commit();
 		// session.close();
		 fName=user.getfName();
 		 return fName;
	}
	
	public String editUser(User user)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		return Username;
	}
	
	public String save(User user)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
 		Session session = sessionFactory.openSession();
 		session.beginTransaction();
 		
 		
 		lName=user.getlName();
 		fName=user.getfName();
 		email=user.getEmail();
 		Username=user.getuserName();
 		password=user.getpassword();
 		uID=user.getuId();
 		System.out.println("here Uid is "+ uID);
 		User user2=new User();
 		
 		user2= (User) session.get(User.class,uID+1);
 		
 		user2.setfName(fName);
 		user2.setlName(lName);
 		user2.setEmail(email);
 		user2.setpassword(password);
 		user2.setuserName(Username);
 	
 		
 		session.update(user2);	
 		session.getTransaction().commit();
 		//session.close();
 		
 		return fName;
	}

}
