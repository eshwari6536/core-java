package arrstrings;

public class ChAlphaTyp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1223";
		boolean flag=false;
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90 || (ch>=97 && ch<=122)) {
				flag=true;
			}
		}
			if(flag==true) {
				System.out.println("string is only alphabet type");
			
			
		}
			else {
				System.out.println("string is not alphabet type");
			}

	}

}
