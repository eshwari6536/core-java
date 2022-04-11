package Loops;

import java.util.Scanner;

public class ForIsp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count,prime=1;
Scanner ip = new Scanner(System.in);
System.out.println("Enter the number");
int isprime_num = ip.nextInt();
for(count=2;count<=isprime_num/2;count++) {
	if(isprime_num%count==0)
	{
		 prime=0;
	}
	switch(prime) {
	
	case 1:
		System.out.println(isprime_num+" is a prime no");
		break;
		default:
			System.out.println(isprime_num+" is not prime no");
}
	}

}
}
