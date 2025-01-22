
package jbuy;

import java.util.Scanner;

class JaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로그인구현
		// 보유한 금액, 보너스 포이트가 설정
		Buyer b = new Buyer(); //b 10000000,0
		
		loop:while(true) {
			System.out.println("[ 전자제품 쇼핑목 ]");
			System.out.println("1. Tv");
			System.out.println("2. Computer");
			System.out.println("3. Audio");
			System.out.println("9. 구매(cart)정보보기");
			System.out.println("구매를 원하는 번호를 입력하세요.");
			int choice  = scan.nextInt();
			
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
				b.cartInfo();
				break;
			default:
				System.out.println("상점에서 나갑니다.");
				break loop;
			}// switch
		}// while
	}

}
