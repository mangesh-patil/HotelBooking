package com.hotel.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AdminLogoutController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session=request.getSession();
		session.removeAttribute("adminid");
		session.invalidate();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("AdminLogin");
		return mv;
	}	

}
