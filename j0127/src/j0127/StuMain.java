package j0127;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		StuDeck sd = new StuDeck();
		int choice = 0;
		
		sd.fileRead();
		
		loop : while(true) {
			sd.main_page();
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				sd.input();
				break;
			case 2:
				sd.print();
				break;
			case 3:
				sd.mobilty();
				break;
			case 4:
				sd.delete();
				break;
			case 5:
				sd.search();
				break;
			case 6:
				sd.nametns();
				break;
			case 7:
				sd.totaltns();
				break;
			case 8:
				sd.calculateRank();
				break;
			case 9:
				sd.save();
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
		}
	}
}
