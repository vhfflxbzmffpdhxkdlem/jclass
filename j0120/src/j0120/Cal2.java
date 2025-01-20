package j0120;

import java.util.Arrays;
import java.util.Scanner;

public class Cal2 {

	String[] strPrint() {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		for (int i=0;i<name.length;i++) {
			System.out.printf("%d번 이름을 입력하세요. \n",i+1);
			name[i] = scan.next();
		}
		for (int i=0;i<name.length;i++) {
			System.out.printf("이름%d : %s \n",i+1,name[i]);
		}
		System.out.println(Arrays.toString(name));
		return name;
	}
	
}
