package stuproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	Stu s = new Stu();
	ArrayList<Stu> list = new ArrayList<Stu>();
	int temp = 0,searchNo=0,choice=0,kor=0,eng=0,math=0,total=0,rank=1;
	String name = "";
	double avg = 0;
	String search = "";
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	
	void fileRead() throws Exception {
		FileReader fr = new FileReader("c:/save/studata2.txt");
		BufferedReader br = new BufferedReader(fr);
		int no=0,kor=0,eng=0,math=0,total=0,rank=0;
		String name="";
		double avg = 0;
		while(true) {
			String line = br.readLine();
			if(line==null) break;
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
	
	void save() throws Exception {
		System.out.println(" [ 학생파일저장 ] ");
		String directoryPath = "c:/save";
		String filePath = directoryPath+"/stuadata2.txt";
		
		File directory = new File(directoryPath);
		if(!directory.exists()) {
			directory.mkdirs();
			System.out.println("디렉토리가 생성되었습니다. "+directoryPath);
		}
		
		File file = new File(filePath);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("파일이 생성되었습니다."+filePath);
		}
		
		try (FileOutputStream fos = new FileOutputStream(file)) {
			StringBuilder strBuilder = new StringBuilder();
			for (Stu s : list) {
				strBuilder.append(s.getNo()).append(",")
				.append(s.getName()).append(",")
				.append(s.getKor()).append(",")
				.append(s.getEng()).append(",")
				.append(s.getMath()).append(",")
				.append(s.getTotal()).append(",")
				.append(s.getAvg()).append(",")
				.append(s.getRank()).append(System.lineSeparator());
			}
			fos.write(strBuilder.toString().getBytes());
			System.out.println("파일 저장 완료: "+filePath);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("파일 저장 중 오류가 발생했습니다.");
		}
	}//save
	
	void rank() {
		System.out.println(" [ 학생등수처리 ] ");
		for(int i=0;i<list.size();i++) {
			rank = 1;
			for(int j=0;j<list.size();j++) {
				if(list.get(i).getTotal()<list.get(j).getTotal()) {
					rank++;
				}
			}
			list.get(i).setRank(rank);
		}
		System.out.println("등수처리를 완료했습니다.");
	}
	
	void name() {
		System.out.println(" [ 학생이름정렬 ] ");
		list.sort(new Comparator<Stu>() {
			public int compare(Stu s1,Stu s2) {
				return s2.getName().compareTo(s1.getName());}
		});
	}
	
	
	void total() {
		System.out.println(" [ 학생등수정렬 ] ");
		list.sort(new Comparator<Stu>() {
			public int compare(Stu s1,Stu s2) {
				return s2.getTotal()-s1.getTotal();}
		});
	}
	
	
	void search() {
		System.out.println(" [ 학생성적검색 ] ");
		System.out.println("성적을 삭제할 학생의 이름을 검색해주세요.");
		search = scan.next();
		for(int i=0;i<list.size();i++) {
			if(search.equals(list.get(i).getName())) {
				searchNo = i;
				temp = 1;
			}
		}
		if (temp==0) {
			System.out.println("찾고자하는 학생을 찾을수 없습니다.");
		}else {
			System.out.printf("%s학생을 찾았습니다. \n",search);
			for(int i=0;i<title.length;i++) {
				System.out.printf("%s \t",title[i]);
			}
			System.out.println();
			System.out.println("------------------------------------------------------------");
			for(int i=0;i<list.size();i++) {
				Stu s = list.get(i);
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),
						s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
			}
			System.out.println("------------------------------------------------------------");
		}
	}
	
	void delet() {
		System.out.println(" [ 학생성적삭제 ] ");
		System.out.println("성적을 삭제할 학생의 이름을 검색해주세요.");
		search = scan.next();
		for(int i=0;i<list.size();i++) {
			if(search.equals(list.get(i).getName())) {
				searchNo = i;
				temp = 1;
			}
		}
		if (temp==0) {
			System.out.println("찾고자하는 학생을 찾을수 없습니다.");
		}else {
			System.out.printf("%s학생을 찾았습니다. \n",search);
			System.out.println("학생성적을 정말 삭제하시겠습니까?(1.삭제 2.이전페이지 이동)");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.printf("%s학생의 성적을 삭제합니다. \n",search);
				list.remove(searchNo);
				break;
			case 2:
				break;
			}
		}
	}// delet
	
	void moblity() {
		System.out.println(" [ 학생성적수정 ] ");
		System.out.println("성적을 수정학 학생의 이름을 검색해주세요.");
		search = scan.next();
		for(int i=0;i<list.size();i++) {
			if(search.equals(list.get(i).getName())) {
				searchNo = i;
				temp = 1;
			}
		}
		if (temp==0) {
			System.out.println("찾고자하는 학생을 찾을수 없습니다.");
		}else {
			System.out.printf("%s학생을 찾았습니다. \n",search);
			System.out.println("수정학 과목을 선택해주세요.");
			System.out.println("1. 국어");
			System.out.println("2. 영어");
			System.out.println("3. 수학");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.printf("현재 국어점수 : %d \n",list.get(searchNo).getKor());
				System.out.println("수정 국어점수 : ");
				kor = scan.nextInt();
				list.get(searchNo).setKor(kor);
				break;
			case 2:
				System.out.printf("현재 영어점수 : %d \n",list.get(searchNo).getEng());
				System.out.println("수정 영어점수 : ");
				eng = scan.nextInt();
				list.get(searchNo).setEng(eng);
				break;
			case 3:
				System.out.printf("현재 수학점수 : %d \n",list.get(searchNo).getMath());
				System.out.println("수정 수학점수 : ");
				math = scan.nextInt();
				list.get(searchNo).setMath(math);
				break;
			}
			Stu s = list.get(searchNo);
			s.setTotal(s.getKor()+s.getEng()+s.getMath());
			s.setAvg(s.getTotal()/3.0);
		}
	}// moblity
	
	
	void print() {
		System.out.println("                       [학생성적출력 ] ");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s \t",title[i]);
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),
					s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println("------------------------------------------------------------");
	}
	
	
	void input() {
		while(true) {
			System.out.println(" [ 학생성적입력 ] ");
			System.out.println("학생이름을 입력해주세요.(0.이전페이지 이동)");
			String name = scan.next();
			if(name.equals("0")) {
				break;
			}
			System.out.println("국어성적을 입력해주세요");
			int kor = scan.nextInt();
			System.out.println("영어적을 입력해주세요");
			int eng = scan.nextInt();
			System.out.println("수학성적을 입력해주세요");
			int math = scan.nextInt();
			list.add(new Stu(name,kor,eng,math));
		}
	}//input
	
	void mainpage() {
		System.out.println("-------------------------");
		System.out.println("   [ 학생성적프로그램 ]");
		System.out.println("-------------------------");
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
		System.out.println("-------------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
	}//mainpage
}
