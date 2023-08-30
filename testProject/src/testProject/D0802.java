package testProject;

import java.util.*;

public class D0802 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		
//		String str, str2;
//		str = "안녕하세요";
//		str2 = str;
//		str == str2;
//		
//		if(str == "안녕하세요") {                        ////////////string의 특성상 ==이 아니라 equals를 써야한다????????
//			System.out.println("hi");
//		}else
//			System.out.println(str);
//		
//		int[] arr1 = new int[8];
//		for(int i = 0 ; i < arr1.length; i++ ) {
//			arr1[i] = 5;
//			System.out.print(arr1[i]+" ");
//		}
//		System.out.println("");
//		char[][] arr2 = new char[3][2];
//		char ch = 'A';
//		for(int i = 0; i < arr2.length; i++) {
//			for(int j = 0; j < arr2[i].length; j++) {
//				arr2[i][j] = ch++;
//					System.out.print(arr2[i][j]+" ");        /////왜 항상 분리해서 출력하시지?????
//			}System.out.println(" ");
//		}
		
		
		
		int[][] arr = new int[4][4];
		
		for(int i = 0; i <arr.length; i++) {			
			for(int j = 0; j <arr[i].length; j++) {			
				arr[i][j] = (j+1+(i*3));
				if(i==3) {
				arr[i][3] += arr[i][j];
				arr[3][3] += arr[i][j];
				break;
				}
				arr[3][0] += arr[i][0];
				arr[3][1] += arr[i][1];
				arr[3][2] += arr[i][2];
				arr[3][3] += arr[i][0];
				arr[3][3] += arr[i][1];
				arr[3][3] += arr[i][2];	
				
				System.out.println(arr[i][j]);
			
			}
						
		
		}
//		
//		for(int i = 0; i <arr.length; i++) {			
//			for(int j = 0; j <arr[i].length; j++) {
//		System.out.println(arr[i][j]+" "+arr[i][3]);
//			}
//		}
		
	}
}
//		for(int i = 0; i <arr.length; i++) {			
//			for(int j = 0; j <arr[i].length; j++) {
//			System.out.print(arr[i][j]+" ");
//			}
//			System.out.println("");
//		}
		
		//객체 지향 = 인터넷 세상을 현실로 구현하는 것
		
//		System.out.prinln("프로그램의 시작");
//		hiEveryone(12);
//		hiEveryone(13);
//		System.out.prinln("프로그램의 끝");
//		
//	}
//	
//	public static void hiEveryone(int age) {
//		System.err.println("좋은 아침입니다");
//		System.err.println("제 나이는"+ age + "세 입니다");
//		
//		
		
	

		
