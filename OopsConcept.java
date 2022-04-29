package oopsC1;

import java.util.Scanner;

class Employee{
	String name;
	int id;
	char gen;
	int age;
	float salary;


	
void input() {
	
	Scanner sc=new Scanner(System.in);
	name=sc.nextLine();
	id=sc.nextInt();
	gen=sc.next().charAt(0);
	age=sc.nextInt();
	 salary=sc.nextFloat();
}
void output() {
	System.out.println(" employee name "+name);
	System.out.println(" employee id "+id);
	//System.out.println(" employee gender "+gen);
	System.out.println(" employee age "+age);
	System.out.println(" employee gender "+gen);
	System.out.println(" employee salary "+salary);
}
}

public class OopsConcept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee eob=new Employee();
		Employee eob1=new Employee();
		/*System.out.println(" employee name "+eob.name);
		System.out.println(" employee id "+eob.id);
		System.out.println(" employee age "+eob.age);
		System.out.println(" employee gender "+eob.gen);
		System.out.println(" employee salary "+eob.salary);*/
		eob.input();
		eob.output();
		eob1.input();
		eob1.output();
		
	}
}
	

	
	


