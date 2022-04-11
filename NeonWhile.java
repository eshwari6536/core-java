package Loops;

import java.util.Scanner;

public class NeonWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dig,sigma=0;
Scanner no=new Scanner(System.in);
System.out.println("enter the number:");
int us_no=no.nextInt();		//user input=9
int us_no1=us_no*us_no;		//9*9=81
System.out.println("the square of the number is: "+us_no1);
int us_no2=us_no;
while(us_no1>0) {		//81>0,8>0,0>0(f)-out of the loop
	dig=us_no1%10;		//81%10=1,8%10=8
	sigma +=dig;		//0+1+8=9
	us_no1=us_no1/10;	//8/10=0
}
System.out.println(" the sum of the digits of the square of the number is: "+sigma);
if(sigma==us_no2) {
	System.out.println(us_no2+" is a neon number");
}
	else
		System.out.println(us_no2+" is not a neon number");
}
	}


