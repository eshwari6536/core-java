package yaya.g;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int id;
	String name;
	String course;
	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
}
public class CandidateData {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obs=new Student(1, "ASh", "IT");
		Student obp=new Student(2, "esh", "CSE");
		Student obr=new Student(3, "joe", "EEE");
		Student obt=new Student(4, "sam", "ECE");
		ArrayList<Student> as=new ArrayList<>();
		 as.add(obs);
		 as.add(obp);
		 as.add(obr);
		 as.add(obt);
		 System.out.println("ID\tNAME\tCOURSE");
		 Iterator<Student> it =as.iterator();
		 //Student ob=(Student) it.next();//to print details of one candidate
		while(it.hasNext()) {
			Student ob=(Student) it.next();
			
			System.out.println(ob.id+"\t"+ob.name+"\t"+ob.course);
			/*
			 * System.out.println(obp.id+"\t"+obp.name+"\t"+obp.course);
			 * System.out.println(obr.id+"\t"+obr.name+"\t"+obr.course);
			 * System.out.println(obt.id+"\t"+obt.name+"\t"+obt.course);
			 */
		}
	}		
}

