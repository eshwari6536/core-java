package Loops;

import java.util.Scanner;

public class NivenWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int d,u_num1,sumz=0;
Scanner nw=new Scanner(System.in);
System.out.println("enter the number:");
int u_num=nw.nextInt();
u_num1=u_num;
while(u_num>0) {    //126>0,12>0,1>0,0>0(F)out of loop
	d=u_num%10;		//126%10=6,12%10=2,2%10=1
	sumz +=d;		//0+6+2+1
	u_num=u_num/10;  //12/10,1/10
	
}
System.out.println(" the sum of the digits of the number is: "+sumz);
if(u_num1%sumz==0) {
	System.out.println(u_num1+" is a niven number");
}
	else
		System.out.println(u_num1+" is not a niven number");
}
	}


