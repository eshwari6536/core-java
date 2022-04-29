package constr.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstMain {
	static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx=new ClassPathXmlApplicationContext("spring.xml");
		ConstInject ci=(ConstInject) ctx.getBean("cob");
		ConstInject ci1=(ConstInject) ctx.getBean("cob1");
		ci.display();
		ci1.display();
	}

}
