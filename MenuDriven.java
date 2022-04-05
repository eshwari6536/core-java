 package bus.reservation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
public class MenuDriven {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		BusOperations ob = new BusOperations();
		BusOperations ob1 = new BusOperations();
		BusOperations ob2 = new BusOperations();
		while(true) {
			System.out.println("*****MENU***********");
			System.out.println(" 🚍 BUS ADMINSTRATION SYSTEM 🚍 ");
			System.out.println(" 🟢 Add Admin Data G");
			System.out.println(" 🟡 update Admin Data Y");
			System.out.println(" 🔴 Delete Admin Data R");
			System.out.println("Enter the option");
			int ch=Integer.parseInt(br.readLine());
			switch(ch) {
			case 1:ob.insertRecord();
			        break;
			case 2:ob.updateRecord();
			        break;
		case 3: ob.deleteRecord();
		         break;
	}
			System.out.println("Do you want to continue Y ✅ / N ❎ 💬 ");
			char choice=br.readLine().charAt(0);
			if(choice=='N' || choice=='n') {
				break;
			}
		}
		
	
	while(true) {
		System.out.println("*****MENU***********");//entire operation not limited only to admin 
		System.out.println(" 🚍 🧍🏻‍♀️ BUS PASSENGER RECORD 🚍 🧍🏻‍♂️ ");
		System.out.println(" 🟢 Add Passenger Data G");
		System.out.println(" 🟡 update Passenger Data Y");
		System.out.println(" 🔴 Delete Passenger Data R");
		System.out.println("Enter the option");
		int ch1=Integer.parseInt(br1.readLine());
		switch(ch1) {
		case 1:ob1.insertRecord1();
		        break;
		case 2:ob1.updateRecord1();
		        break;
	case 3: ob1.deleteRecord1();
	         break;
}
		System.out.println("Do you want to continue Y ✅ / N ❎ 💬 ");
		char choice=br1.readLine().charAt(0);
		if(choice=='N' || choice=='n') {
			break;
		}
	}
	

	while(true) {
		System.out.println("*****MENU***********"); 
		System.out.println(" 🚍 🎫🎫 BUS PASS RECORD 🚍 🎫🎫 ");
		System.out.println(" 🟢 Add Bus Pass Data G");
		System.out.println(" 🟡 update Bus Pass Data Y");
		System.out.println(" 🔴 Delete Bus Pass Data R");
		System.out.println("Enter the option");
		int ch2=Integer.parseInt(br1.readLine());
		switch(ch2) {
		case 1:ob2.insertRecord2();
		        break;
		case 2:ob2.updateRecord2();
		        break;
	case 3: ob2.deleteRecord2();
	         break;
}
		System.out.println("Do you want to continue Y ✅ / N ❎ 💬 ");
		char choice=br1.readLine().charAt(0);
		if(choice=='N' || choice=='n') {
			break;
		}
	}
	
}
}


