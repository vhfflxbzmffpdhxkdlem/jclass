package j0122;

import java.util.ArrayList;

public class Ja0122_05 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //객체를 저장하는 배열
		Car c = new Car(); // color,gearType,door...
		c.color = "red";
		c.gearType = "auto";
		c.door = 4;
		c.getColor();
		list.add(c); // object c = c
		list.add(new Car("white","stick",5)); //object c2 = new Car("white","stick",5);
		System.out.println("개수 : "+list.size());
		Car car = (Car)list.get(0);
		System.out.println("0번째 데이터 : "+car.color);
		System.out.println("0번째 데이터 : "+((Car)list.get(0)).color);
		
		// 1번째
		System.out.println("1번째 데이터 : "+((Car)list.get(1)).color);
		
		
		
		
		
	}

}
