package Main;


import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.EventQueue;
import java.io.PrintStream;
import java.sql.*;  
import Gui.Gui1;
import Model.SqlConnection;



public class Main {
	
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui1 window = new Gui1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	
}

		
		
		 /*
	
		 
		 
		  
		  System.out.println("Social network!");
		 
		 /*
	      Scanner input = new Scanner (System.in);  

	      String username;
	      String password;


	      System.out.println("Social network!");
	      System.out.println("\nEnter your username and password.");    
	      System.out.println("Username: ");
	        username = input.nextLine();
	      System.out.println("Password: ");
	        password = input.nextLine();

	        User login = new User(username, password);

	        if(login.checkPassword())
	            System.out.println("You are logged in!");
	        else
	            System.out.println("Username or password is incorrect!");
	        
	        *//*
	    }
	}
*/
