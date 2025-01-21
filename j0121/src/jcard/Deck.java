package jcard;


public class Deck {

	Deck(){
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(s[i],j+1);
			}
		}
	}
	
	// 변수선언
	Card[] c = new Card[52];
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","k"};
	String[] s = {"Spade","Diamond","Heart","Clover"};
	
	// 카드 출력
	void print_all(int no) {
		System.out.printf("[ %d개 카드 출력 ] \n",no);
		for(int i=0;i<no;i++) {
			System.out.printf("[ %s,%s ]\n",c[i].shape,n[c[i].number]);
		}
	}
	
	// 번째카드 출력
	void print_all(Card c) {
		System.out.printf("[ %d번째 카드 출력 ] \n",c.number);
		System.out.printf("[ %s,%s ]\n",c.shape,n[c.number]);
		
	}
	
	// 카드 섞기
	void shuffle() {
		Card temp = null;
		int randomNo = 0;
		for(int i=0;i<300;i++) {
			randomNo = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[randomNo];
			c[randomNo] = temp;
		}
		
	}
	Card pick(int no) {
		System.out.println("------------");
		if(no>=1 && no<=52) {
			System.out.println(c[no].number);
			return c[no];
		}else {
			System.out.println("[경고] 번호 확인을 하셔야 합니다.");
			return c[0];
		}
	}
}
