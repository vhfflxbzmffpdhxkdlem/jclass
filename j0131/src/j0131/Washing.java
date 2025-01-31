package j0131;

public class Washing extends Product {

	private int liter;
	
	// 기본생성자
	Washing(){
		this("삼성200세탁기",900000,90000,200);
	}
	
	// 매개변수생성자
	public Washing(String name, int price, int point,int liter) {
		setName(name);
		setPrice(price);
		setPoint(point);
		this.liter = liter;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}
	
}
