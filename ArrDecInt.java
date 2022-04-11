
public class ArrDecInt {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int ar1[]= {4,5,6,7,8};//6elements*4bytes=24bytes memory size
		/*System.out.println("first element: "+ar1[0]);
		System.out.println("second element: "+ar1[1]);
		System.out.println("third element: "+ar1[2]);
		System.out.println("fourth element: "+ar1[3]);
		System.out.println("fifth element: "+ar1[5]);//exception thrown by JRE*/
		
		for(int i=0;i<ar1.length;i++) {
			System.out.println("ar1["+i+"]= "+ar1[i]);
			
			
			
		}
		int sum=0;
		for(int i=0;i<ar1.length;i++) {
			sum +=ar1[i];
	
		}
		System.out.println("sum of all array elements is: "+sum);
		float avg=((float)sum/ar1.length);
		System.out.println("average of all array elements is: "+avg);
	}

}
