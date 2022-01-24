package com.Supplier;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			List<Supplier> supDetails = SupplierDBUtil.validate(userName, password);//call UserDB.java (validate)
			request.setAttribute("supDetails",supDetails);
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
			//call useraccount.jsp
			RequestDispatcher dis = request.getRequestDispatcher("supplieraccount.jsp");
			dis.forward(request, response);
    
			
	}

}
