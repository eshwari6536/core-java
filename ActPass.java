package myproj;

import java.util.Scanner;

public class ActPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);//for user to give real-time input on the output console
		//System.out.println("Enter the Name:");
		
		System.out.println("Enter Age:");
		int usr_ag = scn.nextInt();
		scn.nextLine();
		System.out.println("Enter the Name:");
		String usr_ip = scn.next();
		System.out.println("Enter Gender Male/Female/Others:");//print st
		char usr_gen = scn.next().charAt(0);
		System.out.println("Enter Loan Amount:");// print st
		double usr_ln = scn.nextDouble();
		System.out.println("Entered Name is:"+usr_ip);
		System.out.println("Entered Age:"+usr_ag);
		System.out.println("Entered Gender:"+usr_gen);
		System.out.println("Entered Loan :"+usr_ln);
		
		/*Scanner sc1 = new Scanner(System.in);//for double
		System.out.println("entr d no.");
		double us_ip = sc1.nextDouble();
		System.out.println("entrd no. is");
		System.out.println(us_ip);
		
		Scanner scan2 = new Scanner(System.in);//for string
		System.out.println("entr d string:");
		String us_ip1 = scan2.nextLine();//string is used as a D.T
		System.out.println("entrd string is");
		System.out.println(us_ip1);*/

	}

}
