package yaya.g;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;


public class TaskDoS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String str[];
		System.out.println("enter the number of names");
		int value=sc.nextInt();
		str=new String[value];
		System.out.println("enter the names");
		for(String un:str) {
			if(!(names.contains(un)));
		
				names.add(un);
		}
		
		Iterator it =names.iterator();
		 
		while(it.hasNext()) {
			System.out.println(it.next());
		
	}

}
}
