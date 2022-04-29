package life.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLcMain {
static ApplicationContext cpt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
cpt=new ClassPathXmlApplicationContext("spring.xml");
SpringLc sp=(SpringLc) cpt.getBean("lob");
sp.display();
((AbstractApplicationContext) cpt).registerShutdownHook();
//sp.display();also works bcz regis is a thread
	}

}
