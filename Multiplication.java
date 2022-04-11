import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ma[][];
		int ma1[][];
		int r,c,r1,c1;
		//int td[][]=new int[4][3];
		Scanner dd=new Scanner(System.in);
		System.out.println("enter 1st matrix: ");
		
		System.out.println("the rows are");
		r=dd.nextInt();
		System.out.println("the coloumns are");
		c=dd.nextInt();
		System.out.println("enter 2nd matrix: ");
		System.out.println("the rows are");
		r1=dd.nextInt();
		System.out.println("the coloumns are");
		c1=dd.nextInt();
		
		if (r1 != c) {
			 
            System.out.println("Multiplication Not Possible");
           
        }	
		
		else {
		ma=new int[r][c];
		ma1=new int[r1][c1];
		System.out.println("the rows "+r+" x "+" coloumns "+c+" elements of 1st mat");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				ma[i][j]=dd.nextInt();
			}
		}
		
	
		System.out.println("the rows "+r1+" x "+" coloumns "+c1+" elements of 2nd mat ");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				ma1[i][j]=dd.nextInt();
			}
		}
		int res[][] = new int[r][c1];
		
		for (int i = 0; i < r; i++) {
            for (int j = 0; j < c1; j++) {
                for (int k = 0; k < r1; k++) {
                    res[i][j] += ma[i][k] * ma1[k][j];
            }
                
        }
            
           
		}
		System.out.println("product of matrices: ");
		 
		for ( int i= 0 ; i < r ; i++ )
		{ 
		for ( int j= 0 ; j < c1 ;j++ ) {
		
		System.out.print(res[i][j]+" ");
		}
		System.out.println();
		
		
	}
}
}
}
