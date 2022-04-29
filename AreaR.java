package myproj;

public class AreaR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b;
		a = 11.5f;
		b = 10.5f;
		char c1 ='a';
		int e_s = 100;
		
		double rec_area = a*b;
		double sqr_area = a*a;
		double cir_area = 3.14*a*a;
		double tri_area = 0.5*a*b;
System.out.println("the area of width = "+a+" and length = "+b+ " is "+rec_area);
System.out.println("the area of square with side = "+a+" is "+sqr_area);
System.out.println("the area of circle with radius = "+a+" is "+cir_area);
System.out.println("the area of triangle with base = "+a+" and height = "+b+" is " +tri_area);
System.out.println(a);	//print values of different data types
System.out.println(c1);
System.out.println(rec_area);
System.out.println(e_s);
	}

}
