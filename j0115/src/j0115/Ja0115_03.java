package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_03 {

	public static void main(String[] args) {
		// 1-5까지의 랜덤 숫자를 생성해서
		// 5번 입력받아 랜덤숫자를 몇번 맞췄는지 횟수를 울력하시오.
		// 입력했던 숫자도 모두 출력하시오.
		
		// 램덤숫자 : 3
		// 정답횟수 : 1
		// 입력숫자 : 1,2,3,4,5
		
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random()*5)+1;
		int input[] = new int[5];
		int j = 0;
		for (int i=0;i<5;i++) {
			System.out.printf("%d번째 도전 (숫자입력)",i+1);
			input[i] = scan.nextInt();
			if(input[i]==ran) {
				j += 1;
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다.");
			}
		}
		System.out.printf("랜덤숫자 : %d \n",ran);
		System.out.printf("정답횟수 : %d \n",j);
		System.out.printf("입력숫자 : %d,%d,%d,%d,%d \n",input[0],input[1],input[2],input[3],input[4]);
		System.out.println("입력숫자 : "+Arrays.toString(input));
		System.out.printf("입력숫자 : %s \n",Arrays.toString(input));
		
	}

}
