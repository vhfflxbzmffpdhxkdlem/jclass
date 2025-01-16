package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 5,5 배열을 생성 arr
		String [][] arr = new String[5][5]; 
		
		// 2. 뽑기 글자 입력
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = "뽑기";
			}
		}
		
		// 4. 25개 1차원 배열 생성
		int[] no = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		
		// 5. 1차원 배열값 넣기
		
		 
		// 6. 배열섞기
		int temp = 0;
		for (int i=0;i<300;i++) {
			int ran = (int)(Math.random()*25);
			temp = no[0];
			no[0] = no[ran];
			no[ran] = temp;
		}
		
		// 3. 5,5 배열 생성 arr2
		String[][] arr2 = new String[5][5];
		for(int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				arr2[i][j] = no[5*i+j]+"";
			}
		}
		// 7. 번호입력
		int i = 0;
		int x = 0;
		int y = 0;
		loop: while(i<10) {
			System.out.println("                  [ 뽑기 게임 ] ");
			System.out.printf("좌표|\t0\t1\t2\t3\t4\n");
			System.out.println("----------------------------------------------");
			for (int j=0;j<arr.length;j++) {
				System.out.printf("  %d|\t",j);
				for (int k=0;k<arr[j].length;k++) {
					System.out.printf("%s\t",arr[j][k]);
				}
				System.out.println();
			}
			while (true) {
				System.out.println(" X 좌표를 선택해주세요(-1종료)");
				x = scan.nextInt();
				if (x == -1) {
					System.out.println("프로그램을 종료합니다.");
					break loop;
				}
				System.out.println(" Y 좌표를 선택해주세요");
				y = scan.nextInt();
				
				if(x>=0 && x<=4 && y>=0 && y<=4) {
					break;
				}else {
					System.out.println("잘못 입력했습니다. 다시 입력해 주세요.");
				}
			}
			System.out.printf("입력한 좌표 : [ %d,%d ]",x,y);
			
			if (arr2[x][y].equals("1")) {
				arr[x][y] = "당첨";
			}else {
				arr[x][y] = "꽝!";
			}
			
			
			i++;
		}
		
		// 8. 당첨확인
		
		
		
		
		
		
		
	}

}
