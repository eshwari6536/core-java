package pgms.series;

public class Tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=0,no2=1,no3=2,no4,i,count=10;//c=0-9
		System.out.print(no1+" "+no2+" "+no3);//0 1 2
		for(i=3;i<count;i++) {
			no4=no1+no2+no3;//0+1+2
			System.out.print(" "+no4);//0 1 2 3
			no1=no2;//1
			no2=no3;//2
			no3=no4;//3
		}
	}

}
