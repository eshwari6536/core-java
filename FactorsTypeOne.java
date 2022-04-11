package Loops;

import java.util.Scanner;

public class FactorsTypeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
Scanner fto=new Scanner(System.in);
System.out.println("enter the number");
int no=fto.nextInt();

for( i=1;i<=no;i++) {
	if(no%i==0) {
		//continue;
		System.out.print(i+" ");
		sum +=i;
	}
	//else
		//System.out.println(sum+"is the sum ");
	
}
System.out.println();
System.out.println(sum+" is the sum ");
	
	}

}
