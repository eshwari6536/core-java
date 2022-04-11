import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ls[];
		int ele,pos;
		
		Scanner m=new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int n=m.nextInt();
		  ls=new int[n+1];	
			System.out.println("enter the elements");
			 for( int i=0;i<n;i++) {
				 ls[i]=m.nextInt();
			 }
			 System.out.println("entered elements before insertion are");
				 for( int i=0;i<n;i++) {
					System.out.println(ls[i]);
					
				 }
				 System.out.println("Enter the position where you want to insert an element:");
			        pos = m.nextInt();
			        System.out.println("Enter the element which you want to insert:");
			        ele = m.nextInt();
			        for(int i = n-1; i >= (pos-1); i--)
			        {
			            ls[i+1] = ls[i];
			        } 
			        ls[pos-1] = ele;
			        System.out.print("After inserting : ");
			        for(int i = 0; i <=n; i++)
			        {
			            System.out.print(ls[i]+" ");
			        }
			        
	}

}
