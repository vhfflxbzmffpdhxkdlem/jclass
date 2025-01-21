package jcard;

import java.util.Scanner;

public class Ja01 {

	public static void main(String[] args) {
		Deck d = new Deck();
		
		// 52장 카드를 생성 -> 52장 카드를 순차적으로 출력
		d.print_all(52);
		
		// 랜덤으로 섞기 해서 52장을 출력
		d.shuffle();
		
		// 0-51까지의 숫자를 입력받아, 해당되는 카드를 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int x = scan.nextInt();
		
		Card c = d.pick(x);
		d.print_all(c);
	}

}
