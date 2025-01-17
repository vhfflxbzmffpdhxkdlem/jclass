package j0117;

import java.util.Scanner;

public class Ja0117_09 {
	
//	// 메소드
//	int add(int a,int b) {
//		int resrult = a+b;
//		return resrult; 
//	}
//	
//	boolean power; // 인스턴스변수 - 객체선언후 , 참조변수명.변수명
//	void power() {
//		power = !power;
//	}
	
	//메소드
	public static void main(String[] args) {
		
		// 2개의 값을 넘겨주면
		// 메소드 3개 
		// a,b -> a,b 각각 10더해서 두수를 더하기 해서 리턴
		// a,b -> a,b 각각 10곱해서 두수를 더하기 해서 리턴
		// a,b -> a,b 곱해서 리턴
		
		Scanner scan = new Scanner(System.in);
		// 입력이 -1 들어오면 프로그램을 종료하시오.
		Cal2 c = new Cal2();
		
		while(true) {
			System.out.println("첫번째 숫자를 입력해주세요 (종료하기 -1)");
			int num = scan.nextInt();
			if(num == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("두번째 숫자를 입력해주세요");
			int num2 = scan.nextInt();
			int result1 = c.add(num, num2);
			int result2 = c.rh(num, num2);
			int result3 = c.gk(num, num2);
			System.out.println("1.  "+result1);
			System.out.println("2.  "+result2);
			System.out.println("3.  "+result3);
		}
		
		
//		int num = 5;
//		int num2 = 3;
//		int result1 = c.add(num, num2);
//		int result2 = c.rh(num, num2);
//		int result3 = c.gk(num, num2);
//		System.out.println("1.  "+result1);
//		System.out.println("2.  "+result2);
//		System.out.println("3.  "+result3);
		
		
		
		
//		Cal c = new Cal(); // 객체선언
//		
//		//
//		int num = 100;
//		int num2 = 20;
//		
//		int result = c.add(num, num2);
//		System.out.println("더하기 : "+result);
//		
//		int result2 = c.sub(num, num2);
//		System.out.println("빼기 : "+result2);
//
//		c.mult(num,num2);
		
//		int a = 0; // 지역변수
//		Ja0117_09 j = new Ja0117_09();
//		j.power = true;
//		System.out.println(j.power);
		
	}

}
