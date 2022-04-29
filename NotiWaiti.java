class Tots extends Thread{
		int total;
		public void run() {
			synchronized (this) {
				
			for(int i=1;i<=50;i++) {
				total+=i;
				
				
			}
			notify();
			
		}
	}
	}
public class NotiWaiti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Tots t=new Tots();  //Thread-0 , main
		t.start();
		synchronized (t) {
			
			 System.out.println("Waiting for Bus");
		          t.wait();//
		          System.out.println("Total "+t.total);
		     }
    }

	}


