package com;

import javax.servlet.RequestDispatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CtLoginAction extends TagSupport{
	private String stuname,stupass;

	public String getStuname() {
		return stuname;
	}





	public void setStuname(String stuname) {
		this.stuname = stuname;
	}





	public String getStupass() {
		return stupass;
	}





	public void setStupass(String stupass) {
		this.stupass = stupass;
	}





	@Override
	public int doEndTag() throws JspException {
		JspWriter out=pageContext.getOut();
		if(stuname!=""&&stupass!="") {
		DBCon dbcon=new DBCon();
		boolean valid=dbcon.checkUser(stuname, stupass);
		boolean validflag=dbcon.checkFlag(stuname,stupass);
		
		if(valid) {
			if(validflag) {
				
				try {
					pageContext.getRequest().setAttribute("stuname", stuname);
					pageContext.getRequest().setAttribute("stupass", stupass);
					RequestDispatcher rd = pageContext.getServletContext().getRequestDispatcher("/welcome.jsp");
					rd.forward(pageContext.getRequest(), pageContext.getResponse());
				}catch(Exception e) {e.printStackTrace();}
			} else {
				
				try {
					out.println("This account is already logged in... try logging with another account");
					}catch(Exception e) {e.printStackTrace();}
			}
		}else{
			try {
				RequestDispatcher rd = pageContext.getServletContext().getRequestDispatcher("/register.jsp");
				rd.forward(pageContext.getRequest(), pageContext.getResponse());
				}catch(Exception e) {e.printStackTrace();}}}
			
else {
				
				try {
					out.println("something went wrong");
					}catch(Exception e) {e.printStackTrace();}
	}
		return super.doEndTag();
			
			
	}
	
	
}
