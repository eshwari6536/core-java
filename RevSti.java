package arrstrings;

import java.util.Scanner;

public class RevSti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rs = new Scanner(System.in);
		 System.out.println("Enter a sentence:");
	       String str = rs.nextLine();
	      str = " " + str;//does'nt print first in rev if not used
	       String word = "";
	       for (int i = str.length() - 1; i >= 0; i--) {
	           char ch = str.charAt(i);
	           if (ch == ' ') {
	               System.out.print(word + " ");
	               word = "";//you killyou ikillyou wen removed
	           }
	           else {
	               word = ch + word;//purpose?
	           }
	       }
	}

}
