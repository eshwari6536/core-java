import java.util.Scanner;

public class MinMaxUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner mmu=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		 n=mmu.nextInt();
		 int ele[]=new int[n];	
			System.out.println("enter the elements");
			 for(int i=0;i<n;i++) {
				 ele[i]=mmu.nextInt();
				 
		}
			 System.out.println("entered elements are:"); 
			 for(int i=0;i<n;i++) {
				 
				 System.out.println(ele[i]);  
		}
			 int max=ele[0];
			 int min=ele[0];
			 for(int i=1;i<ele.length;i++) {
				 if(ele[i]>max) {
					 max=ele[i];
					 System.out.println("the largest is "+max);
				 }
				
				 else{
					 
				 if(ele[i]<min) {
						 min=ele[i];
						 System.out.println("the smallest is "+min);
					 }
				 }
			 }
		

	}

}

