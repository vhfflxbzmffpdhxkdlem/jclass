package j0120;

import java.util.Scanner;

public class Ja0120_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 객체
		// 변수값
		Stuscore[] s = new Stuscore[10];
		int no=0,kor=0,eng=0,math=0,rank=0,total=0,searchNo=0;
		int[] score = new int[3];
		String name = "";
		double avg = 0;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice=0,temp=0,rankC=0,count=0;
		
		// 화면구성
		loop: while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수처리");
			System.out.println("0. 종료");
			System.out.println("--------------------------");
			System.out.println("원하는번호를 입력하시오.");
			choice = scan.nextInt();
			
			// switch
			switch (choice) {
			case 1:
				System.out.println("학생성적 입력");
				while(count<10) {
					System.out.printf("[ %d번째 ] \n",count+1);
					System.out.println("이름을 입력해주세요 (0.이전페이지 이동)");
					name = scan.next();
					if (name.equals("0")) {
						break;
					}
					for (int i=0;i<3;i++) {
						System.out.printf("%s 성적을 입력해주세요 \n",title[i+2]);
						score[i] = scan.nextInt();
					}
					s[count] = new Stuscore(name,score[0],score[1],score[2]);
					s[count].print();
					System.out.println("학생성적이 저장되었습니다.");
					count++;
				}
				
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
				System.out.println("수정할 학생이름을 입력하세요.");
				String search = scan.next();
				for (int j=0;j<count;j++) {
					if(search.equals(s[j].name)) {
						searchNo = j;
						temp = 1;
					}
				}
				if(temp == 0) {
					System.out.println("찾고자하는 학생을 찾지 못하였습니다.");
				}else {
					System.out.printf("%s 학생 성적수정 \n",search);
					System.out.println("1. 국어성적 수정");
					System.out.println("2. 영어성적 수정");
					System.out.println("3. 수학성적 수정");
					System.out.println("----------------------------------");
					System.out.println("원하는 번호를 입력해 주세요.");
					choice = scan.nextInt();
					switch(choice) {
					case 1:
						System.out.printf("현재 국어 성적 : %d \n",s[searchNo].kor);
						System.out.println("수정할 점수를 입력해 주세요.");
						s[searchNo].kor = scan.nextInt();
						break;
					case 2:
						System.out.printf("현재 영어 성적 : %d \n",s[searchNo].eng);
						System.out.println("수정할 점수를 입력해 주세요.");
						s[searchNo].eng = scan.nextInt();
						break;
					case 3:
						System.out.printf("현재 수학 성적 : %d \n",s[searchNo].math);
						System.out.println("수정할 점수를 입력해 주세요.");
						s[searchNo].math = scan.nextInt();
						break;
					}
					s[searchNo].total = s[searchNo].kor+s[searchNo].eng+s[searchNo].math;
					s[searchNo].avg = s[searchNo].total/3.0;
				}
				
				
				break;
				
			case 4:
				for (int j=0;j<count;j++) {
					rankC = 1;
					for (int k=0;k<count;k++) {
						if(s[j].total<s[k].total) {
							rankC++;
						}
					}
					s[j].rank = rankC;
				}
				System.out.println("등수처리를 완료했습니다.");
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}

		}

	}

}
