package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		
		// for - 반복회수 있는 경우
		// while - 조건식이 있을 경우
		
		// while 구구단 출력하시오.		
		int k = 2;
		while(k<=9) {
			System.out.printf("[ %d 단 ]",k);
			int l = 1;
			while(l<=9) {
				System.out.printf("%d * %d = %d \t",k,l,k*l);
				l++;
			}
			System.out.println();
			k++;
		}
				
		
			
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ]",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
			
		
		
//		int i = 1;
//		while(i<=5) {
//			System.out.println("안녕"+i);
//			i++;
//		}
//		
//		for(int j=1; j<=5; j++) {
//			System.out.println("안녕"+j);
//		}
		
		
		//입력받은 숫자부터 구구단이 시작되도록 프로그램을 구현하시오.
//		System.out.println("첫번째 숫자를 입력하세요");
//		int n1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요");
//		int n2 = scan.nextInt();
//		
//		int max,min;
//		if(n1>n2) {
//			max = n1;
//			min = n2;
//		}else {
//			max = n2;
//			min = n1;
//		}
//		
//		// 구구단
//		for(;min<=max;min++) {
//			System.out.printf("[ %d 단 ] \n",min);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t",min,j,min*j);
//			}
//			System.out.println();
//		}
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
		
		// for
//		for(int i=0;i<=10;i++) { // 무한반복
//			System.out.println(i);
//		}
		
//		// 입력받은 글자를 1개씩 출력하는 프로그램을 구현하시오.
//		System.out.println("영문자를 입력해 주세요.");
//		String input = scan.next();
//		
//		//1. 영문자인지 확인
//		int temp = 0;
//		for (int i=0;i<input.length();i++) {
//			if (!(input.charAt(i)>='a' && input.charAt(i)<='z' || input.charAt(i)>='A' && input.charAt(i)<='Z')) {
//				temp = 1;
//				break;
//			}
//		}
//		// 영문자 이면 출력 아니면 다시입력
//		if (temp==0) {
//			for (int i=0;i<input.length();i++) {
//				System.out.println(input.charAt(i));
//			}
//		}else {
//			System.out.println("입력한 글자중에 영문자가 아닌것이 있습니다. 다시 입력하세요.");
//		}
//		
//		for (int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
				
		// 단어를 1개씩 출력
//		String input = "abcdefghijk";
//		for (int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
		
				
//		System.out.println(input.length());
//		System.out.println(input.charAt(input.length()-1));
		
		
//		System.out.println("글자를 입력하세요.(영문자만 입력가능) : ");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
//			System.out.println("출력 : "+ch);
//		}else {
//			System.out.println("영문자가 아닙니다. 다시 입력하세요.!! ");
//		}
		
		
		// 반복문
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
	}

}
