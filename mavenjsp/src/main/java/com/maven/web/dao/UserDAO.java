package com.maven.web.dao;

import java.sql.*;

import com.maven.web.model.User;

public class UserDAO {
	
	public User getUser(int userid) {
		User user=new User();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/maven","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from users where UserID="+userid);
			if(rs.next()) {
				user.setUserID(rs.getInt("UserID"));
				user.setUsername(rs.getString("Username"));
				user.setScore(rs.getInt("Score"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	return user;
	
	}
	

}
