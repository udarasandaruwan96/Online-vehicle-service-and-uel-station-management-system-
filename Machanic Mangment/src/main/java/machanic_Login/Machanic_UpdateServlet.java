package machanic_Login;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/Machanic_UpdateServlet")
public class Machanic_UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id = request.getParameter("macid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = Machanic_DB.updatemachanic(id, name, email, phone, username, password);
		
		if(isTrue == true) {
			
			List<Machanic> macDetails = Machanic_DB.getMachanicDetails(id);
			request.setAttribute("macDetails", macDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("Machanic_Account.jsp");
			dis.forward(request, response);
		}
		else {
			List<Machanic> macDetails =  Machanic_DB.getMachanicDetails(id);
			request.setAttribute("macDetails", macDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("Machanic_Account.jsp");
			dis.forward(request, response);
		}
	
	}

}
