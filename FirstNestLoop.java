package nestingrepeat;

public class FirstNestLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k=1;
for(i=1;i<=4;i++) {
	
	for(j=1;j<=i;j++) {
		System.out.print(k+" @ ");
		k=k+1;
		System.out.println();
	}
	//System.out.println();
}
	}

} 
