package pack1;

import java.util.Scanner;

public class CursaSw {
	public static void main(String args[]) {
		Scanner cs = new Scanner(System.in);
		System.out.println("********MENU******");
		System.out.println("1.German");
		System.out.println("2.Greek");
		System.out.println("3.Spanish");
		System.out.println("enter the course");
		String cr = cs.next();
		switch(cr) {
		case "German":
		case "german":	
			System.out.println("Your entered course is German ");
			
			break;
			
		
		case "Greek":
		case "greek":	
			System.out.println("Your entered course is Greek");
			break;


		case "Spanish" :
		case "spanish":	
			System.out.println("Your entered course is Spanish");
			break;
		default:
			System.out.println("invalid choice");
		
	}

}
}
