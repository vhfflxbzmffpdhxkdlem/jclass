package j0121;

public class Circle extends Shape {
	
	// 생성자
	Circle(){
		this(new Point(0,0),100);
	}
	//     new Point(150,150),50
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
	}
	
	
	// 인스턴스 변수선언
	Point center; // 클래스변수 선언
	int r;
	
	
	
}
