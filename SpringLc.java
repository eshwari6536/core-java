package life.cycle;

public class SpringLc {
public void Student(){
	System.out.println("no arg const");
}
public void display() {
	System.out.println("hello");
}
public void init() {
	System.out.println("bean goin init");
}
public void destroy() {
	System.out.println("bean destroy");
}
}
