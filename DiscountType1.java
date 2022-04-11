package Loops;

import java.util.Scanner;

public class DiscountType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner dt1 = new Scanner(System.in);
		 System.out.println("enter the SL.NO: ");
		 int no=dt1.nextInt();
		 System.out.println("enter the name: ");
		 String nam=dt1.next();
		 System.out.println("enter the ticket charge: ");
		 
		 double Total_amt = dt1.nextDouble();
		 System.out.println("discount availed in percent");
		 int dis=dt1.nextInt();
	        double Discount_amt;
	        
	        if (Total_amt <25001) {
	        	Discount_amt = Total_amt - (Total_amt * 2 / 100.0);
	        	
	        	System.out.println("discount availed: " +2+" percent");
	        	
	        	
	        	
	        }
	        else if (Total_amt <=35000) {
	        	Discount_amt = Total_amt - (Total_amt * 10 / 100.0);
	        	System.out.println("discount availed: " +10+" percent");
	        	
	        	
	        }
	        else if (Total_amt <= 55000) {
	        	Discount_amt = Total_amt - (Total_amt * 12 / 100.0);
	        	System.out.println("discount availed: " +12+" percent");
	        	
	        	
	        }
	        else if (Total_amt <= 70000) {
	        	Discount_amt = Total_amt - (Total_amt * 16 / 100.0);
	        	System.out.println("discount availed: " +16+" percent");
	        	
	        	
	        }
	       	        else {
	        	Discount_amt = Total_amt - (Total_amt * 18 / 100.0);
	        	System.out.println("discount availed: " +18+" percent");
	        	
	        	
	        }
	       
	        System.out.println("Amount to be paid: " +Discount_amt);
	        System.out.println("SL.NO "+"\t\t"+"Name"+"\t\t"+"TicketCharge"+"\t\t"+"Discount"+"\t\t"+"NetAmount"+"\t\t");
	        System.out.println(no+"\t\t"+nam+"\t\t"+Total_amt+"\t\t\t"+dis+"\t\t\t"+Discount_amt+"\t");
	    }
	}
	


