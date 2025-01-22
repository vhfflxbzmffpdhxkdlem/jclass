package jjbuy;

import java.util.ArrayList;

class Buyer {
	//변수지정
	int count = 0;
	int money = 100000000;
	int bonusPoint = 0;
	int total = 0;
	
	ArrayList list = new ArrayList();
	
	//생성자
	Buyer(){}
	Buyer(int money,int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	//나의 정보메소드
	void myInfo() {
		System.out.printf("[ 보유금액 : %d ] \n",money);
		System.out.printf("[ 보유포인트 : %d ] \n",bonusPoint);
	}
	
	//구매 메소드
	void buy(Product p) {
		list.add(p);
		money -= p.price;
		bonusPoint += p.bonusPoint;
		total += p.price;
	}
	
	//구메 목록 메소드
	void cartInfo() {
		System.out.println("구매목록 : ");
		for (int i=0;i<list.size();i++) {
			System.out.printf("%s,((Product)list.get(i)).name");
			System.out.println();
		}
		System.out.println();
		System.out.printf("구매개수 : %d \n",list.size());
		System.out.printf("총구매금액 : %d \n",total);
	}
	
}
