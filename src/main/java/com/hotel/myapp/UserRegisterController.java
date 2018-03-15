package com.hotel.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserRegisterController implements Controller{
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	{
		String name,contact,email,password;
		name=request.getParameter("name");
		contact=request.getParameter("contact");
		email=request.getParameter("email");
		password=request.getParameter("password");
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		User u=(User)ac.getBean("user");
		
		
		u.setName(name);
		u.setContact(contact);
		u.setEmail(email);
		u.setPassword(password);
		

		ModelAndView mv=new ModelAndView();
		
		AUDUser add=(AUDUser)ac.getBean("auduser");
		String result=add.addUser(u);
		if(result.equalsIgnoreCase("success"))
		{
			mv.setViewName("Success");
		}
		else
		{
			mv.setViewName("Failure");
		}
		
		return mv;
	}

}
