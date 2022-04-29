package what.pack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FullConnectivity {
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/cool";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "root";
	
	public static Connection getConnection(){
		Connection conn = null;
		try{
			//Register the JDBC driver
			Class.forName(DB_DRIVER);
 
			//Open the connection
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
 
			if(conn != null){
			   System.out.println("Successfully connected.");
			}else{
			   System.out.println("Failed to connect.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
		public  MainJavaCrudOperations {
			static Connection conn=null;
			static Statement st=null;
			static Scanner sc;
			
			public static void selectRecord() throws SQLException {
				try {
					conn=FullConnectivity.getConnection();
					st=conn.createStatement();
					
					//select
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					conn.close();
				}
			}
			public static void updateRecord() {
				try {
					conn=FullConnectivity.getConnection();
					st=conn.createStatement();
					
					//update
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			public static void deleteRecord() {
				try {
					conn=FullConnectivity.getConnection();
					st=conn.createStatement();
					//delete
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
		public static void insertRecord() {
				try {
					conn=FullConnectivity.getConnection();
					st=conn.createStatement();
					
					//insert
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			public static void main(String[] args) throws SQLException {
				
				while(true) {
				System.out.println("**************MENU*********************");
				System.out.println("1.Add Record");
				System.out.println("2.Delete Record");
				System.out.println("3.Update Record");
				System.out.println("4.Display Record");
				sc=new Scanner(System.in);
				System.out.println("Enter your option");
				int ch=sc.nextInt();
				
				switch(ch) {
				case 1: MainJavaCrudOperations.insertRecord();
				         break;
				case 2: MainJavaCrudOperations.deleteRecord();
		        		break;
				case 3:MainJavaCrudOperations.updateRecord();
				break;
				case 4:MainJavaCrudOperations.selectRecord();
				break;
				         
				}
				System.out.println("Do you want to continue Y/N");
	
		char choice=sc.next().charAt(0);
				if(ch=='N' || ch=='n') {
					break;
				}
				}
		
			}
		
		}

	}

}
