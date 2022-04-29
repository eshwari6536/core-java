package myproj;

import java.util.Scanner;

public class UserArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Ar_circle, Ar_tri, Ar_rect;
		Scanner ua = new Scanner(System.in);
		System.out.println("enter the radius");
		int r =  ua.nextInt();
		Ar_circle = 3.14*r*r;
		System.out.println("Area of circle is : "+Ar_circle);
		System.out.print(" ");
		System.out.println("enter the base");
		int bs =  ua.nextInt();
		System.out.println("enter the height");
		int hs =  ua.nextInt();
		Ar_tri = 0.5*bs*hs;
		System.out.println("Area of triangle is : "+Ar_tri);
		System.out.println("");
		
		System.out.println("enter the length");
		int ln =  ua.nextInt();
		System.out.println("enter the breadth");
		int bn =  ua.nextInt();
		Ar_rect = ln*bn;
		System.out.println("Area of rectangle is : "+Ar_rect);
		
		
		
		
		

	}

}
