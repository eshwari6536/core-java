package yaya.g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExampleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int c[]=new int[5];
		ArrayList<Integer> oa=new ArrayList<>();
		/*
		 * oa.add(12); oa.add(12.78); oa.add("yo");
		 */
		oa.add(12);
		oa.add(13);
		oa.add(14);
		oa.add(14);
		oa.add(14);
		oa.add(14);
		
		System.out.println(oa);
		Iterator it=oa.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for (Integer i: oa) {		//datatype var:object,wrapper class
			
            System.out.println(i);
        }
		System.out.println();
	}

}
