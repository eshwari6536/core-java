package Loops;

import java.util.Scanner;

public class ArmWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit,sum=0,arm_num;
		Scanner aw= new Scanner(System.in);
		System.out.println("Enter the number");
		int arm_no = aw.nextInt();
		System.out.println("the number is "+arm_no);
		arm_num=arm_no;
		while(arm_num!=0) {
		 
		        digit = arm_num % 10;
		        sum += digit * digit * digit;// sum=sum+digit^3
		        arm_num=arm_num/10;
		    }

		System.out.println("the sum is "+sum);
		    if(sum == arm_no) 
		        System.out.println(arm_no+" is  an Armstrong Number ");
		    
		    else 
		    	 System.out.println(arm_no+"  is not an Armstrong Number ");
		    
		   


		}
		

	}


