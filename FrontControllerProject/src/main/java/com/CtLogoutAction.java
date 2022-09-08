package com;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CtLogoutAction extends TagSupport{
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
	DBCon dbcon=new DBCon();
	@Override
	public int doEndTag() throws JspException {
		JspWriter out=pageContext.getOut();
		boolean status=dbcon.reSetFlag(stuname, stupass);
		if(status) {
			try {
				RequestDispatcher rd = pageContext.getServletContext().getRequestDispatcher("/login.jsp");
				rd.forward(pageContext.getRequest(), pageContext.getResponse());
				}catch(Exception e) {e.printStackTrace();}
		}else {
			try {
				out.println("logout Failed");
				}catch(Exception e) {e.printStackTrace();}
		}
		return super.doEndTag();
	}
	
}
