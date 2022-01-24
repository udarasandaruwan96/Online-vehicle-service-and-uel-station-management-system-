package supplier_DetaBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import supplier_Details.Supplier;




public class SupplierDB {

	//Serrver Name Is suplierDB
	private String jdbcURL = "jdbc:mysql://localhost:3306/suplierDB?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "123456789";
	private String jdbcDriver = "com.mysql.jdbc.Driver";

	//Table Name Is suppliers
	//insert 
	private static final String INSERT_ITMES_SQL = "insert into suppliers" + "  (item_name, item_material,item_country,supplier_name,supplier_email,supplier_phone,supplier_address) VALUES " 
	+ " (?, ?, ?, ?,?, ?, ?)";

	private static final String SELECT_ITMES_BY_ID = "select id,item_name, item_material,item_country,supplier_name,supplier_email,supplier_phone,supplier_address from suppliers where id =?";
	
	private static final String SELECT_ALL_ITMES = "select * from suppliers";
	//update 
	private static final String UPDATE_ITMES_SQL = "update suppliers SET item_name =?, item_material =?, item_country =?,supplier_name =?,supplier_email =?,supplier_phone =?,supplier_address =? where id = ?";
	//delete 
	private static final String DELETE_ITMES_SQL = "delete from suppliers where id = ?;";

	public SupplierDB() {
	}
	
	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(jdbcDriver);
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
//Insert Supplier
	public void insertSupplier(Supplier supplier) throws SQLException {
		System.out.println(INSERT_ITMES_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ITMES_SQL)) {
			preparedStatement.setString(1, supplier.getItem_name());
			preparedStatement.setString(2, supplier.getItem_material());
			preparedStatement.setString(3, supplier.getItem_country());
			preparedStatement.setString(4, supplier.getSupplier_name());
			preparedStatement.setString(5, supplier.getSupplier_email());
			preparedStatement.setString(6, supplier.getSupplier_phone());
			preparedStatement.setString(7, supplier.getSupplier_address());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	
	
//slect Supplier by itemID
	public Supplier selectSupplier (int id) {
		Supplier supplier = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ITMES_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				
				String item_name = rs.getString("item_name");
			    String item_material = rs.getString("item_material");
				String item_country = rs.getString("item_country");
				String supplier_name = rs.getString("supplier_name");
				String supplier_email = rs.getString("supplier_email");
				String supplier_phone = rs.getString("supplier_phone");
				String supplier_address = rs.getString("supplier_address");
				
				supplier = new Supplier(id,item_name, item_material,item_country,supplier_name,supplier_email,supplier_phone,supplier_address);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return supplier;
	}

	
//Select all Supplier for suplierDB
	public List<Supplier> selectAllSupplier() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Supplier> supplier = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ITMES);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				
				int id = rs.getInt("id");
				String item_name = rs.getString("item_name");
			    String item_material = rs.getString("item_material");
				String item_country = rs.getString("item_country");
				String supplier_name = rs.getString("supplier_name");
				String supplier_email = rs.getString("supplier_email");
				String supplier_phone = rs.getString("supplier_phone");
				String supplier_address = rs.getString("supplier_address");
				
				supplier.add(new Supplier(id,item_name, item_material,item_country,supplier_name,supplier_email,supplier_phone,supplier_address));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		//return DBName (table name)
		return supplier;
	}
	
	
	
	
//Delete Supplier
	public boolean deleteSupplier(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_ITMES_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	
	
	
//Update Supplier
	public boolean updateSupplier(Supplier supplier) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_ITMES_SQL);) {
			System.out.println("updated Supplier:"+statement);
			
			statement.setString(1, supplier.getItem_name());
			statement.setString(2, supplier.getItem_material());
			statement.setString(3, supplier.getItem_country());
			statement.setString(4, supplier.getSupplier_name());
			statement.setString(5, supplier.getSupplier_email());
			statement.setString(6, supplier.getSupplier_phone());
			statement.setString(7, supplier.getSupplier_address());
			statement.setInt(8,supplier.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
	
	
	
	
	
	private void printSQLException(SQLException ex) {
		// TODO Auto-generated method stub
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

	

}
