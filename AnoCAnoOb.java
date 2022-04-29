class ShortCutAnno1{
	synchronized void print(int n) {
		for(int i=1;i<=n;i++) {
			
				System.out.println("square of "+i+" = "+i*i);
			}
				
		}
		
	}
public class AnoCAnoOb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortCutAnno1 sca1=new ShortCutAnno1();
		Thread t2=new Thread() {
		public void run() {
			sca1.print(10);
		}
	};
	t2.start();
	new Thread() {		// for anonymous object
	public void run() {
		sca1.print(15);
	}
		
	}.start();		//for new thread block
	
	}

}
