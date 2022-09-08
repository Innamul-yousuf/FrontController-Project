package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	// TODO Auto-generated method stub
	String lstuname=request.getParameter("lstuname");
	String lstupass=request.getParameter("lstupass");
	DBCon dbcon=new DBCon();
	//boolean valid=dbcon.checkUser(stuname, stupass);
	
	boolean status=dbcon.reSetFlag(lstuname,lstupass);
	if(status) {
				return "logout.success";
				
		}
				
	else {
		return "logout.failure";
	}
}
}
