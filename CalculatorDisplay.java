package oopsi.func;
class FunkOverloadCalci {
void display(){
	  System.out.println("clear all");
	   System.out.println("addition");
	}

	void display(int i,int j){
	  int add=i+j;
		System.out.println("addition of 2 ints "+i+" and "+j+" is "+add);
		
	}
	
	
	void display(float i, float j){
	 
	  float add=i + j;
		System.out.println("addition of 2 float "+i+" and "+j+" is "+add);

	}
	void display(short i, short j){
		  
		  float add=i + j;
			System.out.println("addition of 2 short "+i+" and "+j+" is "+add);

		}
	void display(byte i, byte j){
	
		  float add=i + j;
			System.out.println("addition of 2 byte "+i+" and "+j+" is "+add);

		}
	void display(short i, byte j){
		
		  float add=i + j;
			System.out.println("addition of 2 short- byte "+i+" and "+j+" is "+add);

		}

	

	int display(int i, float j){ //overloading by changing the order of argument
		
			float add= i + j;
			System.out.println("addition of 2 int-float "+i+" and "+j+" is "+add);
	}
	void display(float i, int j){
		System.out.println("addition of 2 int-float "+i+" and "+j+" is "+add);
		add= i+j;
	}

}
public class CalculatorDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunkOverloadCalci ob1 = new FunkOverloadCalci();
		ob1.display();//no arg
		ob1.display(5,6);
		ob1.display(6.7f,7.7f); //one arg float
		ob1.display((short)8, (short)3);//two arg float
		ob1.display(4, 8);//two arg int int
		ob1.display(6.7f,8);//float and int
		ob1.display(7,7.4f);//int float


	}

}
