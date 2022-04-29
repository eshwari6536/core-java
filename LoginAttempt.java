package arrstrings;

import java.util.Scanner;

public class LoginAttempt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		String user_id="Stella Jagusi";
		String passd="0890Jagusi";
		Scanner mmu=new Scanner(System.in);
		do {
		System.out.println("enter your user-id: ");
		 String uid=mmu.nextLine();
		 System.out.println("enter your password: ");
		 String pd=mmu.nextLine();
		 System.out.println("you are in "+c+" attempt");
		 if(uid.equalsIgnoreCase(user_id)&&pd.equals(passd)) {
			 System.out.println("login sucessful");
		 }
		 else {
			 System.out.println("login not sucessful");
		 }
		 c++;
		}while(c<=3);
		{
			System.out.println((c-1)+"attempts over try after sometime");
		}
	}

}

