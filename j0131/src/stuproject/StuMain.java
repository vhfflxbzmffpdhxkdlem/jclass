package stuproject;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		StuDeck sd = new StuDeck();
		int choice = 0;
		
		sd.fileRead();
		
		loop:while(true) {
			sd.mainpage();
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				sd.input();
				break;
			case 2:
				sd.print();
				break;
			case 3:
				sd.moblity();
				break;
			case 4:
				sd.delet();
				break;
			case 5:
				sd.search();
				break;
			case 6:
				sd.total();
				break;
			case 7:
				sd.name();
				break;
			case 8:
				sd.rank();
				break;
			case 9:
				sd.save();
				break;
			case 0:
				System.out.println(" [ 프로그램종료 ] ");
				break loop;
			}
		}
		
		
		

	}

}
