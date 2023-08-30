package testProject;
import java.util.Scanner;
public class s726 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int grade, ban, number;
//		String str;
//		String gender;
//		float num;
//		
//		System.out.print("이름 : ");
//		str =sc.next();
//		System.out.print("학년 : ");
//		grade = sc.nextInt();
//		System.out.print("반 : ");
//		ban = sc.nextInt();
//		System.out.print("번호 : ");
//		number = sc.nextInt();
//		System.out.print("성별 : ");
//		gender = sc.next();
//		System.out.print("성적 : ");
//		num = sc.nextFloat();
		
//		if (gender.equals("M")) {
//			System.out.println("남학생");
//		}		else if (gender.equals("F")) {
//					System.out.println("여학생");
//		}
//			
//		switch (gender) {
//			case "F" :
//				System.out.println("남학생");	
//			break;				//여기서 break 없어도 남학생만 출력되야하는거 아닌가?????????????	
//		 	case "M" :
//				System.out.println("여학생");
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		int grade, ban, number;
//		String str;
//		char gender;
//		float num;
//		
//		System.out.print("이름 : ");
//		str =sc.next();
//		System.out.print("학년 : ");
//		grade = sc.nextInt();
//		System.out.print("반 : ");
//		ban = sc.nextInt();
//		System.out.print("번호 : ");
//		number = sc.nextInt();
//		System.out.print("성별 : ");
//		gender = sc.next().charAt(0);
//		System.out.print("성적 : ");
//		num = sc.nextFloat();
//		
//		if (gender=='M') {
//		System.out.println("남학생");
//	}		else if (gender=='F') {
//				System.out.println("여학생");
//	}
//		
		
//		Scanner sc = new Scanner(System.in);
//		int age;
//		System.out.println("나이 : ");
//		age = sc.nextInt();
//		if (age <=13) {
//			System.out.println("어린이");
//		}		else if (13 < age && age <= 19) {
//					System.out.println("청소년");
//		}
//		else  
//			System.out.println("성인");
//		
//		Scanner sc = new Scanner(System.in);
//		int a, b, c, total;
//		float avg;
//	
//		
//				
//		System.out.println("국어 : ");
//		a = sc.nextInt();
//		System.out.println("영어 : ");
//		b = sc.nextInt();
//		System.out.println("수학 : ");
//		c = sc.nextInt();
//		total = (a + b + c);
//		System.out.println("\n합계 : " + total);
//		avg = total / 3.0f;     //////////////////float 변수 avg의 자료형을 맞춰주기 위해서  3.0뒤에 f를 붙여준다
//		System.out.println("평균 : " + avg);
//		if (avg >=60 && a >=40 && b>=40 && c >=40) {
//			System.out.println("합격");
//	}	else
//		System.out.println("불합격");
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		char num;
//		System.out.println("숫자를 입력하세요 : ");
//		num = sc.next().charAt(7);
//		if (num=='1') {
//			System.out.println("ㅇㅇ");
//		}		else if (num == '2') {
//					System.out.println("ㄴㄴ");
//		}
//		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int a, b, c;
//		System.out.println("입력1 : ");
//		a = sc.nextInt();
//		System.out.println("입력2 : ");
//		b = sc.nextInt();
//		System.out.println("입력3 : ");
//		c = sc.nextInt();
//		
//		if (a==b &&a==c && b==c) {
//			System.out.println("true");
//		}
//		else
//			System.out.println("false");
		
		
		
//		
//		
//		Scanner sc = new Scanner(System.in);
//		int a, b, c;
//		double str1 ,str2, str3;
//		System.out.println("A사원의 연봉");
//		a = sc.nextInt();
//		System.out.println("B사원의 연봉");
//		b = sc.nextInt();
//		System.out.println("C사원의 연봉");
//		c = sc.nextInt();
//		
//		
//		System.out.println("A사원의 연봉/연봉+a" + a+"/"+a*1.4 );
//		str1 = a*1.4;
//		System.out.println((str1 >= 3000 ? "3000이상" :"3000미만") );
//		
//		
//		System.out.println("A사원의 연봉/연봉+a" + a+"/"+a*1.4 );
//		System.out.println("A사원의 연봉/연봉+a" + a+"/"+a*1.4 );
		
		
//		Scanner sc = new Scanner(System.in);
//		final String MY_ID, MY_PSW;
//		MY_ID = "myId";
//		MY_PSW = "myPassword12";
//		
//		String id, psw;
//		
//		System.out.print("아이디 : ");
//		id = sc.next();
//		System.out.print("비밀번호 : ");
//		psw = sc.next();
//		
//		if (MY_ID.equals(id) && (MY_PSW.equals(psw))) {
//			System.out.println("로그인 성공");
//		}		else if (!MY_ID.equals(id)) {
//					System.out.println("아이디가 틀렸습니다");
//		}			else if (!MY_PSW.equals(psw)){
//						System.out.println("비밀번호가 틀렸습니다");
//		}
		
		Scanner sc = new Scanner(System.in);
		final String MY_ID, MY_PSW;
		MY_ID = "myId";
		MY_PSW = "myPassword12";
		String id, psw;
		
		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("비밀번호 : ");
		psw = sc.next();
		
		switch (id) {
			case MY_ID : 
			     switch (psw) {  
					case MY_PSW : 
			     		System.out.println("로그인 성공");
			     		break;
					default :
						System.out.println("비밀번호가 틀렸습니다");
						break;
			}break;	
			default:
				System.out.println("아이디가 틀렸습니다");			
			break;     	     		  		
		}		
			
	}		
		
}
		
	



