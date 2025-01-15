package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_05 {

	public static void main(String[] args) {
		// 이름,국어점수 - 5명의 학생의 국어성적을 입력하려고 함.
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		// 이름과 국어,영어를 입력받아, 합계,평균(소수점 3자리까지) 출력
		
		for (int i=0;i<name.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요 \n",i+1);
			name[i] = scan.next();
			System.out.printf("%d번째 국어점수를 입력하세요 \n",i+1);
			kor[i] = scan.nextInt();
			System.out.printf("%d번째 영점수를 입력하세요 \n",i+1);
			eng[i] = scan.nextInt();
			total[i] = kor[i]+eng[i];
			avg[i] = total[i]/2.0;
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(eng));
		System.out.println(Arrays.toString(total));
			
		for (int j=0;j<name.length;j++) {
			System.out.printf("%.3f\t",avg[j]);
		}
		

	}

}
