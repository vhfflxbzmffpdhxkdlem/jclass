package j0115;

import java.util.Scanner;

public class Ja0115_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5개의 숫자를 입력받아, 5개를 저장하고, 5개의 값을 출력하고 합계를 출력

		int input[] = new int[5];
		int sum = 0;
		for (int i=0;i<input.length;i++) {
			System.out.printf("%d번쩨 숫자를 입력하세요. \n",i+1);
			input[i] = scan.nextInt();
			sum += input[i];
		}
		for (int i=0;i<input.length;i++) {
			System.out.printf("%d번째 숫자 : %d \n",i+1,input[i]);
		}
		System.out.printf("합계 : %d",sum);
		

	}

}
