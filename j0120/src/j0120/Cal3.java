package j0120;

import java.util.Arrays;

public class Cal3 {
	
	int[] op(int a,int b,int[] re){
		re[0] = a+b;
		re[1] = a-b;
		re[2] = a*b;
		System.out.println(Arrays.toString(re));
		return re;
	}
	
	
}
