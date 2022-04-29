class A extends Thread{
	public A(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	public void run() {
		System.out.println("name = "+Thread.currentThread());
		
	}
}
public class PassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob= new A("first thread");
		A ob1=new A("second thread");
		ob.start();
		ob1.start();
}

}
