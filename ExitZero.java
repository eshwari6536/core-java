package Loops;

import java.util.Scanner;

public class ExitZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ez = new Scanner(System.in);
		int num=1;
		int even_sum=0;
		int odd_sum=0;
		while(num!=0) {
			
			System.out.println("enter the number");//printing of numbers while(num!=0)(T)- to enter sets of any thing
			int numb = ez.nextInt();
			num=numb;
		
			if(num==0)//(T)
			{
				
				break;// or to terminate the program-when num is 0(num!=0)(F)
			}
			if(numb%2==0)		//checks number to be even 
				
			{
				if(numb>0)		//checks if even number is positive
					even_sum +=numb;	//calculate sum{0+x+y+z...}

		    }
			if(numb%2!=0 && numb<0) {		//checks if  number is odd and checks if even number is negative
				odd_sum +=numb;
				
			}
		
		System.out.println("even sum "+even_sum);
		System.out.println("odd sum "+odd_sum);
	}

	}

}
/*here for checking if number is even and positive'
 *  if condition is not optimised like in negative odd loop,
 *   because AND operation is false when 0*1=0
 *   numb%2==0{0}*0 or *1=0{F}
 *   numb%2!=0{1}*1=1{T}else{F}
 * 
 */

