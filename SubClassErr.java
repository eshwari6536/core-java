package excep.handle;

import java.util.Scanner;

class Age extends Exception{
	int user_age;
	Age(String s){
		super(s);
	}
	
}

public class SubClassErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age obj=new Age("not eligible for voting");
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter age");
		obj.user_age=sc1.nextInt();
		try {
			if(obj.user_age<19) {
				throw obj;
				
			}
		}
		catch (Age e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("go ahead and vote");
	}

}
