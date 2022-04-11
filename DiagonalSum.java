import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ua[][];
		int r,c;
		int s=0;
		//int td[][]=new int[4][3];
		Scanner dd=new Scanner(System.in);
		
		System.out.println("the rows are");
		r=dd.nextInt();
		System.out.println("the coloumns are");
		c=dd.nextInt();
		ua=new int[r][c];
		System.out.println("the rows "+r+"x"+"coloumns "+c);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				ua[i][j]=dd.nextInt();
			}
		}
		/*for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==j) {
					s +=ua[i][j];
				}
			}
			//System.out.println("the sum of diagonal elements is: "+s);
		}
		System.out.println("the sum of diagonal elements is: "+s);*/
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(ua[i][j]+ " ");
			}
			System.out.println(" ");
	}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==j) {
					s +=ua[i][j];
				}
			}
			//System.out.println("the sum of diagonal elements is: "+s);
		}
		System.out.println("the sum of diagonal elements is: "+s);
	}

}
