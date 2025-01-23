package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int count = 0; // 학생수
	int no = 0,rank=0,math=0,kor=0,eng=0,total=0;
	String name = "";
	double avg = 0;
	int choice = 0,temp = 0,rankC = 0; // 번호선택,이름검색
	
	// 0. 상단메뉴 메소드
	int main_print() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 학생성적 입력");
		System.out.println("2. 학생성적 출력");
		System.out.println("3. 학생성적 수정");
		System.out.println("4. 학생성적 삭제");
		System.out.println("5. 등수 처리");
		System.out.println("0. 종료");
		System.out.println("-----------------------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt();
		return choice;
	}//main_print
	
	// 1. 입력메소드
	void input() {
		System.out.println("[ 학생성적 입력 ]");
		
		while(true) {
			System.out.printf("[ %d 번째  ]\n",list.size()+1);
			// 이름
			System.out.println("이름을 입력하세요(이전페이지로 돌아가기 0)");
			name = scan.next();
			if(name.equals("0") ) {
				break;
			}
			// 국어,영어,수학
			System.out.printf("국어점수를 입력하세요. \n");
			kor = scan.nextInt();
			System.out.printf("영어점수를 입력하세요. \n");
			eng = scan.nextInt();
			System.out.printf("수학점수를 입력하세요. \n");
			math = scan.nextInt();
			
			//list 저장
			list.add(new Stu(name,kor,eng,math));
			System.out.printf("%s학생이 저장 되었습니다. \n",name);
		}// while
	}//input
	
	// 2. 출력메소드
	void output() {
		System.out.println("[ 학생성적 출력 ]");
		
		// 출력
		System.out.println("[ 학생성적 ]");
		System.out.println("-----------------------------------------------------------");
		for (int j=0;j<title.length;j++) {
			System.out.printf("%s\t",title[j]);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		for (int j=0;j<list.size();j++) {
			Stu s = (Stu)list.get(j); // Object
			System.out.printf("%d\t",s.getNo());
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKor());
			System.out.printf("%d\t",s.getEng());
			System.out.printf("%d\t",s.getMath());
			System.out.printf("%d\t",s.getTotal());
			System.out.printf("%.2f\t",s.getAvg());
			System.out.printf("%d\n",s.getRank());
		}
	}//output
	
	// 3. 수정 메소드
	void modify() {
		System.out.println("[ 학생성적 수정 ]");
		// 수정할 학생이름을 입력하시오.
		System.out.println("수정할 학생이름을 입력하세요.>>");
		String search = scan.next();
		
		// name 배열
		int searchNo = 0;
		for (int i=0;i<list.size();i++) {
			Stu s = (Stu)list.get(i);
			if(search.equals(s.getName())){
				searchNo = i;
				temp = 1;
			}
		}
		if(temp == 0) {
			System.out.println("검색한 학생을 찾지 못했습니다.");
		}else {
			System.out.printf("[%s 학생 성적 수정] \n",search);
			System.out.println("1. 국어점수 수정");
			System.out.println("2. 영어점수 수정");
			System.out.println("3. 수학점수 수정");
			System.out.println("---------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			
			Stu s = (Stu)list.get(searchNo);
			switch (choice) {
			case 1:
				System.out.println("[ 국어점수 수정 ] ");
				System.out.printf("현재점수 : %d \n",s.getKor());
				System.out.println("변경점수를 입력하세요. >>");
				int kor = scan.nextInt();
				s.setKor(kor);
				break;
			case 2:
				System.out.println("[ 영어점수 수정 ] ");
				System.out.printf("현재점수 : %d \n",s.getEng());
				System.out.println("변경점수를 입력하세요. >>");
				int eng = scan.nextInt();
				s.setEng(eng);
				break;
			case 3:
				System.out.println("[ 수학점수 수정 ] ");
				System.out.printf("현재점수 : %d \n",s.getMath());
				System.out.println("변경점수를 입력하세요. >>");
				int math = scan.nextInt();
				s.setMath(math);
				break;
			}// switch
			int total = kor+eng+math;
			s.setTotal(total);
			double avg = total/3.0;
			s.setAvg(avg);
		}
		
		
	}// modify
	
}
