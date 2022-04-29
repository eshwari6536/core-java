package nestingrepeat;

import java.util.Scanner;

public class BetweenPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bp=new Scanner(System.in);
		System.out.println("enter the first number");
		int no1=bp.nextInt();
		System.out.println("enter the second number");
		int no2=bp.nextInt();
		System.out.println("the prime numbers between "+no1+" and "+no2+" is: ");
		
int i,j,c=0;
for(i=no1;i<=no2;i++) {
	c=0;
	for(j=1;j<=i;j++) {
		if(i%j==0 ) {
			c++;
		}
			
	}
	if(c==2) {
		if( i==23 || i==29) {
				
		continue;
		
	}
		//System.out.print("the numbers between"+no1+" and "+no2+" is: ");
		System.out.print(i+" ");
}
	}

}
}
