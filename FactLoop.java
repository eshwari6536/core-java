package Loops;

import java.util.Scanner;

public class FactLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact_o=1,num;
		Scanner fl = new Scanner(System.in);
		System.out.println("enter the number");
		 num = fl.nextInt();
		for(i=num;i>=1;i--) {
			fact_o=fact_o*i;
			/*f_o=5*1=5
			 * f_o=5*4=20
			 * f_o=20*3=60
			 * f_o=60*2=120
			 * f_o=120*1=120
			 */
			System.out.println("factorial of number "+fact_o);

		}
		//System.out.println("factorial of number "+fact_o);
	}

}
