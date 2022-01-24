package supplier_CRUD_Operation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import supplier_DetaBase.SupplierDB;
import supplier_Details.Supplier;




@WebServlet("/")
public class SupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private SupplierDB supplierDB;
	
	public void init() throws ServletException 
	
	{
		supplierDB = new SupplierDB();
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		doGet(request, response);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String action =request.getServletPath();
		
			switch(action) {
			case "/new":
				showNewForm(request, response);
				break;
				
			case "/insert":
				try {
				insertSupplier(request, response);
				} catch (SQLException e){
					e.printStackTrace();
				}
				break;
				
			case "/delete":
				try {
				deleteSupplier(request, response);
				} catch (SQLException e){
					e.printStackTrace();
				}
				break;
				
			case "/edit":
				try {
				showEditForm(request, response);
				} catch (SQLException e){
					e.printStackTrace();
				}
				break;
				
			case "/update":
				try {
				updateSupplier(request, response);
				} catch (SQLException e){
					e.printStackTrace();
				}
				break;
				
			default:
				try {
				listSupplier(request, response);
				} catch (SQLException e){
					e.printStackTrace();
				}
				break;
				
			}
	
		}



	private void showNewForm(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
			
	{
		RequestDispatcher dispatcher = request.getRequestDispatcher("Supplier_servlet_Form.jsp");
		dispatcher.forward(request, response);
	}

	
	
	//Insert Supplier
	private void insertSupplier(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException 
	{
		
		
		String item_name = request.getParameter("item_name");
	    String item_material = request.getParameter("item_material");
		String item_country = request.getParameter("item_country");
		String supplier_name = request.getParameter("supplier_name");
		String supplier_email = request.getParameter("supplier_email");
		String supplier_phone = request.getParameter("supplier_phone");
		String supplier_address = request.getParameter("supplier_address");
		
		Supplier newSupplier = new Supplier(item_name, item_material,item_country,supplier_name,supplier_email,supplier_phone,supplier_address);
		supplierDB. insertSupplier (newSupplier);
		response.sendRedirect("list");
	}
	
	
	//Delete Supplier
	private void deleteSupplier(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		try {
		    supplierDB.deleteSupplier(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("list");
	}

	
	//Edit Supplier
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)throws SQLException, ServletException, IOException 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		
		Supplier existingSupplier;
		
		try {
		existingSupplier  = supplierDB.selectSupplier(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Supplier_servlet_Form.jsp");
		request.setAttribute("supplier", existingSupplier );
		dispatcher.forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	//Update Supplier
	private void updateSupplier(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException
	{
		int id = Integer.parseInt(request.getParameter("id"));
		String item_name = request.getParameter("item_name");
	    String item_material = request.getParameter("item_material");
		String item_country = request.getParameter("item_country");
		String supplier_name = request.getParameter("supplier_name");
		String supplier_email = request.getParameter("supplier_email");
		String supplier_phone = request.getParameter("supplier_phone");
		String supplier_address = request.getParameter("supplier_address");
		
		Supplier supplier = new Supplier(id, item_name, item_material,item_country,supplier_name,supplier_email,supplier_phone,supplier_address);
		supplierDB.updateSupplier(supplier);
		response.sendRedirect("list");
	}
	
	
	//Default Methord
	private void listSupplier(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException 
	
	{   try {
		List<Supplier> listSupplier = supplierDB.selectAllSupplier();
		request.setAttribute("listSupplier", listSupplier);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Supplier_servlet_List.jsp");
		dispatcher.forward(request, response);
	}catch (Exception e) {
		e.printStackTrace();
	}

	}
	
	
	
}
