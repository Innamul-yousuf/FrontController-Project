package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAction extends Action {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

		String stuname = request.getParameter("stuname");
		int stuid = Integer.parseInt(request.getParameter("stuid"));
		String stupass = request.getParameter("stupass");
		int stuclass = Integer.parseInt(request.getParameter("stuclass"));
		//int flag = Integer.parseInt(request.getParameter("flag"));

		DBCon dbcon = new DBCon();
		int add = dbcon.register(stuname, stuid, stupass, stuclass);
		if (add == 1) {
			return "register.success";
		} else {
			return "register.failure";
		}
	}
}