package Loops;

import java.util.Scanner;

public class ForOe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int even_sum=0;
		int odd_sum=0;
		Scanner fo = new Scanner(System.in);
		System.out.println("enter the number");
		int num = fo.nextInt();
		for(i=1;i<=num;i++) {
			if(i%2==0) {
				even_sum=even_sum+i;
			}
			else
			{
				odd_sum=odd_sum+i;

		    }
		
		System.out.println("even sum"+even_sum);
		System.out.println("odd sum"+odd_sum);
	}
		/*System.out.println("even sum "+even_sum);
		System.out.println("odd sum "+odd_sum);*/
	}
}
		
	

