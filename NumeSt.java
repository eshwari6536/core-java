package arrstrings;

public class NumeSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ghfy";
		boolean flag=false;
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(ch<='0'&& ch<='9') {
				flag=true;
			}
		}
			if(flag==true) {
				System.out.println("string is only numeric type");
			
			
		}
			else {
				System.out.println("string is not numeric type");
			}

	}

}
