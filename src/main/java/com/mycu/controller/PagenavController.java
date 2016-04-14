package com.mycu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycu.model.User;
@Controller
public class PagenavController 
{
	 @RequestMapping(value = "/dbupdate", method = RequestMethod.POST)
	 public String dbUpdate(ModelMap model,@RequestParam String action) 
	 {
		 if(action.equals("Save"))  // Save changes to the database
	    	{
	    		return "userLoggedin";    		
	    	}
	    	else // cancel changes
	    	{
	    		return "userLoggedin";
	    	}
		 
	 }
	 @RequestMapping(value = "/Search")
	 public String Search() 
	 {
		return "Search"; 
	 }
	 @RequestMapping(value = "/MyLists-Ratings")
	 public String myLists()  //By default ratings page
	 {
		return "MyLists"; 
	 }
	 @RequestMapping(value = "/Ignore")
	 public String ignoreList()  
	 {
		return "Ignorelist"; 
	 }
	
	 @RequestMapping(value = "/Wish")
	 public String myWishlist() 
	 {
		return "Wishlist"; 
	 }
	
	 
	
}
