package com.deva.pojo;

public class User {
	String userName;
	String passWord;
	String status;
	public String getUserName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public User(String userName, String passWord ,String status) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.status=status;
	}

   public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
public User(){}
}
