package j0131;

import java.util.Scanner;

public class ShopMall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 상품관리 - Product - Tv,Computer,
		//Refrigerator 1200000 120000
		//Washing 900000 90000
		// 구매리스트보기
		// 유저관리 - Buyer
		// 메소드관리 - shop_Deck
		// 메인 - ShopMall
		
		Shop_Deck sd = new Shop_Deck();
		int choice = 0;
		
		// 로그인메소드호출
		sd.login(); 
		
		loop:while(true){
			// 화면출력
			choice = sd.mainPrint();
			switch(choice) {
			case 1:
				sd.buy(new Tv()); //"LGTV",1000000,100000,50,"LED","BLACK"
				break;
			case 2:
				sd.buy(new Tv("LG75TV",1500000,150000,75,"LED","BLACK"));
				break;
			case 3:
				sd.buy(new Computer());
				break;
			case 4:
				sd.buy(new Refrigerator());
				break;
			case 5:
				sd.buy(new Washing());
				break;
			case 6:
				sd.buy(new Washing());
				break;
			case 7: // 상품구매리스트
				sd.proList();
				break;
			case 8: //현금충전
				sd.charge();
				break;
			case 9:
				break;
			default:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}
		}
		
		
		
		
		

	}
}

