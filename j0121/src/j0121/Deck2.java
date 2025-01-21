package j0121;

public class Deck2 {
	Deck2(){}
	Card2[] c2 = new Card2[52];
	
	void read() {
		System.out.println("[ 카드게임 ]");
		System.out.println("1. 카드생성");
		System.out.println("2. 카드출력");
		System.out.println("3. 카드섞기");
		System.out.println("4. 내 카드선택");
		System.out.println("5. 내 카드 출력");
		System.out.println("6. 컴퓨터 카드 받기");
		System.out.println("7. 내 카드와 컴퓨터 카드 비교");
		System.out.println("8. 누적 상금보기");
		System.out.println("0. 종료");
		System.out.println("---------------------------");
		System.out.println("원하는 번호를 선택해주세요");
	}
	
	void input() {
		System.out.println("[ 카드생성 완료 ]");
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c2[i*13+j] = new Card2(i,j+1);
			}
		}
	}
	
	void print(int no) {
		System.out.println("[ 카드출력 ]");
		for(int i=0;i<no;i++) {
			System.out.printf("[ %s,%s ]\n",c2[i].s,c2[i].number);
		}
	}
	
}
