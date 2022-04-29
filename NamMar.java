package myproj;

import java.util.Scanner;

public class NamMar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg,Total_marks,sum,diff_sub,avg1 ;
		Scanner nm = new Scanner(System.in);
		System.out.println("Enter number of subjects");
		int num = nm.nextInt();
		System.out.println("enter the first subject marks");
		double sub_1 = nm.nextDouble();
		System.out.println("enter the second subject marks");
		double sub_2 = nm.nextDouble();
		System.out.println("enter the third subject marks");
		double sub_3 = nm.nextDouble();
		System.out.println("enter the fourth subject marks");
		double sub_4 = nm.nextDouble();
		System.out.println("enter the fifth subject marks");
		double sub_5 = nm.nextDouble();
		 Total_marks = sub_1+sub_2+sub_3+sub_4+sub_5;
		System.out.println("Total marks is = "+Total_marks);
		 avg = Total_marks/num;
		 //avg1 = Total_marks%num;
		 System.out.println("Average marks is = "+avg);
		 avg1 = Total_marks%num;
		 System.out.println(" reminder is = "+avg1);
		 sum = avg*4;
		 System.out.println("sum of marks in four subjects = "+sum);
		 diff_sub = sub_1-sub_2;
		 System.out.println("the difference of marks of first two subjects is = "+diff_sub);
		 
		 
		 
		
		
	}

}
