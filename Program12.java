package myAssesment;

public class Program12 {

	public static void main(String[] args) {
		int a=10,b=20,c=30,big = 0;
		if(a>b) {
			if(b>c) {
				big=a;
			}
		}
		else{
			if(b>c) {
				big=b;
			}
			else {
				big=c;
			}
		}
		System.out.println("Result = "+big);
	}

}
