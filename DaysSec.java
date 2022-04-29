package myproj;

import java.util.Scanner;

public class DaysSec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Total_seconds;
		Scanner sa = new Scanner(System.in);
		System.out.println("enter no. of days");
		int ds = sa.nextInt();
		Total_seconds = ds*24*60*60;
		System.out.println("Total seconds in "+ds+" day(s) is "+Total_seconds);

	}

}
