package arrstrings;

import java.util.Scanner;

public class CaseSenVowRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner cs = new Scanner(System.in);
	        System.out.println("Enter a word: ");
	        String str = cs.nextLine();
	        str = str.toLowerCase();
	        String newStr = "";
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u') {

	                char nextChar = (char)(ch + 1);
	                newStr = newStr +  nextChar; 

	            }
	            else {
	                newStr = newStr + ch;
	            }
	        }

	        System.out.println(newStr);

	}

}
