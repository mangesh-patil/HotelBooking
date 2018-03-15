package com.hotel.myapp;

import org.springframework.jdbc.core.JdbcTemplate;

public class AUDUser {
	static JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public static String addUser(User u)
	{
		String result=" ";
		String query="insert into user (name, contact, email, password) values ('"+u.getName()+"','"+u.getContact()+"','"+u.getEmail()+"','"+u.getPassword()+"')";
		
		int i=template.update(query);
		if(i==1)
		{
			result="success";
		}
		else {
			result="failure";
		}
		return result;
	}

}
