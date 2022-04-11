package pack1;

import java.util.Scanner;

public class EbBil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int units;
		float amt;
		Scanner un = new Scanner(System.in);
		System.out.println("enter the units");
		units = un.nextInt();
		if(units<100) {
			amt = units*0.8f;
			System.out.println();
			
		}
		else if(units>=100 && units<=300 ) {
			amt = 100*0.8f+(units-100)*1;
			
			
		}
		else {
			amt = (units-300)*2.50f;

	}
		System.out.println("The bill for "+units+" units is "+amt);
}
}