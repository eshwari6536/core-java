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
		System.out.println(" 🦚 Login Successful 🦚 ");
		System.out.println(" 👇🏻 Please select an option from below: 👇🏻 ");
		System.out.println("1.Do you want to continue as 'Bus Admin' 👩🏻‍💻 ");
		System.out.println("2.Do you want to continue as 'Normal Passenger' 👨🏻‍🦰 ");
		System.out.println("3.Do  you want to Exit 🙅🏻‍♀️ ");
		System.out.println(" 🙏🏻 Please enter your choice: 🙏🏻 ");
		int ch = sc.nextInt();
			switch(ch) {
			//Admin Login Portal(Admin Interface)
			case 1: System.out.println("Now you are BUS ADMIN");
					System.out.println("A. ⤵  Add Passenger");
					System.out.println("B. 🔎 Update Passenger"); 
					System.out.println("C. ⛔ Delete Passenger");
					System.out.println("D. 🕺🏻  Exit");
					System.out.println(" 🙏🏻 Please enter your choice: 🙏🏻 ");
					int uch = sc.next().charAt(0);
					switch(uch) {
					
						
						case 'A':obj1.insertRecord1();
						        break;
						case 'B':obj1.updateRecord1();
						        break;
					case 'C': obj1.deleteRecord1();
					         break;
					case 'D': System.out.println(" 👣 Exited 👣 ");
			         break;
			         default: System.exit(0);
				}
						System.out.println("Do you want to continue Y ✅ / N ❎ 💬 ");
						char choice=br1.readLine().charAt(0);
						if(choice=='N' || choice=='n') {
							System.out.println("👋🏻 You have exited 👋🏻 ");//exit of admin interface
							break;
						}
		//Passenger Login Portal(Passenger Interface) to access Buss Pass
			case 2: System.out.println("Now you are NORMAL PASSENGER");
			System.out.println("A. ⤵  Add    BussPass");
			System.out.println("B. 🔎 Update BussPass"); 
			System.out.println("C. ⛔ Delete BussPass");
			System.out.println("D. 🕺🏻  Exit");
			System.out.println(" 🙏🏻 Please enter your choice: 🙏🏻 ");
			int uch1 = sc.next().charAt(0);
			switch(uch1) {
				       case 'A':obj2.insertRecord2();
				               break;
					
					   case 'B':obj2.updateRecord2(); 
					          break; 
					   case 'C': obj2.deleteRecord2(); 
					          break;
					   case 'D': System.out.println(" 👣 Exited 👣 ");
				         break;
				         default: System.exit(0);
		}
				System.out.println("Do you want to continue Y ✅ / N ❎ 💬 ");
				
				 char choice1=br1.readLine().charAt(0); 
				 if(choice1=='N' || choice1=='n') {
					 System.out.println("👋🏻 You have exited 👋🏻 ");//exit of passenger interface
				 break; 
				 }
				 
				default:System.out.println(" 🤝🏻 Thank you please visit again 🤝🏻 "); //exit of user interface
					}
					}
			}
	


