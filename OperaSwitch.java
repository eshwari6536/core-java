package pack1;

import java.util.Scanner;

public class OperaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float ash1,ash2;
		//int ch = op.nextInt();
		Scanner op = new Scanner(System.in);
		/*if(ch>4) {
			System.out.println(" INVALID choice");	
		}
		else*/
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println(" ");
		System.out.println("enter the choice");
		int ch = op.nextInt();
		if(ch==0 || ch>4) {
			System.out.println("invalid choice");
		}
		else {
			
		
		System.out.println("enter the numbers");
		float ash1 = op.nextFloat();
		float ash2 = op.nextFloat();
		
		switch(ch) {
		case 1:
			float add = ash1 + ash2;
			System.out.println("addition of "+ash1+" and "+ash2+" is "+add);
			
			break;
			
		
		case 2:
			float sub = ash1 - ash2;
			System.out.println("subtraction of "+ash1+" and "+ash2+" is "+sub);
			break;


		case 3:
			float mul = ash1 * ash2;
			System.out.println("multiplication of "+ash1+" and "+ash2+" is "+mul);
			break;

		case 4:
			float div = ash1 / ash2;
			System.out.println("division of "+ash1+" and "+ash2+" is "+div);
			break;
			
			
		//default:
		//	System.out.println("invalid choice");
			

	}


	}

}
}
