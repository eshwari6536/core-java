import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ua[][];
		int r,c;
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
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(ua[i][j]+ " ");
			}
			System.out.println(" ");
	}
		/*System.out.println("print 4x3 matrix");
		System.out.println("enter the elements");
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				td[i][j]=dd.nextInt();
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(td[i][j]+ " ");
			}
			System.out.println(" ");
	}*/
			

}
}
