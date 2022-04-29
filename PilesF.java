package today.prep;
import java.io.File;
public class PilesF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		    File x = new File("");
		    if(x.exists()) {
		     System.out.println(x.getName() +  "exists!");
		    }
		    else { 
		     System.out.println("The file does not exist");
		    }
		  }
		}
