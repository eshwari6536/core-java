package pack1;
import java.util.Scanner;

public class NoType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner nt = new Scanner(System.in);
		System.out.println("enter the number");
		n = nt.nextInt();
		if(n>0)
		
			System.out.println(n+" the number is positive");
		if(n<0)
			
			System.out.println(n+" the number is negative");
		if(n == 0)
			
			System.out.println(n+" is neutral");
	}
}
	


