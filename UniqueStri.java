package arrstrings;

import java.util.Scanner;

public class UniqueStri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner us = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String str = us.nextLine();
	        str = str.toUpperCase();
	        boolean isUni = true;
	       
	        for (int i = 0; i <  str.length(); i++) {
	            
	            char ch = str.charAt(i);
	            
	            for (int j = i + 1; j < str.length(); j++) {
	                if (ch == str.charAt(j)) {
	                    isUni = false;
	                    break;
	                }
	            }
	            
	            if (!isUni)
	            break;
	        }
	        
	        if (isUni) 
	            System.out.println("Unique String");
	        else
	            System.out.println("Not Unique String");

	}

}
