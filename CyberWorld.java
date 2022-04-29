package asses.pack;

import java.util.Scanner;

public class CyberWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cw=new Scanner(System.in);
		System.out.println("enter your string");
		String str=cw.nextLine();
		String wstore=" ";
		for(int i=0;i<str.length();i++) {
			if(i==0||str.charAt(i-1)==' ') {
			wstore +=	Character.toUpperCase(str.charAt(i));
			}
			else {
				wstore+=str.charAt(i);
			}
		}
		System.out.println(wstore);
		
	}

}
