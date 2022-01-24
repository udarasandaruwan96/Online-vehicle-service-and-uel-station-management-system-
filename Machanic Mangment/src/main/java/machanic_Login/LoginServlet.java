package machanic_Login;

import java.io.IOException;
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
		// TODO Auto-generated method stub
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			List<Machanic> macDetails = Machanic_DB.validate(userName, password);//call Machanic_DB.java (validate)
			request.setAttribute("macDetails",macDetails);
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
			//Machanic_Account.jsp
			RequestDispatcher dis = request.getRequestDispatcher("Machanic_Account.jsp");
			dis.forward(request, response);
    
			
	}

	

}
