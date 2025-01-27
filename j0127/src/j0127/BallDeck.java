package j0127;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BallDeck {
	ArrayList<Ball> list = new ArrayList<Ball>();
	Scanner scan = new Scanner(System.in);
	String input = "";
	int choice = 0;
	int temp = 0;
	Ball b = new Ball();
	
	BallDeck(){}
	
	void main_page() {
		System.out.println("로또");
		System.out.println("1. ball 생성");
		System.out.println("2. ball 섞기");
		System.out.println("3. 번호 맞추기");
		System.out.println("0. 나가기");
		System.out.println("원하는 번호를 선택해주세요");
	}
	
	void ball_create() {          // 볼 생성
		for(int i=1;i<46;i++) { 
			list.add(new Ball(i));
		}
	}
	
	void ball_mix() {            // 볼 섞기
		Collections.shuffle(list);
	}
	
	void check() {
	    System.out.println("번호 6개를 입력해주세요 (ex: 1,2,3,4,5,6)");
	    input = scan.next();                                        // 사용자가 입력한 번호를 받아옴
	    
	    String[] inputNumbers = input.split(",");                   // 입력값을 ',' 기준으로 나눠 배열에 저장
	    if (inputNumbers.length != 6) { 
	        System.out.println("올바른 형식으로 6개의 숫자를 입력해주세요.");
	        return;
	    }
	    
	    ArrayList<Integer> userNumbers = new ArrayList<>();         // 사용자가 입력한 번호를 정수 리스트로 변환
	    for (String num : inputNumbers) {
	        try {
	            userNumbers.add(Integer.parseInt(num.trim()));      // 공백 제거 후 정수 변환
	        } catch (NumberFormatException e) {
	            System.out.println("숫자 형식이 잘못되었습니다: " + num);
	            return;
	        }
	    }

	    ArrayList<Integer> lottoNumbers = new ArrayList<>();       // 로또 번호 리스트에서 추출한 번호
	    for (int i = 0; i < 6; i++) {
	        Ball b = list.get(i);
	        lottoNumbers.add(b.getBall());
	    }

	    int matchCount = 0;
	    for (int number : userNumbers) {                           // 로또 번호와 사용자 입력 번호 비교
	        if (lottoNumbers.contains(number)) {
	            matchCount++;
	        }
	    }

	    // 결과 출력
	    System.out.println("당첨 번호: " + lottoNumbers);
	    System.out.println("입력 번호: " + userNumbers);
	    System.out.println("맞춘 개수: " + matchCount);
	}

	
	
}
