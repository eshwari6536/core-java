package pack1;

import java.util.Scanner;

public class MarOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ma;
		Scanner mo = new Scanner(System.in);
		System.out.println("enter the marks");
		ma = mo.nextInt();
		if(ma>=90 && ma<=100) {
			System.out.println("grade:A");
			
		}
		else if(ma>=60 && ma<=89) {
			System.out.println("grade:B");
			
		}
		else if(ma>=40 && ma<=59) {
			System.out.println("grade:C");
			
		}
		else if(ma>=0 && ma<=39) {
			System.out.println("grade:D");
			
		}
		else
		{
			System.out.println("marks invalid");
		

	}
}
}