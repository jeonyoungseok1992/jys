package testProject;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
public class d0801 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("배열의 크기를 입력하세요 : ");
		num = sc.nextInt();		
		String[] strarr = new String[num];
		for(int i = 0; i < strarr.length ; i++) {
			System.out.println(i+"번째 문자열 : ");
			strarr[i] = sc.next();
		}
		while(true) {
		System.out.println("더 값을 입력하시겠습니다?(Y/N) : ");
		if ('y' == sc.next().charAt(0)) {
			System.out.println("더 입력하고 싶은 개수 : ");
			num = sc.nextInt();
			for(int i = strarr.length; i < strarr.length+num ; i++) {
				System.out.println(i+"번째 문자열 : ");
				strarr[i] = sc.next();
		}
		}
		else{
			break;
		}
			
		}
	}

}

