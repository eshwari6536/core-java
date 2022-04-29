package abt.com;
interface MyInter{
	int i=18;
	void m1();
	void m2();
}
class A implements MyInter{
	@Override
	public void m1() {
		System.out.println("m1 method");
	}
	@Override
	public void m2() {
		System.out.println("m2 method");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.m1();
		obj.m2();
	}

}
