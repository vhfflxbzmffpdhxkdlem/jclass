package j0127;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck {
	ArrayList<Stu> list = new ArrayList<Stu>();
	Scanner scan = new Scanner(System.in);
	Stu s = new Stu();
	int no,kor,eng,math,total,rank,temp,choice,searchNo;
	String name = "",search="";
	Double avg = 0.0;
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	
	void fileRead() throws Exception {
		FileReader fr = new FileReader("c:/save/studata1.txt");
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
	
	
	
	void main_page() {
		System.out.println(" [ 학생성적 프로그램 ] ");
		System.out.println(" [ 1. 학생성적 입력 ] ");
		System.out.println(" [ 2. 학생성적 출력 ] ");
		System.out.println(" [ 3. 학생성적 수정 ] ");
		System.out.println(" [ 4. 학생성적 삭제 ] ");
		System.out.println(" [ 5. 학생성적 검색 ] ");
		System.out.println(" [ 6. 학생 이름정렬 ] ");
		System.out.println(" [ 7. 학생 성적정렬 ] ");
		System.out.println(" [ 8. 학생 등수처리 ] ");
		System.out.println(" [ 9. 파일 저장 ] ");
		System.out.println(" [ a. 프로그램 종료 ] ");
		System.out.println("원하는 번호를 선택해주세요.");
	} // main_page
	
	void input() {
		while (true) {
			System.out.println(" [ 1. 학생성적 입력 ] ");
			System.out.println("이름을 입력해주세요.(0. 이전페이지 이동)");
			name = scan.next();
			if (name.equals("0")) {
				break;
			}
			System.out.println("국어성적을 입력해주세요.");
			kor = scan.nextInt();
			System.out.println("영어성적을 입력해주세요.");
			eng = scan.nextInt();
			System.out.println("수학성적을 입력해주세요.");
			math = scan.nextInt();
			list.add(new Stu(name,kor,eng,math));
		}
	} //input
	
	void print() {
		System.out.println(" [ 2. 학생성적 출력 ] ");
		System.out.println("----------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		System.out.println("----------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),
					s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
	} //print
	
	void mobilty() {
		System.out.println(" [ 3. 학생성적 수정 ]");
		System.out.println("찾고자하는 학생의 이름을 검색해 주세요.");
		search = scan.next();
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(search.equals(s.getName())) {
				temp=1;
				searchNo = i;
				break;
			}
		}
		if(temp==0) {
			System.out.printf("%s학생을 찾을수 없습니다.\n",search);
		}else {
			System.out.printf("%s학생을 찾았습니다.\n",search);
			System.out.println("성적수정");
			System.out.println("1.국어성적");
			System.out.println("2.영어성적");
			System.out.println("3.수학성적");
			System.out.println("수정하고자 하는 과목을 선택해주세요.(0.이전페이지 이동)");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("현재 국어성적 : "+list.get(searchNo).getKor());
				System.out.println("수정 점수 : ");
				kor = scan.nextInt();
				list.get(searchNo).setKor(kor);
				break;
			case 2:
				System.out.println("현재 영어성적 : "+list.get(searchNo).getEng());
				System.out.println("수정 점수 : ");
				eng = scan.nextInt();
				list.get(searchNo).setEng(eng);
				break;
			case 3:
				System.out.println("현재 수학성적 : "+list.get(searchNo).getMath());
				System.out.println("수정 점수 : ");
				math = scan.nextInt();
				list.get(searchNo).setMath(math);
				break;
			default:
				break;
			}
			Stu s = list.get(searchNo);
			s.setTotal(s.getKor()+s.getEng()+s.getMath());
			s.setAvg(s.getTotal()/3.0);
		}
		
	} //mobilty
	
	void delete() {
		System.out.println(" [ 4. 학생성적 삭제 ] ");
		System.out.println("찾고자하는 학생의 이름을 검색해 주세요.");
		search = scan.next();
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(search.equals(s.getName())) {
				temp=1;
				searchNo = i;
				break;
			}
		}
		if(temp==0) {
			System.out.printf("%s학생을 찾을수 없습니다. \n",search);
		}else {
			System.out.printf("%s학생을 찾았습니다. \n",search);
			System.out.printf("%s학생의 데이터를 정말 삭제하시겠습니까?(1. 삭제  2.이전페이지 이동). \n",search);
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.printf("%s학생의 데이터를 삭제했습니다. \n",search);
				list.remove(searchNo);
				break;
			default:
				break;
			}
		}
	} //delete
	
	void search() {
		System.out.println(" [ 5. 학생성적 검색 ] ");
		System.out.println("찾고자하는 학생의 이름을 검색해 주세요.");
		search = scan.next();
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(search.equals(s.getName())) {
				temp=1;
				searchNo = i;
				break;
			}
		}
		if(temp==0) {
			System.out.printf("%s학생을 찾을수 없습니다. \n",search);
		}else {
			System.out.printf("%s학생을 찾았습니다. \n",search);
			Stu s = list.get(searchNo);
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
			System.out.println("----------------------------------------------------------");
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s.getNo(),s.getName(),
					s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
	} //search
	
	void nametns() {
		list.sort(new Comparator<Stu>() {
			public int compare(Stu s1,Stu s2) {
				return s2.getName().compareTo(s1.getName());}
		});
	} //nametns
	
	void totaltns() {
		list.sort(new Comparator<Stu>() {
			public int compare(Stu s1,Stu s2) {
				return s2.getTotal()-(s1.getTotal());}
		});
	} //totaltns
	
	void calculateRank() {
	    for (int i = 0; i < list.size(); i++) {
	        int rank = 1; // 기본 석차는 1등
	        for (int j = 0; j < list.size(); j++) {
	            if (list.get(i).getTotal() < list.get(j).getTotal()) {
	                rank++;
	            }
	        }
	        list.get(i).setRank(rank); // 계산된 석차를 설정
	    }
	} //calculateRank
	
	void save() throws Exception {
	    // 파일 경로 설정
	    String directoryPath = "c:/save";
	    String filePath = directoryPath + "/studata1.txt";

	    // 디렉토리 및 파일 생성
	    File directory = new File(directoryPath);
	    if (!directory.exists()) {
	        directory.mkdirs(); // 디렉토리 생성
	        System.out.println("디렉토리가 생성되었습니다: " + directoryPath);
	    }

	    File file = new File(filePath);
	    if (!file.exists()) {
	        file.createNewFile(); // 파일 생성
	        System.out.println("파일이 생성되었습니다: " + filePath);
	    }

	    // 데이터를 파일에 저장
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
	        System.out.println("파일 저장 완료: " + filePath);
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("파일 저장 중 오류가 발생했습니다.");
	    }
	}// save

	
}
