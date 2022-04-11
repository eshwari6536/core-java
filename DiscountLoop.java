package Loops;

import java.util.Scanner;

public class DiscountLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner dl = new Scanner(System.in);
		        System.out.print("Enter total cost: ");
		        double Total_amt = dl.nextDouble();
		        double Discount_amt;
		        
		        if (Total_amt <= 2000) {
		        	Discount_amt = Total_amt - (Total_amt * 5 / 100.0);
		        	System.out.println("discount availed: " +5+" percent");
		        	System.out.println("Amount to be paid: " +Discount_amt);
		        	System.out.println("YAY you have won a wall clock!!!");
		        }
		        else if (Total_amt <= 5000) {
		        	Discount_amt = Total_amt - (Total_amt * 10 / 100.0);
		        	System.out.println("discount availed: " +10+" percent");
		        	System.out.println("Amount to be paid: " +Discount_amt);
		        	System.out.println("Amount to be paid: " +Discount_amt);
		        	System.out.println("YAY you have won a School bag!!!");
		        }
		        else if (Total_amt <= 10000) {
		        	Discount_amt = Total_amt - (Total_amt * 15 / 100.0);
		        	System.out.println("discount availed: " +15+" percent");
		        	System.out.println("Amount to be paid: " +Discount_amt);
		        	System.out.println("YAY you have won an Electric iron!!!");
		        }
		        else {
		        	Discount_amt = Total_amt - (Total_amt * 20 / 100.0);
		        	System.out.println("discount availed: " +20+" percent");
		        	System.out.println("Amount to be paid: " +Discount_amt);
		        	System.out.println("YAY you have won a Wrist watch!!!");
		        }
		        
		        //System.out.println("Amount to be paid: " +Discount_amt);
		        
		    }
		}

	


