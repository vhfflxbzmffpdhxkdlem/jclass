package j0122;

import java.util.Calendar;
import java.util.Date;

public class Ja0122_02 {

	public static void main(String[] args) {
		
//		Date d = new Date();
//		System.out.println(d.toString());
//		Date d2 = new Date();
//		System.out.println(d2.toString());
//		
//		Calendar c1 = Calendar.getInstance();
//		System.out.println(c1.getTime());
//		Calendar c2 = Calendar.getInstance();
//		System.out.println(c2.getTime());
		
		//객체선언
		//싱글톤 패턴
//		Singleton s1 = new Singleton();
		// 얕은 복사 저장장소가 하나이다.
		Singleton s1 = Singleton.getInstance();
		System.out.println("s1 : "+s1.getNum());
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2 : "+s2.getNum());
		Singleton s3 = Singleton.getInstance();
		System.out.println("s3 : "+s3.getNum());
		Singleton s4 = Singleton.getInstance();
		System.out.println("s4 : "+s4.getNum());
		s1.setNum(100);
		System.out.println("s1의 num값을 변경");
		System.out.println("s2 : "+s2.getNum());
		System.out.println("s4 : "+s4.getNum());
		
//		// 각각 저장장소가 다르다
		Car cc1 = new Car();
		Car cc2 = new Car();
		Car cc3 = new Car();
		
		Time t1 = new Time();
		
		// 관계가 없는 객체는 형변환이 안됨.
//		cc1 = (Car)t1;
		
		
		int a = 10;
		long b = 100;
		a = (int)b;
		
		
	}

}
