package com.mycu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;
//import javax.persistence.Query;
import com.mycu.model.*;


@Controller
public class HomeController 
{
	
	private String Username,Password;
	private String email,fName,lName;
	public static int uID;
	 
	UserDAO userdao= new UserDAO();
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	 public String Splashpage(@ModelAttribute("userForm") User user,ModelMap model) 
	 {
	        return "index";
	 }
    
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String submit(@ModelAttribute("userForm") User user,BindingResult result,ModelMap model) 
    {
        // Query database to call check if the username and password exist and password match or not 	
    	fName=userdao.checkUser(user);
    	if(fName.equals("NULL"))
    		return "index";

    	model.addAttribute("fName",fName);
    	return "userLoggedin";
    	//else 
    		//return errorLogin.jsp
    }
 
    
	
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView createAccount (@ModelAttribute("userForm") User user,ModelMap model)
    {
    	 return new ModelAndView("createaccount", "user", new User(fName,lName,Username,email,Password));
    }
    
   
	
	
	@RequestMapping(value = "/addAccount", method = RequestMethod.POST)
    public String addUseraccount(@ModelAttribute("userForm") User user,BindingResult result,ModelMap model) throws SQLException
    {

		fName=userdao.addUser(user);
		
		model.addAttribute("fName", fName);
    	
        return "userLoggedin";
    }
    
   
	
	
	@RequestMapping(value = "/logout")
    public String userLogout(@ModelAttribute("userForm") User user,ModelMap model)
    {
    	return "index";
    }
    
   
	
	
	@RequestMapping(value = "/editprofile")
    public ModelAndView  viewProfile(@ModelAttribute("userForm") User user,ModelMap model)
    {
    	 return new ModelAndView("viewprofile", "user", new User(fName,lName,Username,email,Password));
    }
    
   
	
	
	
	@RequestMapping(value = "/profile")
    public String profile(@ModelAttribute("userForm") User user,ModelMap model,@RequestParam String action)
    {
    	if(action.equals("Save"))  // Save changes in database
    	{
    		System.out.println("User name is "+user.getuserName());
    		fName=userdao.save(user);
    		
    		model.addAttribute("fName", fName);
    		return "userLoggedin";    		
    	}
    	else // cancel changes
    	{
    		return "userLoggedin";
    	}
    
    }
}
