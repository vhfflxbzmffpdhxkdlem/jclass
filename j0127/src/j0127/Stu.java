package j0127;

import java.util.ArrayList;

public class Stu {
	private int no,kor,eng,math,total,rank;
	static int count = -1;
	String name = "";
	Double avg = 0.0;
	{this.no = ++count;}
	Stu(){}
	
	Stu(String name,int kor,int eng,int math){
		this.no = count;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = this.kor+this.eng+this.math;
		this.avg = this.total/3.0;
	}
	Stu(int no,String name,int kor,int eng,int math,int total,double avg,int rank){
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Stu.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAvg() {
		return avg;
	}
	public void setAvg(Double avg) {
		this.avg = avg;
	}
}
