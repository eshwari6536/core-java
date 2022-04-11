package Loops;

import java.util.Scanner;

public class HappyWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dig1,dig2,sigma1=0;
		Scanner hw=new Scanner(System.in);
		System.out.println("enter the number:");
		int us_no1=hw.nextInt();		//user input=31
		int us_no2=us_no1;
		int sigma2=sigma1;
		
		while(us_no1>0) {		//31>0,3>0,0>0(f)
			dig1=us_no1%10;		//31%10=1,3%10=3
			sigma1 +=dig1*dig1;		//0+1*1+3*3=10
			us_no1=us_no1/10;		//3/10
		}
		System.out.println(" the sum of the digits of the square of the number is: "+sigma1);//10
		
			while(sigma1>0) {				//10>=1,1>=1(t)
				dig2=sigma1%10;		//10%10=0,1%10=1
				sigma2 +=dig2*dig2;		//0+0*0+1*1=1
				sigma1=sigma1/10;
				//System.out.println(" the sum of the digits of the square of the number is: "+sigma3);//1
			}
			System.out.println(" the sum of the digits of the square of the number is: "+sigma2);//1
			 if(sigma2==1) {
			System.out.println(us_no2+" is a happy number");
		}
			else {
				System.out.println(us_no2+" is not a happy number");
		}
			}
	}

	


