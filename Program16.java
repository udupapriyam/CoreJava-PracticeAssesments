package myAssesment;

public class Program16 {

	public static void main(String[] args) {
		int a=11,b=20,c=33,oddsum=0;
		if(a%2!=0) {
			oddsum+=a;
		}
		if(b%2!=0) {
			oddsum+=b;
		}
		if(c%2!=0) {
			oddsum+=c;
		}
		System.out.println("Sum of odd = "+oddsum);
	}

}
