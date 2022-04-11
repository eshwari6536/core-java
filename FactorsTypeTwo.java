package Loops;

import java.util.Scanner;

public class FactorsTypeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,sum1=0;
		Scanner ftt=new Scanner(System.in);
		System.out.println("enter the number");
		int no_1=ftt.nextInt();
		int no_2=no_1;
		for( i=1;i<no_1;i++) {
			if(no_1%i==0) {
				//continue;
				sum1 +=i;
				System.out.print(i+" ");
				//System.out.println(" ");
			}
		}
		//System.out.println(" ");
		if(no_1==sum1) {
			System.out.println(" ");
			System.out.println("the sum is: "+sum1);
			System.out.println(no_1+" is perfect number");
		}
		else {
			System.out.println(no_1+" is not perfect number");
			
				
			
		}

	
}
}

