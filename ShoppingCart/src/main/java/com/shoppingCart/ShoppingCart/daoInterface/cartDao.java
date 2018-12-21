package com.shoppingCart.ShoppingCart.daoInterface;

import java.util.List;

import com.shoppingCart.ShoppingCart.pojo.UserTransaction;

public interface cartDao {
public UserTransaction get(int id);
public List<UserTransaction> getAll();
public int add(UserTransaction userTransaction);
public int remove(int usertransaction);
public int update(UserTransaction usertransaction);
public boolean contains(int id);
public String pushIntoDB();
}
