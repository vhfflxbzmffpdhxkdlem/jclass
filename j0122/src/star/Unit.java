package star;

abstract public class Unit {
	int x,y;
	abstract void move(int x,int y);
	void stop() {
		System.out.println("자리에 멈춤!!");
	}
	
	
}
