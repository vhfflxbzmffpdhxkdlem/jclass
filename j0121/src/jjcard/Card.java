package jjcard;

class Card {
	//생성자
	Card(){
		shape = 0;
		number = 1;
	}
	Card(int shape,int number){
		this.shape=shape;
		this.number=number;
	}
	
	String[] s = {"Spade","Diamond","Heart","Clover"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	int number;
	int shape;
	
	@Override
	public String toString() {
		return String.format("[ %s,%s ]\n",s[shape],n[number]);
	}
}
