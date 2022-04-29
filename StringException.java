package excep.handle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name=null;
		String passwrd=null;
		int age=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
		//System.out.println("enter name");
		//name=br.readLine();
		System.out.println("enter password");
		passwrd=br.readLine();
		//try {
		System.out.println("enter age");
		age=Integer.parseInt(br.readLine());
		System.out.println("name "+name.length());
	}
		catch(NumberFormatException |NullPointerException e) {
			e.printStackTrace();
		}
//System.out.println("name "+name.length());
System.out.println("passwrd "+passwrd);
System.out.println("age "+age);
}
}