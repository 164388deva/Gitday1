package com.deva.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deva.dao.InvalidUserException;
import com.deva.dao.UserDAO;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String userName,passWord;
		userName=request.getParameter("userName");
		passWord=request.getParameter("passWord");
		String userType="Invalid";
		try{
			userType=getUserType(userName,passWord);
		}
		catch(InvalidUserException a){
			out.print("Invalid Login Credentilas");
		}
		
		RequestDispatcher requestDispatcher=null;
		if(userType.equals("Admin")){
			
			requestDispatcher=request.getRequestDispatcher("/admin");
		}
		else if(userType.equals("User")){
			out.println("<h1>Welcome user</h1>"+userName);
			requestDispatcher=request.getRequestDispatcher("/user");
			}
		else{out.print("<h1>Invalid User</h1>");
			requestDispatcher = request.getRequestDispatcher("/invalid");
			
		}
		requestDispatcher.forward(request, response);
	}


	private String getUserType(String userName, String passWord) {
		// TODO Auto-generated method stub
		UserDAO dao=new UserDAO();
		return dao.getUserType(userName, passWord);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
				
	}

}
