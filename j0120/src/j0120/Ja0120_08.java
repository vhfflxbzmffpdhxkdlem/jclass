package j0120;

import java.util.Scanner;

public class Ja0120_08 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stuscore[] s = new Stuscore[3];
		
		for (int i=0;i<3;i++) {
			System.out.println("학생이름을 입력하세요.");
			String name = scan.next();
			System.out.println("국어성적을 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어성적을 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학성적을 입력하세요.");
			int math = scan.nextInt();
			s[i] = new Stuscore(name,kor,eng,math);
			s[i].print();
		}
		// 4번째 학생
		Stuscore s1 = new Stuscore();
		System.out.println(s1.count);
		s1.name = "강감찬";
		s1.kor = 80;
		s1.eng = 80;
		s1.math = 80;
		s1.total = s1.kor+s1.eng+s1.math;
		s1.avg = s1.total/3.0;
		s1.print();
	
		
		
		
//		Car c1 = new Car("red","auto",5);
//		Car c2 = new Car();
//		c2 = c1; // 얕은 복사
//		Car c3 = new Car(c1);
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
		
		
		
		
		
		// 1,홍길동,100,100,100
		// 1,홍길동,100,100,100,300,100.0 을 출력하시오.
//		
//		Stuscore s1 = new Stuscore();
//		s1.no = 1;
//		s1.name = "홍길동";
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.math = 100;
//		s1.total = s1.kor+s1.eng+s1.math;
//		s1.avg = s1.total/3.0;
//		s1.print();
//		
//		Stuscore s2 = new Stuscore(2,"유관순",99,98,97);
//		s2.print();
		
//		System.out.printf("%d %s %d %d %d %d %.2f \n",s1.no,s1.name,s1.kor,s1.eng,s1.math,s1.total,s1.avg);
//		System.out.printf("%d %s %d %d %d %d %.2f",s2.no,s2.name,s2.kor,s2.eng,s2.math,s2.total,s2.avg);
		
//		Car c = new Car();
//		c.color = "white";
//		c.gearType = "auto";
//		c.door = 4;
//		
//		// red ,stick,5
//		Car c2 =  new Car("red","stick",5);
//		System.out.println(c2.color);
//		System.out.println(c2.gearType);
//		System.out.println(c2.door);
		
	}

}
