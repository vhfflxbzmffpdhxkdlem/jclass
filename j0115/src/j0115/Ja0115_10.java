package j0115;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ja0115_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] balls = new String[45];
		int[] input = new int[6];
		for (int i=0;i<balls.length;i++) {
			balls[i] = i+1+"";
		}
		
		int count = 0;
		while(count<6) {
			System.out.print("           [ 로또맞추기 ]");
			for (int i=0;i<balls.length;i++) {
				if(i%5==0) {
					System.out.println();
				}
				System.out.print(balls[i]+"\t");
			}
			System.out.println();
			System.out.printf("원하는 번호를 입력하세요.( 입력 : %d번째 ) \n",count+1);
			input[count] = scan.nextInt();

			// 입력한 번호 5 -> 5번 자리 X를 입력
			balls[input[count]-1] = "X";
			count++;
		}
		
		// 입력번호 : 모두 출력되도록 하시오.
		System.out.print("입력번호 : ");
		
		
		
		
		
		//		int[] num = {11,9,13,28,5,20,7};
//		Integer[] num2 = {11,9,13,28,5,20,7};
//		System.out.println(Arrays.toString(num));
		//순차정렬
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
		//역순정렬
//		Arrays.sort(num2,Collections.reverseOrder());
//		System.out.println(Arrays.toString(num2));
		
		// 정렬.
	}

}
