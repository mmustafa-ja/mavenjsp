package com.maven.web.model;

public class User {
	private int UserID;
	private String Username;
	private int score;
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "User [UserID=" + UserID + ", Username=" + Username + ", score=" + score + "]";
	}
	
	
	

}
