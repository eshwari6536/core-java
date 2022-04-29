 package nestingrepeat;

import java.util.Scanner;

public class NestAssin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner na3=new Scanner(System.in);
		 System.out.println("Enter rows: ");

	        int rows = na3.nextInt();
	        int temp = 0;
	        
	        for (int i = rows; i >= rows; i--)
	        {
	            for (int j = rows ; j >= rows; j--)
	            {
	                System.out.print(j + " ");
	                temp =j;
	            }
	            for (int k = rows - i+1; k < rows; k++)
	            {
	                System.out.print(temp + " ");
	            }
	            System.out.println();
	        }
	}

}
