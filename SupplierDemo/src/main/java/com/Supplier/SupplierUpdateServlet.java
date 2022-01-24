package com.Supplier;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SupplierUpdateServlet")
public class SupplierUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String id = request.getParameter("supid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = SupplierDBUtil.updatesupplier(id, name, email, phone, username, password);
		
		if(isTrue == true) {
			
			List<Supplier> supDetails = SupplierDBUtil.getSupplierDetails(id);
			request.setAttribute("supDetails", supDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("supplieraccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<Supplier> supDetails =  SupplierDBUtil.getSupplierDetails(id);
			request.setAttribute("supDetails", supDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("supplieraccount.jsp");
			dis.forward(request, response);
		}
	
	}

}
