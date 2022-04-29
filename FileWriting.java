package today.prep;
import java.io.*;
import java.util.Formatter;
public class FileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	
	Formatter fo=new Formatter("C:\\Users\\asus\\Documents\\New folder");
	fo.format("%s %s %s", "1","jhon","carry \r\n");
	fo.format("%s %s %s", "2","jhon","carram");
	fo.close();
}
catch(Exception e) {
	System.out.println("error");
}


	}

}
