package j0117;

public class Ja0117_08 {

	public static void main(String[] args) {
		
		// 카드모양 : spade,heart,diamond,clover
		// 숫자 : 1(A),2,3,4,5,6,7,8,9,10,11(j),12(q),13(k)
		// 총카드숫자 : 13 * 4 = 52장
		
		// 13장
		String[] shape = {"spade","heart","diamond","clover"};
		Card[] c = new Card[52];
		for (int i=0;i<c.length;i++) {
			c[i] = new Card();
			c[i].kind = shape[i/13];
			c[i].number = (i%13)+1;
		}
//		Card[] c = new Card[52];
//		for (int i=0;i<52;i++) {
//			//객체선언
//			c[i] = new Card();
//			if(i>=0 && i<=12) {
//				c[i].number = i+1;
//				c[i].kind = shape[0];
//			} else if(i>=13 && i<=25) {
//				c[i].number = i+1-13;
//				c[i].kind = shape[1];
//			} else if(i>=26 && i<=38) {
//				c[i].number = i+1-26;
//				c[i].kind = shape[2];
//			}else {
//				c[i].number = i+1-39;
//				c[i].kind = shape[3];
//			}
//		}
		
		for (int i=0;i<c.length;i++) {
			System.out.printf("[ %s %d ] \n",c[i].kind,c[i].number);
		}
		
		
		
		
		
		
//		Card c1 = new Card();
//		c1.kind = "Heart";
//		c1.number = 1;
//		Card c2 = new Card();
//		c2.kind = "Clover";
//		c2.number = 2;
//		
//		System.out.printf("[ %s,%d ] \n",c1.kind,c1.number);
//		System.out.printf("크기 : %d  %d \n",c1.width,c1.height);
//
//		// width, height
//		c2.width = 50;
//		c2.height = 70;
//		
//		System.out.printf("[ %s,%d ] \n",c1.kind,c1.number);
//		System.out.printf("크기 : %d  %d \n",c1.width,c1.height);

	}

}
