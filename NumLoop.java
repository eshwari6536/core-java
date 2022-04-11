package pack1;

import java.util.Scanner;

public class NumLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a;
		int i,sum,num;
		i=1;
		sum=0;
	//int b = 50;
	//int i,num,sum;
		Scanner nl=new Scanner(System.in);
	System.out.println("enter the number to find sum");
	num = nl.nextInt();
	
	
		/*a = 1;
		while(a<=50)
		{
			System.out.println(a);
			++a;
			
		
		}*/
		/*while(b>=1)
		{
			
		System.out.println(b);
		b--;
	}*/
		while(i<=num) {
			sum=sum+i;
			i++;
			//System.out.println(" the sum of first 50 numbers is "+sum);
			//i++;
			System.out.println(" the sum of first 50 numbers is "+sum);
			
		}
		//System.out.println(" the sum of first "+num+" numbers is "+sum);
}
}
