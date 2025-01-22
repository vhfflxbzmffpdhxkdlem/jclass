package star;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("Dropship이동 : %d,%d\n",x,y);
	} 
}
