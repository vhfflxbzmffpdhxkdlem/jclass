package j0124;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Ja0124_07 {

	public static void main(String[] args) {
		// c:/save/stu.txt 파일 읽어와서 
		// 문자열 -> 숫자로 변형해서 입력을 시켜야 계산이 가능함.
		ArrayList<Stu> list = new ArrayList<Stu>();
		int no=0,kor=0,eng=0,math=0,total=0,rank=0;
		double avg=0;
		String name="";
		String li = "";
		try {
			FileReader fr = new FileReader("c:/save/stu.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				String[] str = li.split(",");
				// 가져온 데이터를 변수 저장
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
		} catch (Exception e) {e.printStackTrace();}
		
		// list출력
		for(int i=0;i<list.size();i++) {
			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n",
					list.get(i).getNo(),list.get(i).getName(),
					list.get(i).getKor(),list.get(i).getEng(),
					list.get(i).getMath(),list.get(i).getTotal(),
					list.get(i).getAvg(),list.get(i).getRank());
		}
		

	}

}
