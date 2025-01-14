package j0113;

public class Ja0113_04 {

	public static void main(String[] args) {
		// 문자 - g 저장해서 입력해서출력
		// 문자열 - "안녕하세요." 입력해서출력
		// 숫자 - 10000 입력해서 출력
		
		char ch = 'g';
		System.out.println(ch);
		
		String str = "안녕하세요.";
		System.out.println(str);
		
		int num = 10000;
		System.out.println(num);
		
		// int true = 10; true는 예약어이기 때문에 쓸수가 없다.
		// int 7up = 10; 숫자가 처음에 올수 없음
		// int a@ = 10; 특수문자 쓸수 없음 ex)'_','$'는 가능
		
		int last_index_of = 10;
		int lastIndexOf = 10;
		
		// 상수의 이름은 대문자로 한다.
		int pi = 3;
		pi = 100;
		
		final int PI = 3; // 상수 - 값을 변경할수 없음. 대문자 - 상수  
		// PI = 10;
		

	}

}
