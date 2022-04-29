package arrstrings;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "How are you";
int c=0,k=0;
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	
	if(ch=='a'||ch== 'A'||ch== 'e'||ch== 'E'||	ch== 'i'||ch== 'I'||ch== 'o'||ch== 'O'||ch== 'U'||ch== 'u') {
		c++;
		
	}
}
System.out.println("no of vowels is "+c);

for(int i=0;i<s.length();i++) {
	char ch1=s.charAt(i);
	if(ch1==' ') {
	k++;
}
}
System.out.println("no of words is "+(k+1));
for(int i=s.length()-1;i>=0;i--) {
	System.out.print(s.charAt(i));
	
	}
}
}

