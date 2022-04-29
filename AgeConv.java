package myproj;

import java.util.Scanner;

public class AgeConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Total_months,Total_days,Total_hours,Total_mins,Total_secs;
		Scanner ac = new Scanner(System.in);
		System.out.println("enter your age in years");
		int yr = ac.nextInt();
		System.out.println("your age in years is: "+yr+" years");
		Total_months = yr*12;
		System.out.println("your age in months is: "+Total_months+" months");
		Total_days = Total_months*30; 
		System.out.println("your age in days is: "+Total_days+" days");
		Total_hours = Total_days*24; 
		System.out.println("your age in hours is: "+Total_hours+" hours");
		Total_mins = Total_hours*60;
		System.out.println("your age in minutes is: "+Total_mins+" minutes");
		Total_secs = Total_mins*60;
		System.out.println("your age in seconds is: "+Total_secs+" seconds");
		
		
		
		

	}

}
