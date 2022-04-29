package assesment2.pack;

import java.util.Scanner;

public class BreakCl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String strn=sc.nextLine();
for(i=0;i<=strn.length();i++) {
	if(strn.substring(i).startsWith(" ")||i==0) {
		for(j=i+1;j<=strn.length();j++) {
			if(strn.substring(j).startsWith(" ")||j==strn.length()){
				System.out.println(strn.substring(i, j)+"->"+((i-1)+(j+1)));	
				i=j;
				
			}
		}
	}
}

}

}
