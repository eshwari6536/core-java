class WaitingChild extends Thread {
	int Tol;
	@Override
public void run() {
	synchronized (this) {   //if not u get illegal monitor state exception
		
	
		for(int i=1;i<=10;i++) {
		Tol+=i;
	}
		notify();
}
}
}
public class ChildWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		WaitingChild wc=new WaitingChild();
		wc.start();
		System.out.println("after start");
		synchronized (wc) {
			try {
				System.out.println("after start,waiting");
			wc.wait();
			
	}catch(Exception e) {
		e.printStackTrace();
	}
			System.out.println("sum ="+wc.Tol);
	}

}
}
