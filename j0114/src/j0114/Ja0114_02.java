package j0114;

import java.util.Scanner;

public class Ja0114_02 {

	public static void main(String[] args) {
		// 입력을 받으려면 
		// 1. Scanner 선언
		// 정수형 - nextInt, nextLong, nextByte, nextShort
		// 실수형 - nextFloat, nextDouble
		// 문자열 - next, nextLine
		
		
		
		// 입력을 위해서 객체선언을 해야 함. 
		Scanner scan = new Scanner(System.in);
		
		//-----------------------------------------
		System.out.println("문자열을 입력하세요");
		String str1 = scan.next();
		System.out.println("문자열1 : "+str1);
		scan.nextLine();
		
		// 문자열
		System.out.println("문자열을 입력하세요");
		String str2 = scan.nextLine();
		System.out.println("문자열1 : "+str2);
		
		
//		System.out.println("정수를 입력하세요.");
//		int num = scan.nextInt();
//		System.out.println("정수 : "+num);
//		System.out.println("실수를 입력하세요.");
//		double f = scan.nextDouble();
//		System.out.println("실수 : "+f);
//		
		
		
		

	}

}
