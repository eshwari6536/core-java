package excep.handle;

public class DiviErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20,deno=4;
		int ans=0;
		int a[]= new int[4];
		System.out.println("b/4 division");
		try {
			a[4]=8;
			ans=num/deno;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		//try {
			//ans=num/deno;
		//}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		catch(Exception e)//when there is run-time error
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("exec always even when return is there");
			System.out.println("comes after either try or after try-catch:norm");
			System.out.println("can't come after catch");
			System.out.println("when system.exit(0),JVM itself terminates explicitly,no use of finally");
		}
		
		//ans=num/deno;
		System.out.println("a/f division");
		
	}

}
