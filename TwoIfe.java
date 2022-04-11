package pack1;

import java.util.Scanner;

public class TwoIfe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2;
		Scanner ti = new Scanner(System.in);
		System.out.println("enter the first number ");
		no1 = ti.nextInt();
		System.out.println("enter the second number ");
		no2 = ti.nextInt();
		if(no1 > no2) {
			System.out.println("the largest no is "+no1);
		}
		 else if(no2>no1) {
			 System.out.println("the largest no is "+no2); 
			
		}
		 else
			 System.out.println("the numbers are equal "); 
			
		

	}

}
