package bigdata.pack;
//Lambda Expr
@FunctionalInterface
interface Drawable10{
	void draw(String s);
}
public class SecondLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable10 dob=(String s)->{
			System.out.println("implementing draw meth "+s);
			
		};
		dob.draw("line");
			
	//implementing runnable interface using lambda
		
	Runnable r=()->{
		System.out.println("inside run meth");
	};
	//r.start() not possible bcz its frm thread cl
	Thread tob=new Thread(r);
	tob.start();
	}
}


