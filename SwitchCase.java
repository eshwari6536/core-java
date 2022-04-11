package pack1;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int days;
		Scanner sw = new Scanner(System.in);
		System.out.println("enter the number of days");
		int da = sw.nextInt();
		System.out.println("enter the day number");
		int days = sw.nextInt();
		switch(days) {
		case 1:
			System.out.println("Monday");
			//break;
			
		
		case 2:
			System.out.println("Tuesday");
			break;


		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		default:
			System.out.println("invalid input");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
			
		/*default:
			System.out.println("invalid input");
			*/

	}

}
}