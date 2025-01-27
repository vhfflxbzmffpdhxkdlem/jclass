package j0124;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class StuDeck {
	ArrayList<Stu> list = new ArrayList<Stu>();
	Scanner scan = new Scanner(System.in);
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int choice = 0,temp=0,count=0;
	String search = "";
	
	// 파일읽어오기
		void fileRead() throws Exception {
			FileReader fr = new FileReader("c:/save/studata.txt");
			BufferedReader br = new BufferedReader(fr);
			int no=0,kor=0,eng=0,math=0,total=0,rank=0;
			String name = "";
			double avg = 0;
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				String[] str = line.split(",");
				no = Integer.parseInt(str[0]);
				name = str[1];
				kor = Integer.parseInt(str[2]);
				eng = Integer.parseInt(str[3]);
				math = Integer.parseInt(str[4]);
				total = Integer.parseInt(str[5]);
				avg = Double.parseDouble(str[6]);
				rank = Integer.parseInt(str[7]);
				list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
			}
			br.close();
			fr.close();
		}// fileRead
	
	
	// 메인페이지 출력
	void main_page(){
		System.out.println("--------------------------");
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("--------------------------");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적삭제");
		System.out.println("5. 학생성적검색");
		System.out.println("6. 학생등수정렬");
		System.out.println("7. 학생이름정렬");
		System.out.println("8. 등수처리");
		System.out.println("9. 파일저장");
		System.out.println("0. 프로그램 종료");
		System.out.println("--------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}// main_page
	
	
	// list 출력
	void listPrint() {
		System.out.println("                       [ 학생성적출력 ]");
		System.out.println("------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],
				title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg(),s.getRank());
		}
	} // listPrint
	
	
	
	// 학생성적 삭제
	void remove() {
		System.out.println("삭제를 원하는 학생의 이름을 검색해주세요.");
		search = scan.next();
		
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(search.equals(s.getName())){
				temp = 1;
			}
		}
		if(temp == 0) {
			System.out.println("찾고자하는 학생이 없습니다.");
		}else {
			System.out.printf("%s학생을 찾았습니다.\n",search);
			System.out.printf("정말 %s 학생의 데이터를 삭제시키겠습니까?(1.삭제 2.이전페이지 이동)\n",search);
			choice = scan.nextInt();
			switch(choice) {
			case 1: 
				System.out.printf("%s학생을 삭제하였습니다.\n",search);
				list.removeIf(list -> list.getName().equals(search));
				break;
			default:
				System.out.println("이전페이지로 이동합니다.");
				break;
			}
		}
	}// remove
	
	// 학생성적검색
	void search() {
		System.out.println("학생의 이름을 검색해주세요.");
		search = scan.next();
		int searchNo = 0;
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(search.equals(s.getName())){
				temp = 1;
				searchNo = i;
			}
		}
		Stu s = list.get(searchNo);
		if(temp == 0) {
			System.out.println("찾고자하는 학생이 없습니다.");
		}else {
			System.out.printf("%s학생을 찾았습니다.\n",search);
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],
					title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
			System.out.println("------------------------------------------------------------");
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg(),s.getRank());
		}
	}// search
	
	// 등수처리
	
	
	
	// 파일저장
	void save() throws Exception {
		// 파일생성
		String folder = "c:/save";
		File f  = new File(folder);
		File file = new File("c:/save/studata.txt");
		if(!f.exists()) {
			file.createNewFile();
			System.out.println("파일이 생성되었습니다.");
		}
		FileOutputStream fos = new FileOutputStream("c:/save/studata.txt");
		String str = "";
		for (int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			str += s.getNo()+","+s.getName()+","+s.getKor()+","+s.getEng()+","+s.getMath()+","+s.getTotal()+","+s.getAvg()+","+s.getRank()+"\r\n"; 
		}
		byte[] bytes = str.getBytes();
		for(byte b:bytes) {
			fos.write(b);
		}
		fos.close();
		System.out.println("파일저장 완료");
	}
	
}
