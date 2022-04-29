package arrstrings;

import java.util.Scanner;

public class MKGandhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mmu=new Scanner(System.in);
		//System.out.println("enter the string: ");
		 String n="Mohandas Karamchand Gandhi";
		 String sa="";
		 for(int i=0;i<n.length();i++) {
			 if(i==0) {
				 System.out.print(n.charAt(0)+".");
			 }
				  if(n.charAt(i)==' ') {
					 System.out.print(n.charAt(i+1)+"."+n.substring(21,27));
				 }
				  //int s =n.lastIndexOf(' ');
				  //System.out.print(n.substring(19,27));

		
	}

}
}
