package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_13 {

	public static void main(String[] args) {
		// 로또맞추기
		
		// 1-45까지 로또 번호 6개와
		// 입력한 숫자 6개를 비교해서 맞춘 개수와 번호를 출력하시오.
		// 1. 변수선언
		// 2. 1-45 변수저장
		// 3. 베열섞기
		// 4. 6개 로또번호
		// 5. 입력창 만들기
		// 6. 맞춘번호 확인- input,lotto
		// 7. 출력
		// 8. 순위별로 가격 나오게 하기
		Scanner scan = new Scanner(System.in);
		
		// 1. 변수선언
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] input = new int[6];
		int[] answer = new int[6];
		int temp = 0;
		int k=0;
		int count = 0;
		
		// 2. 1-45 변수저장
		for (int i=0;i<45;i++) {
			ball[i] = i+1;
		}
		
		// 3. 베열섞기
		for(int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*45); //0-44
			temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
		}
		
		// 4. 6개 로또 번호
		for (int i=0;i<6;i++) {
			lotto[i] = ball[i];
		}
		System.out.println("로또번호 : "+Arrays.toString(lotto));

		// 5. 입력창 만들기
		String[] balls = new String[45];
		for (int i=0;i<balls.length;i++) {
			balls[i]=i+1+"";
		}
		
		
		while(k<6) {
			System.out.print("           [ 로또맞추기 ]");
			for(int j=0;j<balls.length;j++) {
				if(j%5==0) {
					System.out.println();
				}
				System.out.print(balls[j]+"\t");
			}
			
			System.out.println();
			System.out.printf("원하는 번호를 입력하세요.( 입력: %d번째 ) : \n",k+1);
			input[k] = scan.nextInt();
     		balls[input[k]-1] = "X";
			k++;
		}
		// 6. 맞춘번호 확인 - input,lotto
		
		for (int i=0;i<lotto.length;i++) {
			for (int j=0;j<lotto.length;j++) {
				if(input[i]==lotto[j]) {
					answer[count] = lotto[j];
					count++;
					break;
				}
			}
		}
		
		// 7. 출력
		System.out.println("[ 로또번호 확인 ]");
		System.out.print("로또번호 : ");
		System.out.println(Arrays.toString(lotto));
		System.out.println("입력번호 : ");
		System.out.println(Arrays.toString(input));
		System.out.print("맞춘개수 : ");
		System.out.println(count);
		System.out.print("맞춘번호 : ");
		for (int i=0;i<count;i++) {
			System.out.print(answer[i]+" ");
		}
		
	}
	
	

}
