package nestingrepeat;

import java.util.Scanner;

public class RtTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 int row,r,c;
		    //creating object 
		    Scanner rt = new Scanner(System.in);
		    // entering the number of row
		    System.out.print("Enter rows : ");
		    row = rt.nextInt();
		    // enter symbol
		    System.out.print("Enter symbol : ");
		    char symbol = rt.next().charAt(0);  
		     // taking variable for loop iteration and row .
		  //  int row,r,c;
		    //creating object 
		   // Scanner rt = new Scanner(System.in);
		    // entering the number of row
		   // System.out.print("Enter rows : ");
		    //row = rt.nextInt();
		    // iteration for no. of row 
		    for(r=1;r<=row;r++)
		     {
		         //iteration for printing stars
		         for(c=1;c<=r;c++)
		         {
		             System.out.print(symbol);
		         }
		         //taking to the new line 
		         System.out.println(" ");
		     } 
		 }
		

	}


