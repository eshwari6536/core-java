package nestingrepeat;

import java.util.Scanner;

public class InvertedStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int row , r, c ;
         // creating Object
         Scanner is=new Scanner(System.in);
         // entering no. of rows
         System.out.print("Enter Row : ");
         row=is.nextInt(); 
         for(r=row;r>0;r--)
             {
                 // printing space 
                 for( c=row-r;c>0;c--)
                     System.out.print("b");
                 // printing stars
                 for( c=0;c<r;c++)
                     System.out.print("*");
                  //taking to new line
                 System.out.println();
             }
			}

		}
	


