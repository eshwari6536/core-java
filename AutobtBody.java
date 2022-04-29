package bytyp.pack;



public class AutobtBody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		AutobtHu hob2  = ctx.getBean("humanobj1",AutobtHu.class);
	     hob2.hufunc();
	}

}
