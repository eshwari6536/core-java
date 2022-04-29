package arrstrings;

public class RemovVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the string: ");
		 String str1="Computer Applications";
		 char str[]=str1.toCharArray();

		 System.out.println("All the consonants in the string are: ");
		    for(int i=0;i<str1.length();i++)
		    {
		    if(str[i]=='a' || str[i]=='A' || str[i]=='e'|| str[i]=='E' || str[i]=='i'
		       || str[i]=='I' || str[i]=='o' || str[i]=='O' || str[i]=='u' || str[i]=='U'|| str[i]==' ')
		    {
		     continue;
		    }
		    else
		        System.out.print(str[i]);
		    }
		

}
}
