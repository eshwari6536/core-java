package demo.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstDemMain {
 static ApplicationContext act;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		act=new ClassPathXmlApplicationContext("spring.xml");
		ConstDem cd=(ConstDem) act.getBean("dem");
		cd.display();
	}

}
