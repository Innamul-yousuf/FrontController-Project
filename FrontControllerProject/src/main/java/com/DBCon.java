package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBCon {
	
	public DBCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean checkUser(String stuname,String stupass) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","Innamul@mysql");
			PreparedStatement ps=con.prepareStatement("select * from users1 where stuname=? and stupass=?");
			ps.setString(1,stuname);
			ps.setString(2,stupass);
			ResultSet rs=ps.executeQuery();
			int result1=0;
			if(rs.next()) {	
				return true;
				
			}
			else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean checkFlag(String stuname,String stupass) {
		
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","Innamul@mysql");
			PreparedStatement ps=con.prepareStatement("select flag from users1 where stuname=? and stupass=?");
			ps.setString(1, stuname);
			ps.setString(2, stupass);
			ResultSet rs=ps.executeQuery();
			int result1=0;
			if(rs.next()) {
				result1=rs.getInt(1);
			}
			if (result1==0) {
			 con= DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","Innamul@mysql");
				PreparedStatement psu=con.prepareStatement("update users1 set flag=1 where stuname=? and stupass=?");
				psu.setString(1, stuname);
				psu.setString(2, stupass);
				psu.executeUpdate();
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean reSetFlag(String stuname,String stupass) {
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","Innamul@mysql");
			PreparedStatement psr=con.prepareStatement("update users1 set flag=0 where stuname=? and stupass=?");
			psr.setString(1,stuname);
			psr.setString(2,stupass);
			psr.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public int register(String stuname,String stuid,String stupass,String stuclass) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","Innamul@mysql");
			PreparedStatement ps=con.prepareStatement("insert into users1 values (?,?,?,?,?)");
			
			ps.setString(1, stuname);
			ps.setString(2, stuid);
			ps.setString(3, stupass);
			ps.setString(4, stuclass);
			ps.setInt(5, 0);
			
		
			ps.executeUpdate();
			return 1;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		DBCon dbcon=new DBCon();
		int add=0;
		//dbcon.register("qavi",8022,"qavi123",9);
		//System.out.println(add+" user added..");
		//System.out.println(dbcon.checkUser("ravi", "ravi123"));
		//System.out.println(dbcon.reSetFlag("pavi", "pavi123"));
		dbcon.reSetFlag("ravi", "ravi123");
		dbcon.reSetFlag("kavi", "kavi123");
		dbcon.reSetFlag("Innamul", "Innamul123");
		dbcon.checkFlag("Abi", "Abi123");
	}
}


