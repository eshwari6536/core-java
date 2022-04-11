import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bs[];
		Scanner m=new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int n=m.nextInt();
		  bs=new int[n];	
			System.out.println("enter the elements");
			 for(int i=0;i<n;i++) {
				 bs[i]=m.nextInt();
			 }
			 System.out.println("entered elements are");
				 for(int i:bs) {
					System.out.println(i);
					
				 }
				 int temp;
				 for(int i=0;i<n;i++) {
					 
						 for(int j=0;j<n-1;j++) {
							 if(bs[j]>bs[j+1]) {		//if(bs[j]<bs[j+1]) descending
								temp=bs[j];
								bs[j]=bs[j+1];
								bs[j+1]=temp;
								
							 }
						 }
						 
					 }
				  System.out.println("Array After Bubble Sort");  
	                for(int j:bs){  
	                        System.out.print(j+" " );  
	                }  
				
				 }
	}


