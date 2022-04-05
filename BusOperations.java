package bus.reservation;  

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;


public class BusOperations {
	static Connection conec;
	static PreparedStatement pst;
	static ResultSet rs;
	static String Admin_uid;
	static String Pasnger_Mobno;
	int Bus_id;
	int Ad_id;
	int Pasngr_id;
	int Admin_ID;
	String Admin_Name;
	String Admin_Email;
	String Admin_DOB;
	String Admin_Address;
	int Pasnger_id;
	String Pasnger_Name;
	String Pasnger_Email;
	String Pasnger_Passwd;
	String Pasnger_Address;
	int Bus_ID;
	double Bus_Ticket;
	String Start_Location;
	String Destination;
	String Departure_DT;
	
	
	 void insertRecord() throws  IOException, SQLException {
		 try {
		conec=MyBusConnectivity.getConnection();
		
		Scanner sr=new Scanner(System.in);
		SimpleDateFormat usrinp = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	   System.out.println("Enter your Aadhar Number to login 🔐 ");
	   do {
			System.out.println("Enter your unique Aadhar Number 🔢  ");//user restriction to enter only 12 digit numeric code(AadharID) Which is unique
			Admin_uid=br.readLine();
			try 
			{  
				if(Admin_uid.length()==12) {
				Long.parseLong(Admin_uid);
				  String icon = " 😎 COOL (✿◠‿◠) "; 
				  System.out.println( icon ) ;
				System.out.println(Admin_uid + " You are Authenticated!! ");
				break;
				}
			}  
			catch (NumberFormatException e)  
			{ 
				 String icon = " 🤖 ( ╯□╰ ) "; 
				  System.out.println( icon ) ;
				System.out.println(Admin_uid + " UHMM,Its only 12 Digits..."); 
			} 
		
		}while(true);
	   System.out.println("Enter Admin_Name 🗒 ✍🏻 ");
	   Admin_Name=br.readLine();
	   System.out.println("Enter Admin_EmailID ✍🏻 🆔 ");
		 Admin_Email=br.readLine();
		System.out.println("Enter Admin_birthdate ✍🏻 📅 ");
		  Admin_DOB = br.readLine();
		System.out.println("Enter Admin_Office ✍🏻 🏢 ");
		 Admin_Address=br.readLine();
	   
		String sel="SELECT max(Ad_id) FROM Admin_portal";//select last id from Ad_id in Database
		
		pst=conec.prepareStatement(sel);
		rs=pst.executeQuery();
		
			 if(rs.next())
			 {
			int Ad_id=rs.getInt(1);
			 }
			 Ad_id++;
	         
		
		//check record if exists 
		if(!rs.next()) {
			String ins=("insert into Admin_portal(Ad_id,Ad_uid,Ad_Name,Ad_Email,Ad_DOB,Ad_Address) values(?,?,?,?,?,?)");
			pst=conec.prepareStatement(ins);
			pst.setInt(1, Admin_ID);
			pst.setString(2,Admin_uid);
			pst.setString(3,Admin_Name);
			pst.setString(4,Admin_Email);
			pst.setString(5,format1.format(usrinp.parse(Admin_DOB)));
			pst.setString(6,Admin_Address);
			int i=pst.executeUpdate();
			if(i>0) {
				System.out.println("Record added successfully 🦾 🎁 ");
			}else
			{
				System.out.println("Record not added 🧐 🔎 ");
			}
			
		}else {
			System.out.println(" 🆔 Admin id "+Admin_ID+" exists 📲 ");
		}
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		finally {
			if(pst!=null) {
			pst.close();
			}
			if(rs!=null) {
			rs.close();
			}
			if(conec!=null) {
			conec.close();
		}
		
	}
	 }

  void updateRecord() throws IOException, SQLException { 
	  try {
  conec=MyBusConnectivity.getConnection(); 
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter Admin_Name to update record 🖋 📝 ");
  Admin_Name=br.readLine(); 
  System.out.println("Enter Admin_ID to update record 🖊 🆔 ");
  Admin_ID=Integer.parseInt(br.readLine());
  String sel="select * from Admin_portal where Ad_id=?";
  
  pst=conec.prepareStatement(sel);
  pst.setInt(1, Admin_ID);
  rs=pst.executeQuery(); 
  //for update record, record should exists 
  if(rs.next())
  { 
	  String upr="update Admin_portal set Ad_Name=? where Ad_id=?";
  pst=conec.prepareStatement(upr);
  pst.setString(1,Admin_Name);
  pst.setInt(2,Admin_ID); 
  int i=pst.executeUpdate(); 
  if(i>0) {
  System.out.println("Record updated 📬 👍🏻 "); 
  }
  else  {
  System.out.println("Not updated 📭 🙅🏻‍♀️ "); 
  }
  }else {
		System.out.println("Record not exists 📪 🤡 ");
	}
}catch(Exception e) {
	 e.printStackTrace();
}
finally {
	if(pst!=null) {
		pst.close();
		}
		if(rs!=null) {
		rs.close();
		}
		if(conec!=null) {
		conec.close();
	}
}
  }
   
  
  
   void deleteRecord() throws NumberFormatException, IOException, SQLException
  { 
	   try { 
		   conec = MyBusConnectivity.getConnection();
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  System.out.println(" 👩🏻‍💻 Admin id 🆔 "); 
  Admin_ID=Integer.parseInt(br.readLine());
  
  String sel="select * from Admin_portal where Ad_id=?";
  
  pst=conec.prepareStatement(sel); 
  pst.setInt(1,Admin_ID);
  rs=pst.executeQuery(); 
  //for update record, record should exists 
  if(rs.next())
  {
	  String delr="delete from Admin_portal where Ad_id=?";
  pst=conec.prepareStatement(delr);
  
  pst.setInt(1,Admin_ID); 
  int i=pst.executeUpdate();
  if(i>0) {
  System.out.println("Record deleted 🗑 "); 
  }
  else {
  System.out.println("Not deleted 🗃 "); 
  }
  
  
  }
  else { 
	  System.out.println("Record not exists 📂 "); 
	  } 
  } catch(Exception e) {
  e.printStackTrace(); 
  } finally { 
	  if(pst!=null) {
			pst.close();
			}
			if(rs!=null) {
			rs.close();
			}
			if(conec!=null) {
			conec.close();
		}
	  }
  }
   
  public void insertRecord1() throws  IOException, SQLException {
		 try {
		conec=MyBusConnectivity.getConnection();
		InputStreamReader ir= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
	System.out.println("Enter Passenger_Name ✍ ");
	 Pasnger_Name=br.readLine();
	System.out.println("Enter Passenger_EmailID 📧 🆔 ");
	 Pasnger_Email=br.readLine();
	System.out.println("Enter Passenger_Password 🔑 ");
	 Pasnger_Passwd=br.readLine();
	do {
	System.out.println("Enter Passenger_MobileNumber 🔢 ");
	Pasnger_Mobno =br.readLine();
	
		
			if(Pasnger_Mobno.length()==10) {    //restricts user to enter mobile number of 10 digits including ISD/STD code
				Long.parseLong(Pasnger_Mobno);
			System.out.println("📲Your registered number is "+Pasnger_Mobno);
			break;
			}
			else {
				System.out.println("Invalid phone number 🧐 ");
			}
				
	}while(true);
	  
	  
	System.out.println("Enter Passenger_Address 🏘 ");
	 Pasnger_Address=br.readLine();
	 System.out.println("Enter Admin_id 🆔 👨🏻‍💼 ");
	 Admin_ID=Integer.parseInt(br.readLine());
	System.out.println("check");
	String sel="SELECT max(Pasngr_id) FROM Passenger_portal";
	
	pst=conec.prepareStatement(sel);
	rs=pst.executeQuery();
	
		 if(rs.next())
		 {
		int Pasngr_id=rs.getInt(1);
		 }
		 Pasngr_id++;
         
	
	//check record if exists 
	if(!rs.next()) {
		String ins=("insert into Passenger_portal(Pasngr_id,Pasngr_Name,Pasngr_Email,Pasngr_Passwd,Pasngr_Mobno,Pasngr_Address,Ad_id) values(?,?,?,?,?,?,?)");
		pst=conec.prepareStatement(ins);
		pst.setInt(1,Pasnger_id );
		pst.setString(2, Pasnger_Name);
		pst.setString(3,Pasnger_Email);
		pst.setString(4,Pasnger_Passwd);
		pst.setString(5, Pasnger_Mobno);
		pst.setString(6,Pasnger_Address);
		pst.setInt(7, Admin_ID);
		int i=pst.executeUpdate();
		if(i>0) {
			System.out.println("Record added successfully 🦾 🎁 ");
		}else
		{
			System.out.println("Record not added 🧐 🔎 ");
		}
		
	}else {
		System.out.println(" 🆔 Passenger id "+Pasnger_id+" exists 📲 ");
	}
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	finally {
		if(pst!=null) {
		pst.close();
		}
		if(rs!=null) {
		rs.close();
		}
		if(conec!=null) {
		conec.close();
	}
	
}
   }
 public  void updateRecord1() throws IOException, SQLException { 
		  try {
	  conec=MyBusConnectivity.getConnection(); 
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter Passenger_Name to update record 💼 🖋 📝 ");
	  Pasnger_Name=br.readLine(); 
	  System.out.println("Enter Passenger_ID to update record 💼 🖊 🆔 ");
	  Pasnger_id=Integer.parseInt(br.readLine());
	  String sel="select * from Passenger_portal where Pasngr_id=?";
	  
	  pst=conec.prepareStatement(sel);
	  pst.setInt(1,Pasnger_id );
	  rs=pst.executeQuery(); 
	  //for update record ,record should exists 
	  if(rs.next())
	  { 
		  String upr="update Passenger_portal set Pasngr_Name=? where Pasngr_id=?";
	  pst=conec.prepareStatement(upr);
	  pst.setString(1,Pasnger_Name);
	  pst.setInt(2,Pasnger_id); 
	  int i=pst.executeUpdate(); 
	  if(i>0) {
	  System.out.println(" 🙆🏻‍♀️ 🙆🏻‍♂️ Passenger Record updated 📬 👍🏻 "); 
	  }
	  else  {
	  System.out.println(" 🙅🏻‍♀️ 🙅🏻‍♂️ Passenger Not updated 📭 🙅🏻‍♀️ "); 
	  }
	  }else {
			System.out.println(" 🤷🏻‍♀️ 🤷🏻‍♂️ Passenger Record not exists 📪 🤡 ");
		}
	}catch(Exception e) {
		 e.printStackTrace();
	}
	finally {
		if(pst!=null) {
			pst.close();
			}
			if(rs!=null) {
			rs.close();
			}
			if(conec!=null) {
			conec.close();
		}
	}
	  }
   
  public void deleteRecord1() throws NumberFormatException, IOException, SQLException
   { 
 	   try { 
 		   conec = MyBusConnectivity.getConnection();
 		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   System.out.println(" 🙋🏻‍♀️💼 Passenger id 🆔 "); 
   Pasnger_id =Integer.parseInt(br.readLine());
   
   String sel="select * from Passenger_portal where Pasngr_id=?";
   
   pst=conec.prepareStatement(sel); 
   pst.setInt(1,Pasnger_id);
   rs=pst.executeQuery(); 
   //for update record, record should exists 
   if(rs.next())
   {
 	  String delr="delete from Passenger_portal where Pasngr_id=? ";
   pst=conec.prepareStatement(delr);
   
   pst.setInt(1,Pasnger_id); 
   int i=pst.executeUpdate();
   if(i>0) {
   System.out.println(" 🙋🏻‍♀️ Passenger Record deleted 🗑 "); 
   }
   else {
   System.out.println(" 🤦🏻‍♂️ Passenger Record not deleted 🗃 "); 
   }
   
   
   }
   else { 
 	  System.out.println("🙇🏻‍♂️ Passenger Record does not exists 📂 "); 
 	  } 
   } catch(Exception e) {
   e.printStackTrace(); 
   } finally { 
 	  if(pst!=null) {
 			pst.close();
 			}
 			if(rs!=null) {
 			rs.close(); 
 			}
 			if(conec!=null) {
 			conec.close();
 		}
 	  }
   }
   
 public  void insertRecord2() throws  IOException, SQLException {
		 try {
		conec=MyBusConnectivity.getConnection();
	   Scanner sr1=new Scanner(System.in);
	   SimpleDateFormat inputDate = new SimpleDateFormat ("dd/MM/yyyy HH:mm");
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
System.out.println("🚌 Enter Bus Fare 🎫");
Bus_Ticket=Double.parseDouble(br1.readLine());
System.out.println(" 🚏 Enter the start point 📍 ");
Start_Location=br1.readLine();	
System.out.println(" 🛑 Enter the destination point 📍 ");
Destination=br1.readLine();
System.out.println("Enter Passenger_id 🆔 ");
Pasnger_id=Integer.parseInt(br1.readLine());
System.out.println("check");

	String sel="SELECT max(Bus_id) FROM BusPass_portal";
	
	pst=conec.prepareStatement(sel);
	rs=pst.executeQuery();
	
		 if(rs.next())
		 {
		int Bus_id=rs.getInt(1);
		 }
		 Bus_id++;
       
	
	//check record if exists 
	if(!rs.next()) {
		String ins=("insert into BusPass_portal(Bus_id,Pasngr_id,Bus_fare,From_loc,To_loc,Depart_date) values(?,?,?,?,?,?)");
		pst=conec.prepareStatement(ins);
		pst.setInt(1,Bus_ID );
		pst.setInt(2, Pasnger_id);
		pst.setDouble(3, Bus_Ticket);
		pst.setString(4,Start_Location);
		pst.setString(5,Destination );
		pst.setString(6,format.format((new Date())));
		int i=pst.executeUpdate();
		if(i>0) {
			System.out.println(" 🎫 Bus Pass Record added successfully 🦾 🎁 ");
		}else
		{
			System.out.println(" 🎫 Bus Pass Record not added 🧐 🔎 ");
		}
		
	}else {
		System.out.println(" 🆔 Bus id "+Bus_ID+" exists 📲 ");
	}
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	finally {
		if(pst!=null) {
		pst.close();
		}
		if(rs!=null) {
		rs.close();
		}
		if(conec!=null) {
		conec.close();
	}
	
}
 }
 public  void updateRecord2() throws IOException, SQLException { 
	  try {
 conec=MyBusConnectivity.getConnection(); 
 BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter Bus Fare to update record 💼 🖋 📝 ");
 Bus_Ticket=Double.parseDouble(br1.readLine()); 
 System.out.println("Enter Bus ID to update record 💼 🖊 🆔 ");
  Bus_ID=Integer.parseInt(br1.readLine());
 String sel="select * from BusPass_portal where Bus_id=?";
 
 pst=conec.prepareStatement(sel);
 pst.setInt(1,Bus_ID);
 rs=pst.executeQuery(); 
 //for update record, record should exists 
 if(rs.next())
 { 
	  String upr="update BusPass_portal set Bus_fare=? where Bus_id=?";
 pst=conec.prepareStatement(upr);
 pst.setDouble(1,Bus_Ticket);
 pst.setInt(2,Bus_ID); 
 int i=pst.executeUpdate(); 
 if(i>0) {
 System.out.println(" 🙆🏻‍♀️ 🙆🏻‍♂️ Bus Pass Record updated 📬 👍🏻 "); 
 }
 else  {
 System.out.println(" 🙅🏻‍♀️ 🙅🏻‍♂️ Bus Pass Record not updated 📭 🙅🏻‍♀️ "); 
 }
 }else {
		System.out.println(" 🤷🏻‍♀️ 🤷🏻‍♂️ Bus Pass Record not exists 📪 🤡 ");
	}
}catch(Exception e) {
	 e.printStackTrace();
}
finally {
	if(pst!=null) {
		pst.close();
		}
		if(rs!=null) {
		rs.close();
		}
		if(conec!=null) {
		conec.close();
	}
}
   }
 public void deleteRecord2() throws NumberFormatException, IOException, SQLException
 { 
	   try { 
		   conec = MyBusConnectivity.getConnection();
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 System.out.println(" 🎫 Bus Pass id 🆔 "); 
 Bus_ID =Integer.parseInt(br.readLine());
 
 String sel="select * from BusPass_portal where Bus_id=?";
 
 pst=conec.prepareStatement(sel); 
 pst.setInt(1, Bus_ID);
 rs=pst.executeQuery(); 
 //for update record, record should exists 
 if(rs.next())
 {
	  String delr="delete from BusPass_portal where Bus_id=? ";
 pst=conec.prepareStatement(delr);
 
 pst.setInt(1,Bus_ID); 
 int i=pst.executeUpdate();
 if(i>0) {
 System.out.println(" 🙋🏻‍♀️ Bus Pass record deleted 🗑 "); 
 }
 else {
 System.out.println(" 🤦🏻‍♂️ Bus Pass record not deleted 🗃 "); 
 }
 
 
 }
 else { 
	  System.out.println("🙇🏻‍♂️ Bus Pass record does not exists 📂 "); 
	  } 
 } catch(Exception e) {
 e.printStackTrace(); 
 } finally { 
	  if(pst!=null) {
			pst.close();
			}
			if(rs!=null) {
			rs.close(); 
			}
			if(conec!=null) {
			conec.close();
		}
	  }
}
}
   

 