package today.prep;
import java.util.Iterator;
import java.util.LinkedList;
public class WhileIter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("create the collections(linked list");
		LinkedList<String>ani=new LinkedList<>();
		ani.add("cow");
		ani.add("deer");
		ani.add("goat");
		ani.add("sheep");
		Iterator<String>it=ani.iterator();
		while(it.hasNext()) {
			String store=it.next();
			System.out.println(store);
		}
	}

}
