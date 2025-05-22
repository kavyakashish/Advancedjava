package day6;

public class ex3 {
	public static long ex1(long n) {
		long a=1,sum=0;
		while(n>0) {
			sum+=(n%10)*a;
			a=a*2;
			n=n/10;
			
		}
		return sum;

		
		
	}
	public static long ex2(long n) {
		long a=1,sum=0;
		while(n>0) {
			sum+=(ex1(n%1000))*a;
			a=a*10;
			n=n/1000;
			
		}
		return sum;

		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
long n=111010101;
System.out.println(ex2(n));

	}

}
