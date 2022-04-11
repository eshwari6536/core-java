import java.util.Scanner;

public class BinSrch {
//binary search for unsorted array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bis[];
		int temp, mid=0,l=0,pos=0;
		  
		Scanner m=new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int n=m.nextInt();
		  bis=new int[n];	
		  System.out.println("enter the elements");//System.out.println("enter the elements in ascending order");
			 for(int i=0;i<n;i++) {
				 bis[i]=m.nextInt();
				 
			 }
			 System.out.println("entered elements are");
				 for(int i:bis) {
					System.out.println(i);
				 }	
				 
				 
				 for(int i=0;i<n;i++) {
					 
						 for(int j=0;j<n-1;j++) {
							 if(bis[j]>bis[j+1]) {		//if(bis[j]<bis[j+1]) descending
								temp=bis[j];
								bis[j]=bis[j+1];
								bis[j+1]=temp;
								
							 }
						 }
						 
					 }
				 System.out.println("Array After Sorting");  
	                for(int j:bis){  
	                        System.out.print(j+" " );  
	                 
	                System.out.println(" "); 
	                }
	                  
	               
				 System.out.println("enter search element");
				 int key=m.nextInt();
				 
				 int h=n-1;
				 
				 while(l<=h) {
					 /*System.out.println("Array After Sorting");  
		                for(int j:bis){  
		                        System.out.print(j+" " );  
		                 
		                System.out.println(" "); 
		                }*/
					 mid=(l+h)/2;
					 if(key==bis[mid]) {
						 pos=mid+1;
						 break;
					 }
					 else if(key<bis[mid]) {
						 h=mid-1;
						// break;
					 }
					 else if(key>bis[mid]) {
						 l=mid+1;
						 //break;
					 }
				 }
	                
				 if(pos>0) {
					 System.out.println(key+" is found at position "+pos);
				 }
				 else {
					 System.out.println("key not found" );
				 }
	}

}

