package j0124;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int choice = 0,temp=0,count=0;
		StuDeck stuDeck = new StuDeck();
		
		// 파일읽어오기
		stuDeck.fileRead();
		
		
		loop : while(true) {
			stuDeck.main_page();
			choice = scan.nextInt();
			switch(choice){
			case 1:
				// list 입력
				break;
			case 2:
				// list 출력
				stuDeck.listPrint();
				break;
			case 3:
				// list 수정
				break;
			case 4:
				// list 삭제
				stuDeck.remove();
				break;
			case 5:
				// list 검색
				stuDeck.search();
				break;
			case 6:
				// list 등수정렬
				break;
			case 7:
				// list 이름정렬
				break;
			case 8:
				// list 등수처리
				break;
			case 9:
				// 파일저장
				stuDeck.save();
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
		}
	}

}
