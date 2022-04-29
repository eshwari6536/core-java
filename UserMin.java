package myproj;

import java.util.Scanner;

public class UserMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner um = new Scanner(System.in);
		System.out.println("enter the first number");
		double a = um.nextDouble();
		System.out.println("enter the second number");
		double b = um.nextDouble();
		double large = (a>b)?a:b;
		System.out.println("the largest of "+a+" and "+b+" is "+large);
		
		/*System.out.println("enter the first number");
		double x = um.nextDouble();
		System.out.println("enter the second number");
		double y = um.nextDouble();
		System.out.println("enter the third number");
		double z = um.nextDouble();
		double min = (x<y && x<z)?x:(y<x && y<z)?y:z;
		System.out.println("the smallest of "+x+" , "+y+" and "+z+" is "+min);*/
		
	}

}
