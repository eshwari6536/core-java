class ShortCutAnno{
	synchronized void print(int n) {
		for(int i=1;i<=10;i++) {
			
				System.out.println("square of "+i+" = "+i*i);
			}
				
		}
		
	}

public class InThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortCutAnno sca=new ShortCutAnno();
		Thread tr=new Thread() {
		public void run() {
			sca.print(10);
		}
	};
	tr.start();

}
}
