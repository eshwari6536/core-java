package pack1;

import java.util.Scanner;

public class MarRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ra;
		Scanner mo1 = new Scanner(System.in);
		System.out.println("enter the grade");
		ra = mo1.next().charAt(0);
		if(ra == 'A' || ra == 'a') {
			System.out.println("marks lie between 90 & 100");
			
		}
		else if(ra == 'B' || ra == 'b') {
			System.out.println("marks lie between 60 & 89");
			
		}
		else if(ra == 'C' || ra == 'c') {
			System.out.println("marks lie between 40 & 59");
			
		}
		else if(ra == 'D' || ra == 'd') {
			System.out.println("marks lie between 0 & 39");
			
		}
		else
		
			System.out.println("grade invalid");
		

	
}
}

	


