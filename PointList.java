package yaya.g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PointList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> oa1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("elements of floating point values");
		int va=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<va;i++) {
		float fv=sc.nextFloat();
		oa1.add(fv);
		}
		for (Float f: oa1) {		//datatype var:object,wrapper class
			
            System.out.println(f);
        }
		
		for(int i=0;i<oa1.size();i++) {
				System.out.println(oa1.get(i));
		}
		Iterator it=oa1.iterator();
		System.out.println(it.hasNext());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collections.min(oa1);
		System.out.println(oa1);
		Collections.sort(oa1);
		System.out.println(oa1);
		
}
}
