package pack1;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner ag = new Scanner(System.in);
		//age = ag.nextInt();//program does'nt show errors but no output and u don't have to name package as default p can be used
		System.out.println("enter the age");
		age = ag.nextInt();
		if(age >= 18)
			System.out.println("eligible for voting");
		if(age < 18)
			System.out.println(" not eligible for voting");
			
		
		
		

	}

}
