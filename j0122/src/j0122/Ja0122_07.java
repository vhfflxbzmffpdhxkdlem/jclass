package j0122;

import java.util.ArrayList;

public class Ja0122_07 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// 20개를 생성해서 20개를 출력하시오. 
		for (int i=0;i<20;i++) {
//			int ranh = (int)(Math.random()*24);
//			int ranm = (int)(Math.random()*60);
//			int rans = (int)(Math.random()*60);
//			list.add(new Time(ranh,ranm,rans));
			list.add(new Time(i+1,i+1,i+1));
		}
		
		for (int i=0;i<20;i++) {
			Time t = (Time)list.get(i);
			System.out.printf("[%d번째 %02d:%02d:%02d ] \n",i+1,t.getHour(),t.getMinute(),t.getSecond());
		}
		
		//삭제
		list.remove(0);
		
		for (int i=0;i<list.size();i++) {
			Time t = (Time)list.get(i);
			System.out.printf("[%d번째 %02d:%02d:%02d ] \n",i+1,t.getHour(),t.getMinute(),t.getSecond());
			
		}

	}

}
