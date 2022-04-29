package pgms.series;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=0,no2=2,no3,i,count=10;
		System.out.print(no1+" "+no2);//0 2
		for(i=2;i<count;++i) {
			no3=no1+no2;//0+2=2
			System.out.print(" "+no3);//0 2 2
			no1=no2;//2
			no2=no3;//2
		}
		
	}

}
