import java.util.Scanner;

public class TransposeMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][];
		int r,c;
		
		//int td[][]=new int[4][3];
		Scanner dd=new Scanner(System.in);
		
		System.out.println("the rows are");
		r=dd.nextInt();
		System.out.println("the coloumns are");
		c=dd.nextInt();
		ar=new int[r][c];
		System.out.println("the rows "+r+"x"+"coloumns "+c);
		for( int i=0;i<r;i++) {
			for( int j=0;j<c;j++) {
				ar[i][j]=dd.nextInt();
			}
		}
		int ta[][]=new int[r][c];
		for( int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
		ta[j][i]=ar[i][j];
			}
			
	}
		 System.out.println("Transpose Mat ");
	        for(int i=0;i<r;i++)      //Print the transpose matrix
	        {
	             for(int j=0;j<c;j++)
	             {
	                 System.out.print(ta[i][j]+" ");
	             }
	            System.out.println("");
	        }
	}
}
