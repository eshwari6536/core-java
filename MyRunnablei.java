class MyClazz implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");
		
	}
	
}
public class MyRunnablei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClazz myo=new MyClazz();
		Thread myo1=new Thread(myo);
		MyClazz myoi=new MyClazz();
		Thread myoi1=new Thread(myoi);
		myo1.start();
		myoi1.start();
	}

}
