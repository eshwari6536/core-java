package nestingrepeat;

public class LabelledLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
outer:
	for(i=1;i<=5;i++) {
	inner:
		for(j=1;j<=5;j++) {
			if(j==3) {
			break outer;
			/*break inner;
			continue inner;
			continue outer;*/
		}
			else {
				
		System.out.println("i= "+i+" j= "+j);
	}
		}

	}
	}

}
