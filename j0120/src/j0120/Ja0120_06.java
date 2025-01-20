package j0120;

public class Ja0120_06 {

	public static void main(String[] args) {
//		int total = 1;
//		for (int i=1;i<=5;i++) {
//			total = total*i;
//		}
//		System.out.println(total);
		
		// 객체선언
		System.out.println(fac(4));
		
		int k = 0;
		double m = 0;
		float n = 0;
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);
		
		
	}

	static long fac(int n) {
		long result = 0;
		if (n==1) {
			result = 1;
		}else {
			result = n*fac(n-1);
		}
		return result;
	}
	
//	static long fac(double n) {
//
//	}
//	
//	static long fac(int n,int b) {
//		
//	}
}
