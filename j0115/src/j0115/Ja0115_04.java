package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_04 {

	public static void main(String[] args) {
		// 1-100 랜덤숫자를 생성
		// 10번의 도전으로 해서 정답을 맞추면 종료
		// 랜덤숫자보다 큰수, 작은수 입니다.
		// 입력한 숫자를 모두 출력
		
		// 랜덤숫자 : 55
		// 입력한 숫자 : 1,2,3,4,5
		// 도전 : 5
		Scanner scan = new Scanner (System.in);
		int ran = (int)(Math.random()*100)+1;
		int count = 0;
		int j[] = new int[10] ;
		for (int i=0;i<10;i++) {
			System.out.printf("%d번재 도전입니다.",i+1);
			count ++;
			int input = scan.nextInt();
			j[i] = input;		
			if (input>ran) {
				System.out.println("랜덤숫자보다 큰수 입니다.");
			}else if (input<ran) {
				System.out.println("랜덤숫자보다 작은수 입니다.");				
			}else {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.printf("랜덤숫자 : %d \n",ran);
		System.out.printf("도전 횟수 : %d \n",count);
		System.out.print("입력한 숫자 : ");	
		for (int k=0;k<count;k++) {
			if(k==(count-1)) {
				System.out.print(j[k]);	
			}else {
				System.out.print(j[k]+",");	
			}
		}
		
		
		
		
		
	}

}
