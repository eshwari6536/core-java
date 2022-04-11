import java.util.Scanner;

public class LinearOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ls[];
		Scanner m=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=m.nextInt();
		  ls=new int[n];	
			System.out.println("enter the elements");
			 for(int i=0;i<n;i++) {
				 ls[i]=m.nextInt();
			 }
			
			 System.out.println("entered elements are");
				 for(int i:ls) {
					System.out.println(i);
					
				 }
				 System.out.println("enter search element");
				 int key=m.nextInt();
				int pos=0;
				 int c=0;
				 for(int i=0;i<ls.length;i++) {
					 
						 if(key==ls[i]) {
							
							 c++;
							 pos=pos+1;
							 pos++;		 
							 }
						 }	
			
				 System.out.println(key+" found "+c+" times at "+pos+",");
	}

}
