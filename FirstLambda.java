package bigdata.pack;
//Lambda Expr
@FunctionalInterface
interface Drawable{
	void draw();

	//void draw(String string);
}
public class FirstLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Drawable dob=()->{
	System.out.println("implementing draw meth ");
	
};
dob.draw();
	}	

  //same as this 
	Drawable ob1=new Drawable() { //annonymous inner type
 
  @Override 
  public void draw() {
	  // TODO Auto-generated method stub
 System.out.println("implementing draw meth 1 ");
 } 
  };
 
	
	}

