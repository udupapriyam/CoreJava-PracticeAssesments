package myAssesment;

public class Program17 {

	public static void main(String[] args) {
		int a=12,b=20,c=33,evensum=0;
		if(a%2==0) {
			evensum+=a;
		}
		if(b%2==0) {
			evensum+=b;
		}
		if(c%2==0) {
			evensum+=c;
		}
		System.out.println("Sum of odd = "+evensum);
	}

}
