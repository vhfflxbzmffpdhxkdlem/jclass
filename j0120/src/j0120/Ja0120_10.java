package j0120;

import java.util.Scanner;

public class Ja0120_10 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stuscore[] s = new Stuscore[10];
		int no=0,kor=0,eng=0,math=0,total=0,rank=0;
		int[] score = new int[3];
		String name = "";
		double avg = 0;
	
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int count=0,choic=0,temp=0,rankC=0; //학생수 확인,번호선택,검색확인,등수
		// 2. 화면구성
		loop: while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수처리");
			System.out.println("0. 종료");
			System.out.println("-------------------------");
			
			// 3. 번호선택 switch
			System.out.println("원하는 번호를 입력해주세요.");
			int choice = scan.nextInt();
			switch (choice){
			case 1:
				System.out.println("[ 학생성적 입력 ]");
				// 입력
				while(count<10) {
					System.out.printf("[ %d 번째 ]",count+1);
					// 이름
					System.out.println("이름을 입력하세요.(0.이전페이지 이동)");
					name = scan.next();
					if (name.equals("0")) {
						break;
					}
					// 국어,영어,수학
//					System.out.println("국어점수를 입력하세요");
//					kor = scan.nextInt();
//					System.out.println("영어점수를 입력하세요");
//					eng = scan.nextInt();
//					System.out.println("수학점수를 입력하세요");
//					math = scan.nextInt();
//					s[count] = new Stuscore(name,kor,eng,math);
					
					for (int i=0;i<score.length;i++) {
						System.out.printf("%s 점수를 입력하세요.",title[i+2]);
						score[i] = scan.nextInt();
					}
					
					// name,kor,eng,math -> no,total,avg
					s[count] = new Stuscore(name,score[0],score[1],score[2]);
							
					s[count].print();
					System.out.println("학생성적이 저장되었습니다.");
				} //while
				break;
			case 2:
				System.out.println("[ 학생성적 출력 ]");
				System.out.println("--------------------------------------------------------------------");
				for (int i=0;i<title.length;i++) {
					System.out.printf("%s \t",title[i]);
				}
				System.out.println();
				System.out.println("--------------------------------------------------------------------");
				for (int i=0;i<count;i++) {
					System.out.printf("%d\t",s[i].no);
					System.out.printf("%s\t",s[i].name);
					System.out.printf("%d\t",s[i].kor);
					System.out.printf("%d\t",s[i].eng);
					System.out.printf("%d\t",s[i].math);
					System.out.printf("%d\t",s[i].total);
					System.out.printf("%.2f\t",s[i].avg);
					System.out.printf("%d\n",s[i].rank);
				}
				break;
			case 3:
				System.out.println("[ 학생성적 수정 ]");
				break;
			case 4:
				System.out.println("[ 등수처리 ]");
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
		}
		
		

	}

}
