package changes.bus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

import bus.reservation.BusOperations;

public class UserLogin {

	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc   = new Scanner(System.in);
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		BusOperations obj1 = new BusOperations();
		BusOperations obj2 = new BusOperations();
		//User Login Portal(User Interface) 
		System.out.println(" π¦ Login Successful π¦ ");
		System.out.println(" ππ» Please select an option from below: ππ» ");
		System.out.println("1.Do you want to continue as 'Bus Admin' π©π»βπ» ");
		System.out.println("2.Do you want to continue as 'Normal Passenger' π¨π»βπ¦° ");
		System.out.println("3.Do  you want to Exit ππ»ββοΈ ");
		System.out.println(" ππ» Please enter your choice: ππ» ");
		int ch = sc.nextInt();
			switch(ch) {
			//Admin Login Portal(Admin Interface)
			case 1: System.out.println("Now you are BUS ADMIN");
					System.out.println("A. β€΅  Add Passenger");
					System.out.println("B. π Update Passenger"); 
					System.out.println("C. β Delete Passenger");
					System.out.println("D. πΊπ»  Exit");
					System.out.println(" ππ» Please enter your choice: ππ» ");
					int uch = sc.next().charAt(0);
					switch(uch) {
					
						
						case 'A':obj1.insertRecord1();
						        break;
						case 'B':obj1.updateRecord1();
						        break;
					case 'C': obj1.deleteRecord1();
					         break;
					case 'D': System.out.println(" π£ Exited π£ ");
			         break;
			         default: System.exit(0);
				}
						System.out.println("Do you want to continue Y β / N β π¬ ");
						char choice=br1.readLine().charAt(0);
						if(choice=='N' || choice=='n') {
							System.out.println("ππ» You have exited ππ» ");//exit of admin interface
							break;
						}
		//Passenger Login Portal(Passenger Interface) to access Buss Pass
			case 2: System.out.println("Now you are NORMAL PASSENGER");
			System.out.println("A. β€΅  Add    BussPass");
			System.out.println("B. π Update BussPass"); 
			System.out.println("C. β Delete BussPass");
			System.out.println("D. πΊπ»  Exit");
			System.out.println(" ππ» Please enter your choice: ππ» ");
			int uch1 = sc.next().charAt(0);
			switch(uch1) {
				       case 'A':obj2.insertRecord2();
				               break;
					
					   case 'B':obj2.updateRecord2(); 
					          break; 
					   case 'C': obj2.deleteRecord2(); 
					          break;
					   case 'D': System.out.println(" π£ Exited π£ ");
				         break;
				         default: System.exit(0);
		}
				System.out.println("Do you want to continue Y β / N β π¬ ");
				
				 char choice1=br1.readLine().charAt(0); 
				 if(choice1=='N' || choice1=='n') {
					 System.out.println("ππ» You have exited ππ» ");//exit of passenger interface
				 break; 
				 }
				 
				default:System.out.println(" π€π» Thank you please visit again π€π» "); //exit of user interface
					}
					}
			}
	


