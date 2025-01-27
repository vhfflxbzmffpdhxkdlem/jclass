package j0127;

import java.util.ArrayList;
import java.util.Scanner;


public class LottoMain {
	public static void main(String[] args) {
		// 1. ball 객체
		// 2. ball_deck 객체(
		// - ball 45개 생성, ball 숫자 입력, ball 섞기
		// - 6개 로또번호 추출, 6개 숫자 입력, 로또 번호 와 입력번호 비교
		// - 출력화면이 있음.
		// 3. main에서 로또 프로그램을 실행해서
		// 6개 숫자입력, 로또번화와 비교해서 몇개를 맞췄는지 확인
		Scanner scan = new Scanner(System.in);
		String input = "";
		int choice = 0;
		BallDeck bd = new BallDeck();
		
		loop:while(true) {
			bd.main_page();
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				bd.ball_create();
				break;
			case 2:
				bd.ball_mix();
				break;
			case 3:
				bd.check();
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
		}
		
	}
}
