import java.util.Scanner;

public class Dupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len1,len2,len3;
		Scanner m=new Scanner(System.in);
		System.out.println("enter the size of first array: ");
		 len1=m.nextInt();
		 int ele[]=new int[len1];	
			System.out.println("enter the elements");
			 for(int i=0;i<len1;i++) {
				 ele[i]=m.nextInt();
				 
		}
			 System.out.println("entered elements are:"); 
			 for(int i=0;i<len1;i++) {
				 
				 System.out.println(ele[i]);

	}
			 System.out.println("enter the size of second array: ");
			 len2=m.nextInt();
			 int ele1[]=new int[len2];	
				System.out.println("enter the elements");
				 for(int i=0;i<len2;i++) {
					 ele1[i]=m.nextInt();
					 
			}
				 System.out.println("entered elements are:"); 
				 for(int i=0;i<len2;i++) {
					 
					 System.out.println(ele1[i]);
				 }
					 //adding of the two arrays through the length
					 len3=ele.length+ele1.length;
					 System.out.println("length of merged array is: "+len3);
					 //allocate memory to new array
					 int[] arr3=new int[len3];
					 
					 for(int i = 0; i < len1; i++)
					  	{
					      	arr3[i] = ele[i];
					  	}
					 	for(int i = 0, j = len1; j < len3 && i < len2; i++, j++)
					  	{
					  		arr3[j] = ele1[i];
					  	}
					
					 	 System.out.println("Array Elements After Merging ");	 
					 for(int i = 0; i < len3; i++)
					  	{
						
					 		System.out.println(arr3[i]);
					  	}
					 
						  
													  
							  /* int[] tempar = new int[len3];  
						        int k = 0;  
						        for (int i=0; i<len3-1; i++){  
						        	 if(arr3[i-1]!=arr3[i]) { 
						                tempar[k++] = arr3[i];  
						            }  
						         }  
						        tempar[k++] = arr3[len3-1];     
						        // Changing original array  
						        for (int i=0; i<k; i++){  
						            arr3[i] = tempar[k];  
						        }  
						        System.out.println(k); 
						         for (int i=0; i<arr3.length; i++){  
           							System.out.print(arr3[i]+" "); 
           							} */
						    }  
					  
				    }  
	


