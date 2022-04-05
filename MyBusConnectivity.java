package bus.reservation;
import java.sql.Connection;
import java.sql.DriverManager;
 public class MyBusConnectivity {
	static  Connection conec=null;
    static final String URL="jdbc:mysql://localhost:3306/StateTransport";
    static final String UN="root";
    static final String PASS="root";
    static String DataB="com.mysql.cj.jdbc.Driver";
    
    public static Connection getConnection() {
    	try {
    		//load the driver
    		Class.forName(DataB);
    		conec = DriverManager.getConnection(URL, UN, PASS);//return connection
    		
    		if(conec!=null) {
    			System.out.println("Connected");
    		}else {
    			System.out.println("Not connected");
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
  
    	return conec;
    	
    	 }
    
}
