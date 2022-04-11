import java.util.Scanner;

public class MatAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ua[][];
		int ua1[][];
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
		if(r!=r1||c!=c1||r==0||c==0 ||r<0 ||r1<0||c<0){
			System.out.println("addition not possible");
			
		}
		else {
		ua1=new int[r1][c1];
		ua=new int[r][c];
		System.out.println("the rows "+r+"x"+" coloumns "+c+"elements of 1st mat");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				ua[i][j]=dd.nextInt();
			}
		}
		
	
		System.out.println("the rows "+r+"x"+" coloumns "+c+" 2nd mat");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				ua1[i][j]=dd.nextInt();
			}
		}
		int res[][] = new int[r][c];
		
		for ( int i= 0 ; i < r ; i++ ) {
			for ( int j= 0 ; j < c ;j++ ) {
			res[i][j] = ua[i][j] + ua1[i][j] ; 
			}
		}
			System.out.println("Sum of matrices: ");
			 
			for ( int i= 0 ; i < r ; i++ )
			{ 
			for ( int j= 0 ; j < c ;j++ ) {
			System.out.print(res[i][j]+" ");
			}
			System.out.println();
			}
		
	}
	}

}
