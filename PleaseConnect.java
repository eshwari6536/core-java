package what.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PleaseConnect {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 final String URL="jdbc:mysql://localhost:3306/cool";
		 final String UN="root";
		 final String PASS="root";
		 Connection conn=null;
		 Statement st=null;
		 Scanner sc= new Scanner(System.in);
		 try {
			   //1. Load the Driver
				Class.forName("com.mysql.cj.jdbc.Driver");//java.lang.ClassNotFoundException
				//2. Make a connection
				 conn=DriverManager.getConnection(URL,UN, PASS);
				//Connection conn=DriverManager.getConnection(""jdbc:mysql://localhost/edudb:3306",""root","root");
			   //3.create a Statement 
				  st=conn.createStatement();
				System.out.println("Connected...");
				/*
				 * System.out.println("Enter name"); String n=sc.nextLine();
				 * System.out.println("Enter id"); int id=sc.nextInt();
				 */
		 }
				catch(Exception e) {
					 e.printStackTrace();
				 }
				 finally {
					 st.close();
					 conn.close();
				 }
			}
		
		
	}


