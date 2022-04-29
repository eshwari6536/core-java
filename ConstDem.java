package demo.pack1;

public class ConstDem {
private int emid;
private String emname;
private float esal;
public ConstDem(int emid, String emname, float esal) {
	super();
	this.emid = emid;
	this.emname = emname;
	this.esal = esal;
}
void display() {
	System.out.println("name "+emname);
	System.out.println("ID "+emid);
	System.out.println("salary "+esal);
}
}
