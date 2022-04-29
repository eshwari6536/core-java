package excep.handle;

import java.util.Scanner;

class BankExcep extends Exception{
	
	public BankExcep(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
	
}
class Bank{
	final int balance=500;
	void withdraw(int amt) throws Exception{
		if(amt>balance) {
			throw new Exception("balance is low");
		}
		System.out.println("money withdrawn");
	}
}

public class CustomException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter withdraw amount");
		int withdraw=sc1.nextInt();
		Bank b=new Bank();
		b.withdraw(withdraw);
	}

}
