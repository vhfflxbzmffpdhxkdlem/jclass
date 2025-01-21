package j0121;

public class Point {

	Point(){this(0,0);} // this : 다른생성자를 말함.
	Point(int x,int y){
		this.x = x;     // this : 인스턴스 변수를 말함.
		this.y = y;
	}
	
	
	
	int x; // 인스턴스변수 - 객체선언후 참조변수명.변수명
	int y;
	
}
