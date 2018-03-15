package com.hotel.myapp;

import org.springframework.jdbc.core.JdbcTemplate;

public class AdminLoginAction {
	JdbcTemplate template;
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	String adminid,adminpass;
	public String validate(String adminid,String adminpass)
	{
		String result;
		this.adminid=adminid;
		this.adminpass=adminpass;
		
		String query="select adminid from admin where adminid=? and adminpass=?";
		String id=template.queryForObject(query, new Object[] {adminid,adminpass}, String.class);
		if(id!=null)
		{
			result="success";
		}
		else
		{
			result="failure";
		}
		return result;
		    
	}
}
