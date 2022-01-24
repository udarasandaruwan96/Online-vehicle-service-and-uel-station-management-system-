package machanic_Login;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Machanic_DeleteServlet")
public class Machanic_DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("macid");
		boolean isTrue;
		
		isTrue =Machanic_DB.deleteMachanic(id);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Machanic_Insert.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Machanic> macDetails = Machanic_DB. getMachanicDetails(id);
			request.setAttribute("macDetails", macDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Machanic_Account.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}

}
