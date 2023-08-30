package testProject;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
public class d0731 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int[] ref = new int[4];
//		//왼쪽은 Stack에 선언까지만
//		int[] ar = new int[3];      ----------new int[3]이 가비지 쓰레기값 된다.
//		ar = new int[7];
//		아무도 사용하지 않는 값 = 쓰레기값=가비지 컬렉터
		
		//길이가 5인 int형 1차원 배열 생성
//		int[] ref;
//		ref = new int[5];
		
		//길이가 7인 double형 1차원 배열 ar2 생성
		
//		double[] ar2 = new double[7];
		
		
		//배열의 변수선언과 메모리할당을 분히라여 길이가 9인 float형 ar1생성
//		float[] ar1;
//		ar1 = new float[9];
//		System.out.println("ar1의 길이 : "+ar1.length);
		
//		String str = "youngseok";
//		System.out.println("str의 길이" +str.length());
		
//		String[] str = new String[5];
//		int sum;
//		str[4] = "hi";
//		str[0] = "youngseok";
//		str[1] = new String("jeon");        // -----------String은 객체기 때문에 String에 한해서만 new String 빼고 쓸 수 있다
//		str[2] = "Monday";
//		str[3] = "Nice";
//		sum = 0;
//		for(int i = 0; i < str.length; i++)	{
//				sum += str[i].length();
//		}System.out.println("총 문자의 수는 : "+sum);
		
		
//		null은 사용자가 넣어준 값
//		컴퓨터가 넣은 값은 undefined
		
//		int[] arr = {1,2,3};
		
		//얕은 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = arr1;
//		arr2[2] = 0;
//		System.out.println(arr1[2]);
		
		//깊은 복사//완전한 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = new int[5];
//		for(int i = 0; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
//		//반복문을 통해서 arr1, arr2에 있는 모든 요소 출력
//		System.out.println(arr2[3]);
		
		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = new int[5];          ////배열도 객체 = 어떤 공간을 묶어서 다양한 기능을 사용할 수 있게함
		
		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = new int[5];
//		//보편적인 배열 복사 방법
//		arr2 = arr1.clone();
//		//배열 arr1을 전부 7로 초기화
//		Arrays.fill(arr1,7);
		
		
//실습문제1
		
//		int[] arr1 = new int[10];
//		for(int i = 0 ; i <10; i++) {
//			arr1[i] = i+1;
//			System.out.print(arr1[i]+" ");
//		}
		
//실습문제2
//		int[] arr1 = new int[10];
//		for(int i = 0 ; i <10; i++) {
//			arr1[i] = 10-i;
//			System.out.print(arr1[i]+" ");
//		}
		
//실습문제3		
//		int num;
//		System.out.print("양의 정수 : ");                  //배열의 초기화 , 변수의 초기화 = 초기값 넣어주는 것
//		num = sc.nextInt();
//		int[] arr1 = new int[num];              
//		for(int i = 0; i <num; i++) {
//			arr1[i] = i+1;
//			System.out.print(arr1[i]+" ");
//		}
		
//		String str[] = new String[5];
//		str[0] = "사과";
//		str[1] = "귤";
//		str[2] = "포도";
//		str[3] = "복숭아";
//		str[4] = "참외";
		
//		String[] str = {"사과", "귤"};
//		
//			
//		System.out.println(str[0]);
		
//실습문제5
//		int count = 0;
//		String[] str = new String[11];
//		str[0] = "a";
//		str[1] = "p";
//		str[2] = "p";
//		str[3] = "l";
//		str[4] = "i";
//		str[5] = "c";
//		str[6] = "a";
//		str[7] = "t";
//		str[8] = "i";
//		str[9] = "o";
//		str[10] ="n";		
//		char cha;
//		String str1;
//		System.out.println("문자열 : ");
//		str1 = sc.next();
//		System.out.println("문자 : ");
//		cha = sc.next().charAt(0);
//		for(int i = 0; i < 11; i++) 
//			if(str[i] = cha) {
//				count++;
//			 System.out.println("갯수 : "+count );
//			}
//		System.out.println("application에 i가 존재하는 위치(인덱스)" +str.length());
		
		
		
//실습문제5 정답
//		int count = 0;
//		String str; //검색할 문자열
//		char ch; //찾을 문자 하나
//		int[] strloc ; //문자 하나 위치값(인덱스) 저장
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
//		strloc = new int[str.length()];
//		
//		System.out.print("문자 : ");
//		ch = sc.next().charAt(0);
//		
//		//ch가 존재하는 위치 구하기
//		System.out.println("찾을 문자 위치 번호 : ");
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == ch) {
//				
//				System.out.println(i+" ");
//				count++;
//			}
//		
//		}System.out.println("i 갯수 : "+count );
		
		
//		String[] str = new String[7];
//		str[0] = "월";
//		str[1] = "화";
//		str[2] = "수";
//		str[3] = "목";
//		str[4] = "금";
//		str[5] = "토";
//		str[6] = "일";
//		
//		int num;
//		while(true) {
//		System.out.print("0~6 사이 숫자 입력 : ");
//			num = sc.nextInt();
//				if(num>=0 && num <=6) {
//					System.out.println(str[num]+"요일");
//					break;
//				}
//				else {
//					System.out.print("잘못 입력하셨습니다");
//				}
//		}
//		switch(num) {
//			case(0):	
//			case(1):
//			case(2):
//			case(3):
//			case(4):
//			case(5):
//			case(6):
//				System.out.println(str[num]+"요일");
//				break;
//			default:
//				System.out.println("잘못입력");
//		}
//실습문제7	
	
	int number, sum;	
	sum = 0;
	System.out.print("정수 : ");
	number = sc.nextInt();
	int[] num = new int[number];
	for(int i = 0; i < number ; i++) {
		System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			num[i] = sc.nextInt();
	}	
	
	for(int i = 0; i < num.length ; i++) {
		sum += num[i];
		System.out.print(num[i]+" ");
	}
	
	System.out.println();
	System.out.println("총 합 : "+ sum);
		
		
//실습문제8
//		int len, count = 0;
//		int[] arr;
//		
//		while(true) {
//			System.out.print("정수 : ");
//			len = sc.nextInt();
//				if(len % 2 != 0 && len >= 3) {
//					arr = new int[len];
//					
//					for(int i = 0 ; i < arr.length; i++) {
//							
//							if(i <= arr.length/2) {
//								count++;		
//							}else if(i >arr.length/2) {
//								count--;
//							}
//							arr[i] = count;
//						}
//					for(int i = 0 ; i < arr.length; i++)
//						if(i == arr.length-1) {
//							System.out.print(arr[i]+ " ");
//						}else
//							System.out.print(arr[i]+ ", ");
//					break;
//				}else
//					System.out.println("다시 입력하세요.");
//		}
		
		
//실습문제9
		
//		String[] arr = {"양념","간장","후라이드"};  
//		String str, res  ;
//		System.out.println("치킨 이름을 입력하세요 : ");
//		str = sc.next();                
//		
//		
//		for(int i = 0; i <arr.length; i++) {
//			if(str.equals(arr[i])) {
//				res = str + "치킨 배달 가능";
//				System.out.println(str+"치킨 배달 가능");
//				break;
//			}else {
//				res = str + "치킨은 없는 메뉴입니다";
//				System.out.println(str+"치킨은 없는 메뉴입니다");
//				break;
//			}
//		}
		
//실습문제10
		
//		String str;               //////////str.length는 string이니까 "  "하나 아닌가??????
//		char[] ch;                     ///////////char.Array로 하는방법 모름 //////////
//		
//		System.out.println("주민등록번호(-포함) : ");
//		str = sc.next();
//		ch = new char[str.length()];  
//		
//		for(int i = 0; i <str.length(); i++) {			
//			if(i >= 8) {
//				ch[i] = '*';
//			}else {
//				ch[i] = str.charAt(i);
//			}
//			System.out.print(ch[i]);
//		}
		
		
		//난수 표현하는법
		//Math.random()     -------- 0보다 크고 1보다 작은 난수 발생
		//값을 곱하고 int형으로 변환해서 정수형 난수를 발생시킬 수 있다
		
		
//실습문제11		
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10+1);
//			System.out.print(arr[i]+" ");
//		}
		
//실습문제12
//		int[] arr = new int[10];
//		int max = 0; 
//		int min = 11;
//		for(int i = 0; i < arr.length; i++) {                ///////max = (arr[i] > max) ? arr[i] : max
//			arr[i] = (int)(Math.random()*10+1);              ////// min = (arr[i] < min) ? arr[i] : min 삼항연산으로도 가능
//			System.out.print(arr[i]+" ");
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//			
//		}
//		
//		System.out.println();
//		System.out.println("최대값 : "+max);
//		System.out.println("최소값 : "+min);
	
		
//실습문제13		이게 아니라 wihle로 바꿔줘야한다
//		int[] arr = new int[10];
//		int num = (int)(Math.random()*10+1);
//		
//		//[0,0,0,0,0,0,0,0,0,0,0,]
//		for(int i = 0; i < arr.length; i++) {
//			//난수 입력받기
//			int nan = (int)(Math.random()*10+1);
//			
//			//난수 검사
//			for (int j= 0; j < arr.length; j++) {
//				if (arr[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}
//			if (nan == 0)
//				continue;
//			
//			arr[i] = nan;
//		}
	
		//[4,6,0,0,0,0,0,0,0]
		
//		int[] arr = new int[10];
//		int num = (int)(Math.random()*10+1);
//		
//		int i = 0;
//		while( i < arr.length) {
//			int nan = (int)(Math.random()*10+1); 
//			
//			for (int j= 0; j < arr.length; j++) {
//				if (arr[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}
//			
//			if (nan == 0)
//				continue;
//			else {
//				arr[i] = nan;
//				i++;
//			}
//			
//			
//		}
//	
//		for (i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
	
	
	
	}

}


