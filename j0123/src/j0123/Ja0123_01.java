package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Ja0123_01 {
	
	public static void main(String[] args) {
		Stu_Deck sd = new Stu_Deck();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		// 학생성적프로그램
		// 번호,이름,국어,영어,수학,합계,평균
		
		
		
		loop:while(true) {
			choice = sd.main_print();
			switch (choice) {
				case 1: 
					sd.input();
					break;
				case 2: 
					sd.output();
					break;
				case 3:
					sd.modify();
					break;
				case 4:
					break;
				case 5:
					break;
				default: {
					System.out.println("[ 프로그램 종료 ]");
					break loop;
				} //case3
			} //switch
		} //while:loop
		
		
		
		
		
		
	

	}

}
