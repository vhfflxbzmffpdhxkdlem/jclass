package j0120;

import java.util.Scanner;

public class Cal4 {
	
	Cal4(){} // 기본 생성자
	
	void input(String[] name,int[] kor) {
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<name.length;i++){
			System.out.printf("%d번 이름을 입력해주세요.",i+1);
			name[i] = scan.next();
			System.out.printf("%d번 국어점수를 입력해주세요.",i+1);
			kor[i] = scan.nextInt();
		}
	}
	
	
}
