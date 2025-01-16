package j0116;

import java.util.Scanner;

public class Ja0116_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 변수
		int count = 0;
		int[] no = new int[10];
		String[] name = new String[10];
		int [][] score = new int[10][4];
		int[] total = new int[10];
		double[] avg = new double[10];
		int choice = 0,searchN = 0,temp = 0,rankC = 1;
		int[] rank = new int[10];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		loop:while(true) {
			// 2. 화면구현
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("4. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------");
			
			// 3. 번호선택 switch
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			switch(choice){
				case 1:
					// 4. 학생성적 입력
					int i = count;
					while(i<10) {
						System.out.printf("[ %d 번째 ] \n",count+1);
						no[i] = i+1;
						System.out.println("학생이름을 입력하세요.(0. 이전페이지로 이동)");
						name[i] = scan.next();
						if (name[i].equals("0")) {
							break;
						}
						for (int j=0;j<3;j++) {
							System.out.printf("%s점수를 입력하세요",title[j+2]);
							score[i][j] = scan.nextInt();
							total[i] += score[i][j];
						}
						score[i][3] = total[i];
						avg[i] = total[i]/3.0;
						
						count++;
						i++;
					}
					
					break;
				case 2:
					// 5. 학생성적 출력
					System.out.println("                    [ 학생성적 ]");
					System.out.println("-------------------------------------------------------");
					for (int j=0;j<title.length;j++) {
						System.out.print(title[j]+"\t");
					}
					System.out.println();
					System.out.println("-------------------------------------------------------");
					for(int j=0;j<count;j++) {
						System.out.printf("%d \t",no[j]);
						System.out.printf("%s \t",name[j]);
						for (int k=0;k<4;k++) {
							System.out.printf("%d \t",score[j][k]);
						}
						System.out.printf("%.2f \t",avg[j]);
						System.out.printf("%d \n",rank[j]);
					}
					System.out.println();
					break;
					
				case 3:
					System.out.println("[ 학생성적 수정 ]");
					System.out.println("수정할 학생이름을 입력하세요.");
					String search = scan.next();
					for (int j=0;j<count;j++) {
						if(search.equals(name[j])) {
							searchN = j;
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
							System.out.printf("현재 국어 성적 : %d",score[searchN][0]);
							System.out.println("수정할 점수를 입력해 주세요.");
							score[searchN][0] = scan.nextInt();
							break;
						case 2:
							System.out.printf("현재 영어 성적 : %d",score[searchN][1]);
							System.out.println("수정할 점수를 입력해 주세요.");
							score[searchN][1] = scan.nextInt();
							break;
						case 3:
							System.out.printf("현재 수학 성적 : %d",score[searchN][2]);
							System.out.println("수정할 점수를 입력해 주세요.");
							score[searchN][2] = scan.nextInt();
							break;
						}
						score[searchN][3] = score[searchN][0]+score[searchN][1]+score[searchN][2];
						avg[searchN] = score[searchN][3]/3.0;
					}
					
					
					break;
					
				case 4:
					for (int j=0;j<count;j++) {
						rankC = 1;
						for (int k=0;k<count;k++) {
							if(score[j][3]<score[k][3]) {
								rankC++;
							}
						}
						rank[j] = rankC;
					}
					System.out.println("등수처리를 완료했습니다.");
					break;
					
				default:
					// 7. 프로그램 종료
					System.out.println("프로그램을 종료합니다.");
					break loop;
			} // switch 
		} // while : loop
		
		
		
		
		// 6. 학생성적 삭제
		

	}

}
