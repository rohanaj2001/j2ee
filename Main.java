package test1;
import java.sql.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		String user = "root";
		String password = "password";
		String url = "jdbc:mysql://localhost:3306/test";
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("enter the id, name and password");
		int id = sc.nextInt();
		String name = sc.next();
		String pass= sc.next();
		PreparedStatement ps=con.prepareStatement("insert into user values(?, ?, ?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, pass);
		int i = ps.executeUpdate();
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from user");
		while(rs.next()) {
			System.out.println("The userId is : "+ rs.getInt("userId"));
			System.out.println("The name is : "+ rs.getString("name"));
			System.out.println("The password is : "+ rs.getString("pass"));
		}
		
			
	}
}
