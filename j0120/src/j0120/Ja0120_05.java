package j0120;

import java.util.Arrays;

public class Ja0120_05 {

	public static void main(String[] args) {
		
		// 객체선언
		Cal4 c4 = new Cal4();
		// name,kor를 보내서 데이터를 입력받아,
		// main메소드에서 출력하시오.
		String[] name = new String[3];
		int[] kor = new int[3];
		c4.input(name,kor);
		for (int i=0;i<3;i++) {
			System.out.printf("[%s,%d]\n",name[i],kor[i]);
		}
		

	}

}
