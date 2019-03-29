package Model;
import java.sql.*; 
import javax.swing.*;

public class SqlConnection {

	public static Connection db() {
	 try{  
     	Class.forName("com.mysql.jdbc.Driver");  
     	Connection con=DriverManager.getConnection(
     			"jdbc:mysql://localhost:3306/Social?verifyServerCertificate=false&useSSL=true","root","blaster");  
     	Statement stmt=con.createStatement();  
     	ResultSet rs=stmt.executeQuery("select * from emp");  
     	JOptionPane.showMessageDialog(null,"Connection Succesful");
     	while(rs.next())  
     		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
     		con.close();  
     	}catch(Exception e){
     		System.out.println(e);
     	}
	return null;  
	}
}
