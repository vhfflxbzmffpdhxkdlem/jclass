package j0113;

public class Ja0113_05 {

	public static void main(String[] args) {

		// boolean - true,false //소문자만
		// char - ''표시, 아스키코드값 : 65 - 'A', 97 - 'a', 48 - '0'
		// 정수형 - byte,short 거의 사용안함.  기본형 정수 int - 값을 입력
		// 정수형 - long : 접미나 L붙여야 함.
		// 실수형 - float,double float - 접미사 F, double - D 생략가능
		
		char ch  = 'A';
		System.out.println(ch);
		
		char ch2 = '\u0041'; // 16*4 + 1*1 = 65
		System.out.println(ch2);
		
		char ch3 = 97;          // 97 - a
		System.out.println(ch3);
		
		char ch4 = '\t';
		System.out.print(ch4);
		
		char ch5 = 'a';
		System.out.print(ch5);
		
		char ch6 = 'b';
		System.out.print(ch6);
		
		char ch7 = 'c';
		System.out.print(ch7);
		
		boolean p = true;
		boolean p2 = false;
		
		long l = 10000000000L; // long은 21억까지는 가능하지만 그 이상은 안된다 하지만 L을 마지막에 붙이면 가능. 타입을 확실히 알려주기 위해서 뒤에 L을 붙인다.
		
		float f = 3.14F;
		float f2 = 100F; // 정수면 안붙여도 되지만 이것이 float 인것을 알려주기 위해 붙인다.
		
		double d = 3.14;

	}

}
