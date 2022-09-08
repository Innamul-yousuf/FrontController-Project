package com;

import javax.servlet.RequestDispatcher;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CtRegisterAction extends TagSupport {
	private String stuname,stupass;
	private String stuclass;
	private String stuid;
	
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getStupass() {
		return stupass;
	}
	public void setStupass(String stupass) {
		this.stupass = stupass;
	}
	public String getStuclass() {
		return stuclass;
	}
	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
	}
	
	
	
	DBCon dbcon=new DBCon();
	@Override
	public int doEndTag() throws JspException {
		JspWriter out=pageContext.getOut();
		int addStatus=dbcon.register(stuname,stuid,stupass,stuclass);
			if(addStatus==1) {
				try {
					out.println("Successfully Registered");
					RequestDispatcher rd = pageContext.getServletContext().getRequestDispatcher("/login.jsp");
					rd.forward(pageContext.getRequest(), pageContext.getResponse());
					}catch(Exception e) {e.printStackTrace();}
			}
			else {
				try {
					out.println("Registration failed");
					}catch(Exception e) {e.printStackTrace();}
			}
			
		return super.doEndTag();
	}
	
}