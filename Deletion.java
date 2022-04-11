import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ls[];
		Scanner m=new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int n=m.nextInt();
		  ls=new int[n];	
			System.out.println("enter the elements");
			 for( int i=0;i<n;i++) {
				 ls[i]=m.nextInt();
			 }
			 System.out.println("entered elements before deletion are");
				 for( int i=0;i<n;i++) {
					System.out.println(ls[i]);
					
				 }
				 System.out.println("Entered position should not be greater than "+n+":");
				    int index=m.nextInt();
				    if(index<=n && index>0)
				    {
				    	for(int i=index-1; i<n-1; i++)
				        {
				         ls[i]=ls[i+1];
				           
				        }
				    	n--;
				    	 System.out.println("entered elements after deletion are");
				        
				    	 System.out.print("After deleting : ");
					        for(int i=0; i<n; i++)
					        {
					            System.out.print(" "+ls[i]);
					        }
				    }
				    else {
				    	 System.out.println("number not found");
				 
				   
				} 
	}

}
