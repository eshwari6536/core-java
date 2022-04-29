
public class MissingNumber {

    public static void main(String[] args)
    {
    	 // get the array's length
        int n[] = { 7,5,6,1,4,2 };
        int sum=0;
        // the actual size is `n+1` since a number is missing from the array
      // int m = n + 1;
 
        // get a sum of integers between 1 and `n+1`
        int total = 7 * ( 7+ 1) / 2;
 
        // get an actual sum of integers in the array
        for(int i=0;i<n.length;i++) {
         sum = sum+n[i];
        }
        // the missing number is the difference between the expected sum
        // and the actual sum
        int mn= total-sum;
        
        //int[] arr = { 7,5,6,1,4,2 };
 
        System.out.println("The missing number is " +mn);
	}
}


