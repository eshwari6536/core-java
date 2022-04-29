package myproj;

public class ComparOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,d;//declaring variables
a = 10;//initializing values
b = 20;
c = -30;
d = 40;
boolean s = (a>b && b>c);//AND operation
System.out.println(s);
boolean e = (a>b || b>c);//OR operation
System.out.println(s);
boolean w = !(a>b || b>c);//NOT operation
System.out.println(w);
a +=5;// short hand assignment same for *,-,/
System.out.println(a);
int sign = (c>a)?c:a;//to find signed numbers 
System.out.println("the positive is "+a);
System.out.println("the negative is "+c);
int large_no = (a>b && a>c && a>d)?a:(b>a && b>c && c>d)?b:(c>a && c>b && c>d)?c:d;//ternary operation used for finding largest no.
System.out.println("largest of "+a+","+b+","+c+" and "+d+ " is: "+large_no);

	}

}
