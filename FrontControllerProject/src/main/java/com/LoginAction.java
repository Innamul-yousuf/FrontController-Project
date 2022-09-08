package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	// TODO Auto-generated method stub
	String stuname=request.getParameter("stuname");
	String stupass=request.getParameter("stupass");
	DBCon dbcon=new DBCon();
	boolean valid=dbcon.checkUser(stuname, stupass);
	boolean validflag=dbcon.checkFlag(stuname,stupass);
	if(valid) {
		if(validflag) {
		return "login.success";
		}
		else {
			return"login.logged";
		}

	}
	else {
		return "login.register";
	}
}
}
