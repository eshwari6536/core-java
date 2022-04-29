class Nool extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("run method "+this.currentThread()+"i= "+i);
		}
	}
}
public class ThClssy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JVM Control"+Thread.currentThread());
		Nool ob=new Nool();
		Nool ob1=new Nool();
		ob.setName("1st thread");
		ob1.setName("2st thread");
		ob.start();
		ob1.start();
		
	}

}
