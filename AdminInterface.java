package bus.reservation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.sql.Connection;
import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//import java.sql.Statement;
import java.text.SimpleDateFormat;
public class AdminInterface {
	//static Connection conec;
	//static PreparedStatement ppt;
	//static Statement stmnt;
	//static ResultSet res;
	//static boolean flag;
	static String Ad_uid;
	//static long uid1;
	
	public static void main(String[] args) throws IOException, SQLException {
		
		  Date date1=null;	
	
	Scanner sr=new Scanner(System.in);
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	InputStreamReader ir= new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ir);
	
	
		System.out.println("Enter your Aadhar Number to login");
		do {
			System.out.println("Enter your unique Aadhar Number");
			Ad_uid=sr.next();
			try 
			{  
				if(Ad_uid.length()==12) {
				Long.parseLong(Ad_uid);
				  String icon = "😎COOL(✿◠‿◠)"; 
				  System.out.println( icon ) ;
				System.out.println(Ad_uid + " You are Authenticated!! ");
				break;
				}
			}  
			catch (NumberFormatException e)  
			{ 
				 String icon = "🤖( ╯□╰ )"; 
				  System.out.println( icon ) ;
				System.out.println(Ad_uid + " UHMM,Its only 12 Digits..."); 
			} 
		
		}while(true);
		System.out.println("Enter Admin_ID");
		int Ad_Id=sr.nextInt();
		System.out.println("Enter Admin_Name");
		String Ad_Name=sr.next();
		System.out.println("Enter Admin_EmailID");
		String Ad_Email=sr.next();
		System.out.println("Enter Admin_birthdate");
		 String Ad_DOB = sr.next();
		System.out.println("Enter Admin_Office");
		String Ad_Address=sr.next();
		System.out.println("check");
	}
}





		
		

