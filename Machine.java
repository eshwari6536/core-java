package out.pack;
class Machinery {	//class itself
	  public void start() {
	    System.out.println("Starting...");	/*the start method's implementation will
	    										be the one defined in the class.*/
	  }
	}
public class Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machinery m1=new Machinery() {	//current obj
		@Override public void start() {
			System.out.println("woooooo....");
		}
		};
		Machinery m2=new Machinery();	//another obj
		m2.start();
	}

}
// modification is applicable only to the current object, and not the class itself.