package jjcard;

import java.util.Scanner;

public class JaMain extends Object {
	JaMain(){}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();
		Card[] my_card = new Card[5];
		int choice = 0;
		
		loop:while(true) {
			System.out.println("[ 카드 게임 ]");
			System.out.println("----------------------------");
			System.out.println("1. 카드생성-번호부여");
			System.out.println("2. 카드출력");
			System.out.println("3. 카드섞기");
			System.out.println("4. 카드 5장 받기");
			System.out.println("5. 내카드 보기");
			System.out.println("6. 특정위치 카드 출력");
			System.out.println("0. 종료");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("[ 카드생성 ]");
				d.input();
				break;
			case 2:
				 System.out.println("[ 카드 전체출력 ]");
				 System.out.println("----------------");
				d.print(52);
				break;
			case 3:
				d.shuffle();
				System.out.println("[ 카드섞기완료!! ]");
				break;
			case 4:
				System.out.println("[ 카드 5장 받기 ]");
				for (int i=0;i<5;i++) {
					my_card[i] = d.pick(i);
				}
				break;
			case 5:
				System.out.println("[ 내 카드 출력 ]");
				System.out.println("----------------");
				for (int i=0;i<5;i++) {
					System.out.println(my_card[i]);
				}
				break;
			case 6:
				System.out.println("몇번째 카드를 가져오시겠습니까?");
				int no = scan.nextInt();
				Card c_pick = d.pick(no);
				d.print(c_pick);
				break;
			default:
				System.out.println("[ 프로그램을 종료합니다. ]");
				break loop;
			}
		}

	}

}
