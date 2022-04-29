import java.util.Stack;

public class MethodsOfStk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> str=new Stack<String>();
		str.push("cool");
		str.push("crazy");
		str.push("savage");
		str.push("sazzy");
		System.out.println(str);
		System.out.println(str.pop());
		System.out.println(str);
		System.out.println(str.peek());
		System.out.println(str.search("cool"));
		System.out.println(str);
		//System.out.println(str.);
	}

}
