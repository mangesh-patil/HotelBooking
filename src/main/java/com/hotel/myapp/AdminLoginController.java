package com.hotel.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.classic.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AdminLoginController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		
		String adminid=request.getParameter("adminid");
		String adminpass=request.getParameter("adminpass");
		ModelAndView mv=new ModelAndView();
		
		ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AdminLoginAction a=(AdminLoginAction)con.getBean("login");
	
		String result=a.validate(adminid, adminpass);
		if(result=="success")
		{
			HttpSession s=request.getSession();
			s.setAttribute("adminid",adminid);
			mv.setViewName("AdminHome");
			
		}
		else
		{
			mv.setViewName("AdminLogin");
		}
	
		return mv;
}
}
