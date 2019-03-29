package Social;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Employee;

public class Operations  {

	
	

		public ArrayList<Employee> EmployeeList()
		{
			
			ArrayList<Employee> Employee = new ArrayList<>();
			
			try{  
		     	Class.forName("com.mysql.jdbc.Driver");  
		     	Connection con=DriverManager.getConnection(
		     			"jdbc:mysql://localhost:3306/Social?verifyServerCertificate=false&useSSL=true","root","blaster");  
		     	String quert4="select * from Employee EName";
		     	Statement pst4= con.createStatement();
		     	ResultSet rs = pst4.executeQuery(quert4);
		     	Employee emp;
		     	while(rs.next())
		     	{
		     		emp=new Employee(rs.getString("EName"),rs.getString("pass"),rs.getString("Job"),rs.getInt("Age"), rs.getString("Email"));
		     		Employee.add(emp);
		     	}
		     	
		     	}catch(Exception o){
		     		System.out.println(o);
		     	}
			
			
			return Employee;
			
		}
		
		public void snowE() {
			ArrayList<Employee> list = EmployeeList();
			
		}
		
}
