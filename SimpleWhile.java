package Loops;

import java.util.Scanner;

public class SimpleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,sumz=0;
		Scanner sw=new Scanner(System.in);
		System.out.println("enter the number:");
		int u_num2=sw.nextInt();
		
		while(u_num2>0) {    //126>0,12>0,1>0,0>0(F)out of loop
			d=u_num2%10;		//126%10=6,12%10=2,2%10=1
			sumz +=d;		//0+6+2+1
			u_num2=u_num2/10;  //12/10,1/10
			
		}
		System.out.println(" the sum of the digits of the number is: "+sumz);

	}

}
