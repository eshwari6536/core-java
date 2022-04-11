package pack1;

import java.util.Scanner;

public class VowelConso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char cr;
		Scanner vc = new Scanner(System.in);
		System.out.println("enter the char to check vowel or not");
		 cr = vc.next().charAt(0);
		//System.out.println("enter the day number");
		//int days = sw.nextInt();
		switch(cr) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':	
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'U':
		case 'u':
			System.out.println("the vowel is "+cr);
			break;
			
		default:
			System.out.println(cr+" is a consonant");
			break;
			
	

	}

}
}
	