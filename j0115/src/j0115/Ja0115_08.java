package j0115;

public class Ja0115_08 {

	public static void main(String[] args) {
		// 1-10까지 랜덤숫자를 입력받아 저장하는데, 동일한 번호가 없게 저장하시오.
		
		int[] num = new int[10];
		int i = 0;
		loop:while (i<10) {
			int ran = (int)(Math.random()*10)+1;
			for (int k=0;k<i;k++) {
				if (num[k] == ran) {
					System.out.println("번호가 동일합니다. "+ran);
					continue loop;
				}
			}
			num[i] = ran;
			i++;
		}
		System.out.print("랜덤숫자 :");
		for (int j=0;j<num.length;j++) {
			System.out.print(num[j]+" ");
		}
		System.out.println();
		
		//------------------------------
		int[] ball = new int[10];
		//1-10 번호저장
		for (int l=0;l<ball.length;l++) {
			ball[l] = l+1;
		}
		
		// 배열 섞기
		int temp = 0;
		for (int l=0;l<300;l++) {
			int ranNum = (int)(Math.random()*10); //0-44
			temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
		}
		
		
		// 섞은 배열을 출력
		System.out.print("랜덤숫자 :");
		for (int l=0;l<ball.length;l++) {
			System.out.print(ball[l]+" ");
		}
		System.out.println();
	}

}
