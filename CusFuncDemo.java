package excep.handle;
//Java program to demonstrate user defined exception

	// This program throws an exception whenever balance
	// amount is below Rs 1000
class MyException extends Exception
{
			// parameterized constructor
			MyException(String str) { 
				super(str); 
				}
			}
class MyBank{
	 int accno[] = {1001, 1002, 1003, 1004,1005};

	 String name[] =
				{"Nish", "Shubh", "Sush", "Abhi", "Akash"};

	 double bal[] =
		{10000.00, 12000.00, 600.0, 999.00, 1100.55};
	void display() {
		System.out.println("ACCNO" + "\t" + "CUSTOMER" +
				"\t" + "BALANCE");
		for (int i = 0; i < 5 ; i++) {
			try {
				if (bal[i] < 1000)
				
					throw new MyException(name[i]+ " "+" balance is less than 1000 ");
					System.out.println(accno[i]+ " \t " +name[i]+ " \t \t " +bal[i]);
				}
				
			
				catch(MyException e)
				{
					e.printStackTrace();
					System.out.println(e.getMessage());
				}

			
		}
	}
}
		
	

	

		
public class CusFuncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBank b1 = new MyBank();
		b1.display();
			
	}
}

