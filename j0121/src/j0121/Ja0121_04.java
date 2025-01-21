package j0121;

import java.util.Scanner;

public class Ja0121_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 카드게임
		// 카드게임을 실행합니다.
		// 컴퓨터 랜덤으로 1개를 뽑고
		// my 1-52카드중에 내가 1개를 뽑아서 
		// 무늬가 Spade,Diamond,heart,Clover
		// 숫자가 높은 사람이 승리해서
		// 100만원을 지급하는 프로그램을 구현하시오.
		Deck2 d2 = new Deck2();
		int choice = 0;
		loop : while(true) {
			d2.read();
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				d2.input();
				break;
				
			case 2:
				d2.print(52);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			default:
				System.out.println("[ 프로그램을 종료합니다. ]");
				break loop;
			}
			
			
			
		}
		

	}

}
