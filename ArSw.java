package pack1;

import java.util.Scanner;

public class ArSw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		System.out.println("********MENU*********");
		System.out.println("1.Area of Circle");
		System.out.println("2.Area of Triangle");
		System.out.println("3.Area of Rectangle");
		System.out.println("enter the area of choice");
		int sa = as.nextInt();
		switch(sa) {
		case 1:
			System.out.println("enter the radius");
			int r =  as.nextInt();
			 double Ar1_circle = 3.14*r*r;
			System.out.println("Area of circle is : "+Ar1_circle);
			System.out.print(" ");
			break;
		
		case 2:
		
			System.out.println("enter the base");
			int bs =  as.nextInt();
			System.out.println("enter the height");
			int hs =  as.nextInt();
			double Ar_tri = 0.5*bs*hs;
			System.out.println("Area of triangle is : "+Ar_tri);
			System.out.println("");
		
		break;
		
		case 3:
			System.out.println("enter the length");
			int ln =  as.nextInt();
			System.out.println("enter the breadth");
			int bn =  as.nextInt();
			double Ar_rect = ln*bn;
			System.out.println("Area of rectangle is : "+Ar_rect);
			System.out.println("");
			break;
		default:
			System.out.println("invalid choice");
}
		
	}
}
