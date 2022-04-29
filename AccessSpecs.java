package oopsC1;

 class AccessSpecs {
	private int sid;
	String name;
	public  String cname;
	protected float fees;
 
	public AccessSpecs(int sid, String name, String cname, float fees) {
		//super();
		this.sid = sid;
		this.name = name;
		this.cname = cname;
		this.fees = fees;
	}
 
 
 
 



	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecs as=new AccessSpecs(1,"sheela","BIT",5678.4f);
		System.out.println();
		//System.out.println("id ="+as.id);//error id is private cannot be accessed another class
				System.out.println("name ="+as.name);//default 
				System.out.println("cname="+as.cname);
				System.out.println("Fees="+as.fees);

	}
	}


