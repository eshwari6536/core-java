package nestingrepeat;

import java.util.Scanner;

public class NestAssin4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0.0f;
		int n;
		long fact=1;
		int i,j;
		Scanner bp=new Scanner(System.in);
		System.out.println("enter the number");
		 n=bp.nextInt();
		 for(i=1;i<=n;i++) {
				
				for(j=1;j<=i;j++) {
					fact=fact*j;
				}
				if(i%2==0) {
					
				sum -= ((float)1/fact);
				}
				else {
					sum += ((float)1/fact);
				}
			}
		 
		 
		 System.out.println("sum of the given series is: "+sum);


	}

}
