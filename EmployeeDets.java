package yaya.g;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
 

class Employee implements Comparable<Employee>{		//for comparrision based on one attribute
	int id;
	String name;
	String Co;
	int sal;
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id - o.id;		//not taking for string
	}
	public Employee(int id, String name, String co, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.Co = co;
		this.sal = sal;
	}

	
}
public class EmployeeDets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ed1=new Employee(3, "Mrs.Stella", "TCS", 23000) ;
		Employee ed2=new Employee (4, "Mr.Kumar", "LTC", 28000);
		Employee ed3=new Employee(1, "Mrs.Kayla", "TATA", 22000);
		Employee ed4=new Employee(2, "Ms.Konstance", "JIO", 45000);
		LinkedList<Employee> es=new LinkedList<Employee>();
		 es.add(ed1);
		 es.add(ed2);
		 es.add(ed3);
		 es.add(ed4);
		 Collections.sort(es);
		 System.out.println("ID\tNAME\t\tCOMPANY\tSALARY");
		 Iterator<Employee> it =es.iterator();
		 //Student ob=(Student) it.next();//to print details of one candidate
				 
		 System.out.println("Employee data after sorting : ");
		 while(it.hasNext()) { 
			 Employee ob1=(Employee) it.next();
		  
		  System.out.println(ob1.id+"\t"+ob1.name+"\t"+ob1.Co+"\t"+ob1.sal); 
		  }
}
}
