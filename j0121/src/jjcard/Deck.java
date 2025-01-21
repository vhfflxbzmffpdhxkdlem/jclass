package jjcard;

import javax.swing.plaf.synth.SynthScrollPaneUI;

class Deck {
	
	final int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM];
	
	// 번호부여 메소드
	void input() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[i*13+j] = new Card(i,j+1);
			}
		}
	}// input
	
	// 개수출력 - 전체52, 5
	void print(int cnt) {
		for(int i=0;i<cnt;i++) {
			System.out.println(c[i]);
		}
	}
	
	// 해당번호 출력
	void print(Card c) {
		System.out.println(c);
	}
	
	void shuffle() {
		Card temp = null;
		int randomNo = 0;
		for (int i=0;i<300;i++) {
			randomNo = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[randomNo];
			c[randomNo] = temp;
		}
	}
	
	// 카드 뽑기
	Card pick(int no) {
		return c[no];
	}
	
}
