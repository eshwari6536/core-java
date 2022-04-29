
public class RunRunRun implements Runnable {
	  public void run()
      {
             System.out.println("thread running...");
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunRunRun t1=new RunRunRun();
         Thread t = new Thread(t1, "mythread");
         t.start();
         int g=3;
         System.out.println((g++)*8);

	}

}
/*
public class MyThread implements Runnable
{ 
    
        public void run()
        {
               System.out.println("thread running...");
        }
        public static void main(String[] args)
        {
                MyThread t1=new MyThread();
                Thread t = new Thread(t1, "mythread");
                t.start();
                System.out.println("Thread Name: "+t.getName());
        }
}
    */