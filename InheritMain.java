package Inherite.pack2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
ParentCl obA=(ParentCl) ctx.getBean("parent");
obA.getMessage1();
obA.getMessage2();

ChildCl obB =(ChildCl) ctx.getBean("child");
obB.getMessage1();
obB.getMessage2();
obB.getMessage3();
//obA.display();
//obB.display1();
	}
}
