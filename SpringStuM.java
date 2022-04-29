package sulphur.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStuM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext cat =new ClassPathXmlApplicationContext("spring.xml");
SpringStu ss=(SpringStu) cat.getBean("spob");
ss.display();
	}

}
