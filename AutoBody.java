package auto.cool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoBody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		AutoHuman hob1  = ctx.getBean("humanobj1",AutoHuman.class);
	     hob1.hufunc();

	}
	}


