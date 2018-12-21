package com.shoppingCart.ShoppingCart.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.shoppingCart.ShoppingCart.daoInterface.cartDao;
import com.shoppingCart.ShoppingCart.daoSupport.JdbcSupport;
import com.shoppingCart.ShoppingCart.pojo.UserTransaction;

public class CartDAO implements cartDao{
JdbcSupport jdbc_support;

	@Override
	public UserTransaction get(int id) {
		UserTransaction transaction =jdbc_support.getJdbcTemplate().query("select * from cartDetail where productid="+id,
				new ResultSetExtractor<UserTransaction>() {
					@Override
					public UserTransaction extractData(ResultSet rs)
							throws SQLException, DataAccessException {

						UserTransaction transaction = new UserTransaction();
						while (rs.next()) {
						
							transaction.setUserId(rs.getInt(5));
							transaction.setProductId(rs.getInt(1));
							transaction.setProductName(rs.getString(2));
							transaction.setPrice(rs.getDouble(3));
							transaction.setQuantity(rs.getInt(4));
							transaction.setTransactionId(rs.getInt(6));
						}
						return transaction;
					}

				});
		return transaction;
	}

	@Override
	public List<UserTransaction> getAll() {
		List<UserTransaction> AllTransaction=	jdbc_support.getJdbcTemplate().query("select * from cartDetail",
				new ResultSetExtractor<List<UserTransaction>>() {
					@Override
					public List<UserTransaction> extractData(ResultSet rs)
							throws SQLException, DataAccessException {

						List<UserTransaction> list = new ArrayList<UserTransaction>();
						while (rs.next()) {
							UserTransaction userT = new UserTransaction();
							userT.setUserId(rs.getInt(5));
							userT.setProductId(rs.getInt(1));
							userT.setProductName(rs.getString(2));
							userT.setPrice(rs.getDouble(3));
							userT.setQuantity(rs.getInt(4));
							userT.setTransactionId(rs.getInt(6));
							list.add(userT);
						}
						return list;
					}

				});
		return AllTransaction;
	}

	@Override
	public int add(UserTransaction userTransaction) {
		String query = "insert into cartDetail values('" + userTransaction.getProductId()
				+ "','" + userTransaction.getProductName() + "','"
				+ userTransaction.getPrice() + "','"
				+ userTransaction.getQuantity() + "','"
			   + userTransaction.getUserId()+ "','"
								+ userTransaction.getTransactionId()+ "')";
		return jdbc_support.getJdbcTemplate().update(query);
		
	}

	@Override
	public int remove(int id) {
		String query = "delete from cartDetail where transactionId='"
				+id+ "' ";
		return jdbc_support.getJdbcTemplate().update(query);
	}

	@Override
	public int update(UserTransaction usertransaction) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean contains(int id) {
		// TODO Auto-generated method stub
		UserTransaction tr=get(id);
		if(tr==null){
		return false;
		}
		return true;
	}

	@Override
	public String pushIntoDB() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
