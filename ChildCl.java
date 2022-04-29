package Inherite.pack2;

public class ChildCl extends ParentCl {
	private String message1;
	private String message2;
	private String message3;
	public void getMessage1() {
		//return message1;
		System.out.println("Cmessage1: "+message1);
	}
	public void setMessage1(String message) {
		this.message1 = message;
		
	}
	public void getMessage2() {
		//return message2;
		System.out.println("Cmessage2: "+message2);
		
	}
	public void setMessage2(String message) {
		this.message2 = message;
		
	}
	public void getMessage3() {
		//return message3;
		System.out.println("Cmessage3: "+message3);
	}
	public void setMessage3(String message3) {
		this.message3 = message3;
		
	}
//	void display1() {
//		System.out.println(message1);
//		System.out.println(message2);
//		System.out.println(message3);
//}
}
