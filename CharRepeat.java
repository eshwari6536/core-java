import java.util.HashMap;
import java.util.Map.Entry;

public class CharRepeat {
	public static void freq(String s) {
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for(int i = 0; i < s.length(); i++) {
		if(hm.containsKey(s.charAt(i))) { 
			hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
		}
		else {
			hm.put(s.charAt(i), 1);
		}
	}
	for(Entry<Character, Integer> m : hm.entrySet()) {
		if(m.getValue()>1) {
			System.out.println(m.getKey()+"->"+m.getValue());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="javaisafunlanguage";
	findFrequency(str);
	}
	}


