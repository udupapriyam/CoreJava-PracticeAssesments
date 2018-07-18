package myAssesment;

public class Program13 {

	public static void main(String[] args) {
		int a=10,b=20,c=30,small = 0;
		if(a<b) {
			if(b<c) {
				small=a;
			}
		}
		else{
			if(b<c) {
				small=b;
			}
			else {
				small=c;
			}
		}
		System.out.println("Result = "+small);
	}

}
