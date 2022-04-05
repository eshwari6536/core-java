package bus.reservation;
import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;
//import java.sql.SQLException;
import java.util.Scanner;
public class PassengerInterface {
	static String Pasngr_Mobno;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr1=new Scanner(System.in);
		InputStreamReader ir1= new InputStreamReader(System.in);
		BufferedReader br1=new BufferedReader(ir1);
		System.out.println("Enter Passenger_id🆔");
		String Pasngr_id=sr1.next();
		System.out.println("Enter Passenger_Name✍");
		String Pasngr_Name=sr1.next();
		System.out.println("Enter Passenger_EmailID📧🆔");
		String Pasngr_Email=sr1.next();
		System.out.println("Enter Passenger_Password🔑");
		String Pasngr_Passwd=sr1.next();
		do {
		System.out.println("Enter Passenger_MobileNumber🔢");
		Pasngr_Mobno = sr1.next();
		
			
				if(Pasngr_Mobno.length()==10) {
					Long.parseLong(Pasngr_Mobno);
				System.out.println("📲Your registered number is "+Pasngr_Mobno);
				break;
				}
				else {
					System.out.println("Invalid phone number🧐");
				}
			
			
		}while(true);
		  
		  
		System.out.println("Enter Passenger_Address🏘");
		String Pasngr_Address=sr1.next();
		System.out.println("check");
	}

}
