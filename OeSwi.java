package pack1;

import java.util.Scanner;

public class OeSwi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner oddev = new Scanner(System.in);
		//num = oddev.nextInt();
		System.out.println("enter the number");
		num = oddev.nextInt();
		switch(num%2) {
		case 0:
			//if(num % 2 == 0) {
				System.out.println(num+" number is even");
				break;
		//}
		case 1:
			
			System.out.println(num+" number is odd");
			break;

	}

}
}
