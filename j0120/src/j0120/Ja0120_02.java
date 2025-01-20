package j0120;

import java.util.Arrays;

public class Ja0120_02 {

	public static void main(String[] args) {
		
		Arr a = new Arr();
		
		System.out.println(Arrays.toString(a.num));
		
		for(int i=0;i<a.num.length;i++) {
			System.out.println(a.num[i]);
		}
		cal(a.num);
		System.out.println(Arrays.toString(a.num));
	}

	static void cal(int[] num) {
		// num 배열에 10을 더해서 값을 돌려줌.
		for (int i=0;i<num.length;i++) {
			num[i] = num[i]+10;
		}
	}
}
