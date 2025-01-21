package j0121;

public class Ja0121_02 {

	public static void main(String[] args) {
		String[] n = {"","A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		Card[] c = new Card[52]; //Card 배열
		// A,2,3,4,5,6,7,8,9,10,J,Q,K
		String[] shape = {"Spade","Diamond","heart","Clover"};
		// 입력
		for(int i=0;i<4;i++) {
			for (int j=0;j<13;j++) {
				c[i*13+j] = new Card(shape[i],j+1);
			}
		}
		System.out.println(c[11]);
		System.out.printf("[%s,%s]\n",c[11].shape,n[c[11].number]);
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				System.out.printf("[%s,%s]\n",c[i*13+j].shape,n[c[i*13+j].number]);
			}
		}
		// 출력
//		for(int i=0;i<4;i++) {
//			for (int j=0;j<13;j++) {
//				System.out.printf("[ %s, %d ] \n",c[i*13+j].shape,c[i*13+j].n);
//			}
//		}

	}

}
