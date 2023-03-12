package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
														//url //        					//username// password//
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");

		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("update eproduct set price=15000.00 where name='Tablet'");
		System.out.println("The row is update");
		
		ResultSet result = stmt.executeQuery("select * from eproduct");

		while (result.next()) {

			System.out.println("Product Id " + result.getInt("ID"));
			System.out.println("Product name " + result.getString("name"));
			System.out.println("product price " + result.getDouble("price"));
		}
		
		con.close();
	}

}
