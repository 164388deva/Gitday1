package com.deva.dao;

import java.util.ArrayList;

import com.deva.pojo.User;

public class UserDAO {
ArrayList<User> userList;
public UserDAO(){
	userList=new ArrayList<User>();
	userList.add(new User("onkar","java","Admin"));
	userList.add(new User("Sachin","sql","User"));
	userList.add(new User("Deva","deva","Admin"));
	userList.add(new User("Chandu","cdeva","Admin"));
	
}
public String getUserType(String UserName,String Password){
	//userList.stream().filter(x->x.getUserName().equals(UserName) && x.getPassWord().equals(Password));
	
	for(User a:userList){
		if(a.getUserName().equals(UserName) && a.getPassWord().equals(Password)){
			return a.getStatus();
		}
	}throw  new InvalidUserException("incorrect login details......");

	
}

}
