package arrstrings;

import java.util.Scanner;

public class Virus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mmu=new Scanner(System.in);
		System.out.println("enter the string: ");
		 String n="Virus Info Rsrc Undr Seize";
		 String a="";
				 
		 for(int i=0;i<n.length();i++) {
			 if(i==0) {
				 System.out.print(n.charAt(0)+"");
			 }
				 else if(n.charAt(i)==' ') {
					 System.out.print(n.charAt(i+1)+"");
					 
				 }
			 }
		 System.out.println(a);
		
	}

}
