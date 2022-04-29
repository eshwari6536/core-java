package today.prep;
import java.util.Iterator;
import java.util.LinkedList;
public class CycleIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("create the collections(linked list");
		LinkedList<String>ani=new LinkedList<>();
		ani.add("cow");
		ani.add("deer");
		ani.add("goat");
		ani.add("sheep");
		Iterator<String>it=ani.iterator();
		/*
		 * String tore=it.next(); String tore1=it.next(); String tore2=it.next(); String
		 * tore3=it.next();
		 */
		it.next();
		/*
		 * String t1=it.next(); String t2=it.next(); String t3=it.next();
		 */
		//String t4=it.next();
		System.out.println(it.next());
		/*
		 * System.out.println(t1); System.out.println(t2); System.out.println(t3);
		 */
		//System.out.println(t4);
	it.remove();
	System.out.println("last object removed");
	System.out.println();
	
	//System.out.println(t4);
		/*System.out.println(tore); 
		System.out.println(tore1); 
		System.out.println(tore2); 
		System.out.println(tore3); */
	}

}
