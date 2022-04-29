package arrstrings;

public class ChAlphaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0,l=0,spl=0;
		String s="ghfy0089r$t";
		boolean flag=false; boolean flag1=false;
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(ch>='0'&& ch<='9') {
				flag=true;
				k++;
			}
		
		else if(ch>='a' && ch<='z' || (ch>='A' && ch<='Z') )
		{
			flag=true;
		
				l++;
			
		}
		else {
			spl++;
		}
		}
		
				System.out.println("the alphabets are "+l+" and numbers are "+k);
				System.out.println("the special character(s) is "+spl);
			
			
	}
}
			


