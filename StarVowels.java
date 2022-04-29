package arrstrings;

import java.util.Scanner;

public class StarVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sv=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sv.nextLine();
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
		if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
		//if string contains both upper and lower case include A,E,I,O,U comparision check
		{
		ch[i]='*'; //replacing *
		}
		}
		for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
		}
	}

}
