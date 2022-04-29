package nestingrepeat;

import java.util.Scanner;

public class LtTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int row,r,c;
		    //creating object 
		    Scanner lt = new Scanner(System.in);
		    // entering the number of row
		    System.out.print("Enter rows : ");
		    row = lt.nextInt();
		    // entering the symbol
		    System.out.print("Enter symbol : ");
		    char symbol = lt.next().charAt(0);
		    //iteration for no. of row 
		        for (r=0; r<row; r++) 
		        {
		            //iteration for printing space 
		            // for (c=1*(row-r); c>=0; c--)  
		        	for (c=2*(row-r); c>=0; c--) 
		               System.out.print("b");  //1st row takes b value for space and missing symbol,so r=1 no.of b's= 
		           
		            for (c=0; c<=r; c++ ) 
		                System.out.print(symbol+" "); 
		            // printing new line .
		            System.out.println();   
		        } 

	}

}
