package arrstrings;

public class ImutStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		String s="HEllo@to Marie in Mars";
		System.out.println(s.equals(s));//T
		System.out.println(s.charAt(5));//5 th is a space which is also a character
		System.out.println(s.equalsIgnoreCase(s));//T
		System.out.println(s.substring(4,s.length()-1));//n=21,n-1=20,value taken=19(r)
		System.out.println(s.charAt(s.length()-1));//same return value as in charAt 
		System.out.println(s.substring(s.length()-1));//s
		//System.out.println(s.IgnoreCase(s.indexOf('e')));
		System.out.println(s.indexOf('w'));//-1
		System.out.println(s.indexOf('e'));//13
		System.out.println(s.lastIndexOf('e'));//13
		System.out.println("13 is unique for "+s.charAt(13));
		System.out.println(s.indexOf("marie"));//-1
		System.out.println(s.indexOf("Marie"));//9
		System.out.println();
		System.out.println(s.indexOf('M'));//9
		System.out.println(s.lastIndexOf("Marie"));//9
		System.out.println();
		System.out.println(s.lastIndexOf('M'));//18 
		//respect to character always either user gives it as a word or in character itself
		System.out.println(s.indexOf("Mars"));//18
		
		System.out.println(s.lastIndexOf("Mars"));//18
		System.out.println(s.lastIndexOf("Marie in Mars"));//9
		System.out.println(s.lastIndexOf(""));	
		//len=21 till last char,""is taken new index value
		
	}

}
