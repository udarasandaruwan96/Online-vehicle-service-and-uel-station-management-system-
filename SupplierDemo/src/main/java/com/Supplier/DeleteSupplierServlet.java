package com.Supplier;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteSupplierServlet")
public class DeleteSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("supid");
		boolean isTrue;
		
		isTrue =SupplierDBUtil.deleteSupplier(id);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("supplierInsert.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Supplier> supDetails = SupplierDBUtil.getSupplierDetails(id);
			request.setAttribute("supDetails", supDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("supplieraccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}
	
}
