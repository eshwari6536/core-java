import java.util.Scanner;

public class IdentMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][];
		int r,c;
		int flag=1;
		//int td[][]=new int[4][3];
		Scanner dd=new Scanner(System.in);
		System.out.println("the rows are");
		r=dd.nextInt();
		System.out.println("the coloumns are");
		c=dd.nextInt();
		ar=new int[r][c];
		if(r!=c){
			System.out.println("Identity matrix must be square");
			
		}
		else {
		System.out.println("the rows "+r+"x"+" coloumns "+c);
		for( int i=0;i<r;i++) {
			for( int j=0;j<c;j++) {
				ar[i][j]=dd.nextInt();
			}
		}
	
		outer:	for(int i = 0; i < r ; i++)
		{
		inner:	for(int j = 0; j < c; j++)
			{
			if(ar[i][j] != 1 && ar[j][i] != 0) {
					flag=0;
					break outer;
				}
			}
		}
	
		if(flag == 1) {
			System.out.println("Matrix is an Identity Matrix");
		}
		else {
			System.out.println("Matrix is Not an Identity Matrix");
		}
	}
}
}
