package arrstrings;

import java.util.Scanner;

public class MaxVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner mv = new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String str = mv.nextLine();
	        
	        str = str + " ";
	        String word = "", word1 = "";
	        int count = 0, mC = 0;
	        
	        for (int i = 0; i <  str.length(); i++) {
	            
	            char ch = Character.toUpperCase(str.charAt(i));
	            
	            if (ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U') {
	                count++; 
	            }
	            
	            if (ch == ' ') {
	                if (count > mC) {
	                    mC = count;
	                    word1 = word;
	                }
	                word = "";
	                count = 0;
	            }
	            else {
	                word += ch;
	            }
	        }
	        
	        System.out.println("The word with maximum number of vowels: "
	                            + word1);

	}

}
