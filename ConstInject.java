package constr.pack;

public class ConstInject {
private String name;
private int id;
public ConstInject(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
void display() {
	System.out.println("yo,it's second project");
	System.out.println("name "+name);
	System.out.println("ID "+id);
}
}
