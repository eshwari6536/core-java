class Customer{    
	int amount=10000;    
	    
	synchronized void withdraw(int amount){    
	System.out.println("going to withdraw...");    
	    
	if(this.amount<amount){    
	System.out.println("Less balance...of "+this.amount+ " waiting for deposit...");    
	try{wait();}catch(Exception e){}    
	}    
	this.amount-=amount;    
	System.out.println("withdraw completed of..."+this.amount);    
	}    
	    
	synchronized void deposit(int amount){    
	System.out.println("going to deposit...");    
	this.amount+=amount;    
	System.out.println("deposit completed...of "+this.amount);    
	notify();    
	}    
	}    
public class BankTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer c=new Customer();    
		new Thread(){    
		public void run(){
			c.withdraw(15000);
			}    
		}.start();    
		new Thread(){    
		public void run(){
			c.deposit(10000);}    
		}.start();    
		    
	}

}
