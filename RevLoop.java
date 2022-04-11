package Loops;

import java.util.Scanner;

public class RevLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no_w1,i,dig,rev=0;
		//int no_w11=no_w1;error in compilation
		Scanner rl = new Scanner(System.in);
		System.out.println("enter the number");
		 no_w1 = rl.nextInt();
		 int no_w11=no_w1;
		 while(no_w1>0)
		 {
			dig=no_w1%10;
			 rev = rev * 10 + dig;
			no_w1=no_w1/10;
			//System.out.println("reverse"+rev);
			
			
			
		 }
		 System.out.println("reverse "+rev);
		// System.out.println();
		/* System.out.println("reverse "+rev);
		 
		 if(no_w11==rev) {
			 System.out.println(rev+" is a palindrome");
		 }
			 else {
				 System.out.println(rev+" is  not a palindrome"); 
		 }*/
		 }

	
}

