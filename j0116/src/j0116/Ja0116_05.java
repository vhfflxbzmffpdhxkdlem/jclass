package j0116;

import java.util.Scanner;

public class Ja0116_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생성적프로그램
		// 번호,이름,국어,영어,수학,합계,평균
		int count = 0; // 학생수
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		int[] total = new int[10];
		double[] avg = new double[10];
		int[] rank = new int[10];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0,temp = 0,rankC = 0; // 번호선택,이름검색
		
		
		
		loop:while(true) {
			// 화면구현
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("4. 등수 처리");
			System.out.println("0. 종료");
			System.out.println("-----------------------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			choice = scan.nextInt();
			
			switch (choice) {
				case 1: {
					System.out.println("[ 학생성적 입력");
					
					int i = count;
					while(i<10) {
						System.out.printf("[ %d 번째  ]\n",count+1);
						// 번호
						no[i] = count+1;
						
						// 이름
						System.out.println("이름을 입력하세요(이전페이지로 돌아가기 0)");
						name[i] = scan.next();
						if(name[i].equals("0") ) {
							break;
						}
						// 국어,영어,수학
						
						for (int j=0;j<3;j++) {
							System.out.printf("%s점수를 입력하세요. \n",title[j+2]);
							score[i][j] = scan.nextInt();
							total[i] += score[i][j];
						}
						
						// 합계,평균
						score[i][3] = total[i];
						avg[i] = total[i]/3.0;
						rank[i] = 0;
						
						System.out.printf("%d 번 학생이 저장 되었습니다. \n",count+1);
						
						i++;
						count++;
					}// while
					
					break;
				} //case1
				case 2: {
					System.out.println("[ 학생성적 출력 ]");
					
					// 출력
					System.out.println("[ 학생성적 ]");
					System.out.println("--------------------------------------------------------");
					for (int j=0;j<title.length;j++) {
						System.out.printf("%s\t",title[j]);
					}
					System.out.println();
					System.out.println("--------------------------------------------------------");
					for (int j=0;j<count;j++) {
						System.out.printf("%s\t",no[j]);
						System.out.printf("%s\t",name[j]);
						for (int k=0;k<4;k++) {
							System.out.printf("%d\t",score[j][k]);
						}
						System.out.printf("%.2f\t",avg[j]);
						System.out.printf("%d\n",rank[j]);
					}
					
					break;
				}// case2
				
				case 3:
					System.out.println("[ 학생성적 수정 ] ");
					// 수정할 학생이름을 입력하시오.
					System.out.println("수정할 학생이름을 입력하세요.>>");
					String search = scan.next();
					
					// name 배열
					temp = 0;
					int searchNo = 0;
					for (int j=0;j<name.length;j++) {
						if(search.equals(name[j])) {
							searchNo = j; // 위치값
							temp = 1;     // 검색이 있음.
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
						
						switch (choice) {
						case 1:
							System.out.println("[ 국어점수 수정 ] ");
							System.out.printf("현재점수 : %d \n",score[searchNo][0]);
							System.out.println("변경점수를 입력하세요. >>");
							score[searchNo][0] = scan.nextInt();
							break;
						case 2:
							System.out.println("[ 영어점수 수정 ] ");
							System.out.printf("현재점수 : %d \n",score[searchNo][1]);
							System.out.println("변경점수를 입력하세요. >>");
							score[searchNo][1] = scan.nextInt();
							break;
						case 3:
							System.out.println("[ 수학점수 수정 ] ");
							System.out.printf("현재점수 : %d \n",score[searchNo][2]);
							System.out.println("변경점수를 입력하세요. >>");
							score[searchNo][2] = scan.nextInt();
							break;
						}// switch
						score[searchNo][3] = score[searchNo][0]+score[searchNo][1]+score[searchNo][2];
						avg[searchNo] = score[searchNo][3]/3.0; 
					}
					
					break;
				
				case 4:
					System.out.println("[ 등수처리 ]");
					for (int j=0;j<count;j++) {
						rankC = 1; // 리셋
						for (int k=0;k<count;k++) {
							if(score[j][3]<score[k][3]) {
								rankC++;
							}
						}
						rank[j] = rankC;
					}
					System.out.println("등수처리가 완료되었습니다.");
					break;
				
				default: {
					System.out.println("[ 프로그램 종료 ]");
					break loop;
				} //case3
			} //switch
		} //while:loop
		
		
		
		
		
		
	

	}

}
