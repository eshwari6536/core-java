package pack1;

import java.util.Scanner;

public class TestAv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su1,su2,su3,su4,su5;
		Scanner ta = new Scanner(System.in);
		System.out.println("enter the name");
		String name = ta.next();
		System.out.println("enter the no of subs");
		int nos = ta.nextInt();
		System.out.println("enter the 1st sub");
		 su1 = ta.nextInt();
		System.out.println("enter the 2nd sub");
		 su2 = ta.nextInt();
		System.out.println("enter the 3rd sub");
		 su3 = ta.nextInt();
		System.out.println("enter the 4th sub");
		 su4 = ta.nextInt();
		System.out.println("enter the 5th sub");
		 su5 = ta.nextInt();
		//System.out.println("enter the 1st sub");
		//int nosub = ta.nextInt();
		 double avg1 = (su1+su2+su3+su4+su5)/5;
		 System.out.println("avg is "+avg1);
		

	}

}
