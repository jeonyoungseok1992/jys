package testProject;
import java.util.*;
public class D0803 {               //참조변수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		num = 3.75;
		
		int num2;
		num2 = sc.nextInt();
		
		int[] arr = new int[num2];
		for(int i = 0; i <arr.length; i++) {           //////"sdfawfa".length()              arr.length
			arr[i] = 5;
			
		}
		
//		
//		arr[2] = 0;
//		for(int i = 0; i <arr.length; i++) {
//			if(arr[i]==0) {
//				System.out.println("5가 아닙니다");
//				continue;
//			}
//			System.out.println(arr[i]);
//		
//		
//		}
		
//		int num1, num2, num3, total;
//		float avg;
//		System.out.print("국어 : ");
//		num1 = sc.nextInt();
//		System.out.print("영어 : ");
//		num2 = sc.nextInt();
//		System.out.print("수학 : ");
//		num3 = sc.nextInt();
//		total = num1 + num2 + num3;
//		avg = (num1 + num2 + num3)/3f;          //float 소수점 첫째자리꺼ㅏ지??
//		System.out.println(" ");
//		System.out.println("합계 : " + total);
//		
//		
//		System.out.println("평균 : "+ avg);
//		
//		if(num1 >=50 && num2 >=50 && num3 >=50 && avg >=70) {
//			System.out.println("합격");
//		}else
//		System.out.println("불합격");
		
//		int num;
//		System.out.println("1이상의 숫자를 입력하세요 : ");
//		while(true) {
//			
//			num = sc.nextInt();
//			if (num >= 1) {
//				for(int i = num; i > 0 ; i--) {
//					
//					System.out.println(i + " ");                   //완성시켜야함
//				}	
//				}
//				
//			else {
//				System.out.println("1이상의 숫자를 입력하세요");
//			}
//			}
		
		
//		int num1, num2;
//		char ch;
//		while(true)	{
//			num1 = sc.nextInt();
//			num2 = sc.nextInt();
//			
//			if(num1 >0 && num1 <=10 && num2 >0 && num2 <=10) {
//				
//				break;
//			}
//			else {
//				System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다");
//			}
//		}
//		char[][] arr = new char[num1][num2];
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0 ; j < arr[i].length; j++) {
//				arr[i][j] =(char)(Math.random()*26+65);                //*26 ?????????
//			} 
//		}		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0 ; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}System.out.println(" ");
//		}
		
//		String[][] strarr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, 
//			{"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "!", "더", "!! "}};
//			for(int i = 0; i < strarr.length; i++) {
//				for(int j = 0 ; j < strarr[i].length; j++)	{
//					System.out.print(strarr[j][i]);
//				}System.out.println(" ");
//			}
		
//		int row;
//		System.out.println("행의 크기 : ");
//		row = sc.nextInt();
//		
//		char[][] arr = new char[row][];
//		for(int i = 0; i < arr.length; i++) {
//			int col;
//			System.out.println(i + "열의 크기를 입력하세요.");
//			col = sc.nextInt();
//			
//			arr[i] = new char[col];				
//		}
//		
//		char al = 'a';
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = al++;
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}System.out.println(" ");
//		}
		
//		String[][] strarr1 = new String[][]{{"강건강", "남나나"}, {"도대담", "류라라"}, {"문미미", "박보배"}};
//		String[][] strarr2 = new String[][]{{"송성실", "윤예의"}, {"진재주", "차천축"}, {"피풍표", "홍하하"}};
//		System.out.println("====1분단=====");
//		for(int i = 0; i < strarr1.length; i++) {
//			for(int j = 0; j < strarr1[i].length; j++) {
//				System.out.print(strarr1[i][j]+" ");
//			}
//		System.out.println("");
//		}
//		System.out.println("====2분단=====");
//		for(int i = 0; i < strarr2.length; i++) {
//			for(int j = 0; j < strarr2[i].length; j++) {
//				System.out.print(strarr2[i][j]+" ");
//			}
//		System.out.println("");
//		}
		
//		String[] students = { "강건강", "남나나", "도대담", "류라라","문미미", "박보배",
//		"송성실", "윤예의","진재주", "차천축","피풍표", "홍하하"};
//		
//		String[][] classRoom1 = new String[3][2];
//		String[][] classRoom2 = new String[3][2];
//		int index = 0;
//		for(int i = 0; i < classRoom1.length; i++) {
//			for(int j = 0; j < classRoom1[i].length; j++) {
//				classRoom1[i][j] = students[index];
//				index += 1;
//			}
//		}
//		for(int i = 0; i < classRoom2.length; i++) {
//			for(int j = 0; j < classRoom2[i].length; j++) {
//				classRoom2[i][j] = students[index];
//				index += 1;
//			}
//		}
//		
//		
//		System.out.println("====1분단====");
//		for(int i = 0; i < classRoom1.length; i++) {
//			for(int j = 0; j < classRoom1[i].length; j++) {
//				System.out.print(classRoom1[i][j]+" ");
//				
//			}System.out.println(" ");
//		}
//		System.out.println("====2분단====");
//		for(int i = 0; i < classRoom2.length; i++) {
//			for(int j = 0; j < classRoom2[i].length; j++) {
//				System.out.print(classRoom2[i][j]+" ");
//							
//			}System.out.println(" ");
//		}
//		System.out.println("============\n검색할 학생 이름을 입력하세요 : ");
//		
//		String str = sc.next();
//		int bundan, line, isRight = 0;
//		boolean isTrue = false;
//		
//		for(int i = 0; i < classRoom1.length && !isTrue; i++) {
//			for(int j = 0; j < classRoom1[i].length && !isTrue; j++) {
//				if(classRoom1[i][j].equals(str)) {
//					bundan = 1;
//					line = i;
//					isRight = j;
//					isTrue = true;
//				}
//			}
//		
//		}
//		if(!isTrue)
//		for(int i = 0; i < classRoom2.length && !isTrue; i++) {
//			for(int j = 0; j < classRoom2[i].length && !isTrue; j++) {
//				if(classRoom2[i][j].equals(str)) {
//					bundan = 2;
//					line = i;
//					isRight = j;
//					isTrue = true;
//				}
//			}
//		
//		}
//		if(isTrue) {
//			System.out.println("검색하신"+str+"학생은"+bundan+"분단"+(line == 0 ? ("첫번째") : (line ==1 ? ("두번째") : ("세번째")));
//		}else
//			System.out.println("검색하신"+str+"학생은 찾지 못했습니다");
		
		
		
		
}
}