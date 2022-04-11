package Loops;

import java.util.Scanner;

public class IsprimeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//to check for prime
		  //int isprime_num;
		 // int n = 1;
		  Scanner iw = new Scanner(System.in);
		  System.out.println("Enter the number");
		  int isprime_num = iw.nextInt();
		 // int divi_count;

		  /*while (n <= 100) {
			  divi_count = 0;
			  isprime_num= 2;
		   while (isprime_num <= n / 2) {
		    if (n % isprime_num == 0) {
		    	divi_count++;
		     break;
		    }
		    isprime_num++;
		   }
		   if (divi_count == 0 && n != 1) {
		    System.out.print(n + " ");
		   }
		   n++;
		  }

		 }
		}*/
		  int i = 2, count = 0;
		 // System.out.println(i+" is the smallest prime number");
	        while (i <= isprime_num / 2) {
	            if (isprime_num % i == 0 && isprime_num  == i ) {
	            	//System.out.println(i+" is the smallest prime number");
	                count++;
	                break;
	            }
	            System.out.println(i+" is the smallest prime number");
	            i++;
	        }
	        if (count == 0) {
	            System.out.println(isprime_num + " is prime number");
	        } else {
	            System.out.println(isprime_num + " is not a prime number");
	        }
	    }
	}
	


