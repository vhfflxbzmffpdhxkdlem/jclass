package j0120;

public class Ja0120_01 {

	static int a = 10; // 클래스변수 - 객체선언 없이 클래스명.변수명	
	
	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x1 : "+d.x);
		System.out.println("d : "+d);
		change(d);
		System.out.println("d.x2 : "+d.x);

	}

	static void change(Data d) {
		d.x = 1000;
		System.out.println("d.x : "+d.x);

	}
}
