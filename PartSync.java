class TableOne{
	  void print(int n,String g) {
		 synchronized(this) {
			for(int i=1;i<=10;i++) {
			System.out.println("n x"+i+"="+n*i);
		}
			
		}
		 System.out.println(g);
}

	  class FirstThreadO extends Thread{
			Table t;
			public FirstThreadO(Table tb){
				this.t=tb;
			}
			public void run() {
				t.print(5,"Hello");
			}
		}

		class SecondThreadT extends Thread{
			Table t;
			public SecondThreadT(Table tb) {
				this.t=tb;
			}

			public void run() {
				t.print(10,"Hi");
				
			}
		}
public class PartSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableOne te1 = new TableOne();//common object
		FirstThreadO t1 = new FirstThreadO(tb);
		SecondThreadT t2= new SecondThreadT(tb);
		t1.start();
		
		t2.start();
	}

}
}
