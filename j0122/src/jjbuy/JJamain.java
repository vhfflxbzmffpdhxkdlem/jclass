package jjbuy;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

class JJamain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b = new Buyer();
		
		loop: while(true) {
			System.out.println("[ 전자제품 쇼핑몰 ]");
			System.out.println("1. Tv");
			System.out.println("2. COMPUTER");
			System.out.println("3. AUDIO");
			System.out.println("9. 구매(cart)정보보기");
			System.out.println("0. 종료");
			System.out.println("구매를 원하는 번호를 입력하세요.");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				b.buy(new Tv());
				b.myInfo();
				break;
			case 2:
				b.buy(new Computer());
				b.myInfo();
				break;
			case 3: 
				b.buy(new Audio());
				b.myInfo();
				break;
			case 9:
				b.myInfo();
				b.cartInfo();
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
		
		}

	}

}
