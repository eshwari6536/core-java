package text.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		    TextEditor tob=(TextEditor)ctx.getBean("textEditor");
		    tob.textSpellCheck();
	}

}
