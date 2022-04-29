package nestingrepeat;

import java.util.Scanner;

public class NestAssin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,k=1;
		    //creating object 
		    Scanner na1 = new Scanner(System.in);
		    // entering the number of row
		    System.out.print("Enter rows : ");
		   int n = na1.nextInt();
		    // entering the symbol
		   // System.out.print("Enter symbol : ");
		   // char symbol = na1.next().charAt(0);
		    //iteration for no. of row 
		    for( i = n;i>=1;i--){
	            for(j = n;j>i;j--){
	                System.out.print(" ");
	            }
	            for( k=i;k>=1;k--){
	                System.out.print(k);
	            }
	            System.out.println();
	        }


	}

}
