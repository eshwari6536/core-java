package dark.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class GesConMain {
	static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx=new ClassPathXmlApplicationContext("spring.xml");
		WithGesCon sg=(WithGesCon) ctx.getBean("cog");
		sg.display();
	}

}
