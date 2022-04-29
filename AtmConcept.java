package excep.handle;

import java.util.Scanner;

class OwnExcep1 extends Exception{
	public OwnExcep1(String s) {
		super(s);
	}
}
class OwnExcep2 extends Exception{
	public OwnExcep2(String s) {
		super(s);
	}
}
/*class OwnExcep3 extends Exception{
	public OwnExcep3(String s) {
		super(s);
	}
}*/
class SbiBank{
	static int Amt;
	SbiBank(){
		Amt=5000;
	}
	void deposit(int amt) {
		try {
			if(amt<0)
			throw new OwnExcep1("invalid amount");	
			Amt+=amt;
			}
		catch(OwnExcep1 e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
		void withdrawal(int wa) {
				if(wa<5000) {
					System.out.println("you can withdraw");
					Amt-=wa;
					System.out.println("remaining balance "+Amt);
				}
				else {
					try {
						throw new OwnExcep2("cannot withdraw amount,low balance");
					}
					catch(OwnExcep2 e) {
						e.printStackTrace();
						System.out.println(e.getMessage());
					}
				
				}
}
}
		/*void UpdatedBalance(int amt) throws OwnExcep3 {
			
				if(amt>0)
				throw new OwnExcep3("your balance is low");	
				Amt-=amt;
				
			
			
		
}*/
public class AtmConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SbiBank sb=new SbiBank();
		System.out.println("initial balance "+sb.Amt);
		int ch;
		char choice=' ';
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("~~~~~~~~MENU~~~~~~~~");
			System.out.println("enter the choice");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Balance");
			ch=sc.nextInt();
			switch(ch) {
			case 1: System.out.println("enter deposit");
					int ds=sc.nextInt();
					System.out.println("before depositing "+sb.Amt);
					sb.deposit(ds);
					System.out.println("after deposition "+sb.Amt);
					break;
			case 2: System.out.println("enter amount to withdraw");
			int wa=sc.nextInt();
			sb.withdrawal(wa);	
			break;
			case 3: System.out.println("account balance is "+sb.Amt);
					//sb.UpdatedBalance();
					break;
			default: System.out.println("please try again");		
					
			
			}
			System.out.println("do you want to continue(press Y OR y).To exit Enter N");
			choice=sc.next().charAt(0);
		}while(choice=='Y'|choice=='y');

	}

}
 
