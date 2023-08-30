package testProject;
import java.util.Scanner;
public class day726 {
	public static void main(String[] args) {             
		//if 조건문 영역 설명 이해안됨
		//if만이 아니라 {}안에서 선언된 변수를 중괄호 밖에서 출력할 수 없다
		//if 는 혼자 쓸 수 있고 else if종속이기 때문에 혼자 쓸 수 없다
		
		
//		
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		
//		if (num1 >= 100) {
//			System.out.println("3자리 수 이상입니다");
//		}
//		else  {
//			System.out.println("3자리수 이하입니다");
//			}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 : ");	
//		int num1 = sc.nextInt();
//
//		
//		if (num1 > 0) {
//			System.out.println("양수다");
//		}
//		else if (num1 == 0) {
//			System.out.println("0이다");
//		}
//		else {
//			System.out.println("양수가 아니다");
//		}
//		int num;
//		System.out.print("정수 : ");
//		Scanner sc = new Scanner(System.in);
//
//		num = sc.nextInt();
//		
//		if (num % 2 == 0) 
//			System.out.println("짝수다");
//		else
//			System.out.println("홀수다");
		
		
//		Scanner sc = new Scanner(System.in);
//		int num1;
//		int num2;
//
//	
//		System.out.print("인원 수 : ");
//		num1 = sc.nextInt();
//		System.out.print("사탕 개수 : ");
//		num2 = sc.nextInt();
//		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
//		
//		System.out.print("남는 사탕 개수 : " + 100 % 29);
		
//		Scanner sc = new Scanner(System.in);
//		String name ;
//		int num1;
//		int num2;
//		int num3;
//		char sex;
//		double num4;
//		
//		System.out.print("이름 : ");
//		name = sc.next();
//		System.out.print("학년(숫자만) : ");
//		num1 = sc.nextInt();
//		System.out.print("반(숫자만) : ");
//		num2 = sc.nextInt();
//		System.out.print("번호(숫자만) : ");
//		num3 = sc.nextInt();
//		
//		
//		
//		System.out.print("성별(M/F) : ");   //sc.next().charAt(0); 으로 사용가능 대신 "M" 대신 'M'으로 바꿔줘야 한다
////		sex = sc.next();
////		if (sex == "M")
////			sex = "남학생";
////		else if (sex == "F")
////			sex = "여학생";                       //?????????????????안바뀜 학생으로
//		sex = sc.next().charAt(0);=="M"?
//		System.out.print("성적(소수점 아래 둘째자리까지) : ");
//		num4 = sc.nextDouble();
//		System.out.println();
//		
//		System.out.println("\n"+num1+"학년 "+num2+"반 "+num3+"번 "+name+" "+sex+"의 성적은 "+num4+"이다");
//		System.out.print("나이 : ");
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//
//		
//		if (age <= 13)
//			System.out.println("어린이");
////		else if (13 < age <= 19)          ////////////컴퓨터는 이항연산 밖에 안되기때문에 이런서식은 사용 할 수 없다
////			System.out.println("청소년");
//		else if (age >13 && age <=19)
//			System.out.println("청소년");
//		else
//			System.out.println("성인이다능");
//		
//		Scanner sc = new Scanner(System.in);
//		int age ;
//		String grade;
//		
//		System.out.print("나이 :");
//		age = sc.nextInt();
//		grade = (age <=13) ? "어린이" :((age >13 && age <=19) ? "청소년" : "성인");
//		System.out.println(grade);
			
//		Scanner sc = new Scanner(System.in);
//		int num1;
//		int num2;
//		int num3;                                    //total = a +b +c;               //avg = total / (float)3;
//		String str;
//		System.out.print("국어 : ");
//		num1 = sc.nextInt();
//		System.out.print("영어 : ");
//		num2 = sc.nextInt();
//		System.out.print("수학 : ");
//		num3 = sc.nextInt();
//		System.out.println("\n합계 : " +(num1+num2+num3));
//		System.out.println("평균 : "+(float)(num1+num2+num3)/3);
//		str = (num1 >= 40 && num2 >= 40 && num3 >= 40) && ((num1+num2+num3)/3) >=60 ? "합격" : "불합격";
//		System.out.println(str);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("주민번호를 입력하세요(-포함) :");
//		String str ;
//		str = sc.next();
//		if (str.charAt(7) == '1')
//			System.out.println("남자");
//		else if (str.charAt(7) == '2')
//			System.out.println("여자");
//		Scanner sc = new Scanner(System.in);
//		char number;
//		System.out.println("주민번호를 입력하세요(-포함) :");
//		number = sc.next().charAt(7);         ////////////순서방향이 sc있는 오른쪽부터 시작하기 때문에 한자리수인 char를 쓸 수 있다
//		
//		System.out.println((number =='1' || number =='3') ? "남자" : "여자");
		
		
//		Scanner sc = new Scanner(System.in);
//		int numa;
//		int numb;
//		int numc;
//
//		
//		System.out.print("A사원의 연봉 : ");
//		numa = sc.nextInt();
//		
//		System.out.print("B사원의 연봉 : ");
//		numb = sc.nextInt();
//		System.out.print("C사원의 연봉 : ");
//		numc = sc.nextInt();
//		
//		String str;
//		Double numd = numa+numa*0.4 ;
//		Double nume = (double)numb;
//		Double numf = numc+numc*0.15d;
//		System.out.println("A사원의 연봉/연봉+a :" +numa+"/"+numd);
//		System.out.println(str = numa+numa*0.4 > 3000 ? "3000 이상" : "3000 미만");
//		
//		System.out.println("B사원의 연봉/연봉+a :" +numb+"/"+nume);
//		System.out.println(str = numb+numb*0 > 3000 ? "3000 이상" : "3000 미만");
//		System.out.println("C사원의 연봉/연봉+a : "+numc+"/"+numf);
//		System.out.println(str = numc+numc*0.15 > 3000 ? "3000 이상" : "3000 미만");
		
		
//		Scanner sc = new Scanner(System.in);
//		int a, b, c;
//		
//		System.out.print("A사원의 연봉 : ");
//		a = sc.nextInt();
//		System.out.print("B사원의 연봉 : ");
//		b = sc.nextInt();
//		System.out.print("C사원의 연봉 : ");
//		c = sc.nextInt();
//		double d = c+c*0.15 ;     ///////////////////?????????????????c*1.15 말고 c+c*0.15로 할수있는방법은 없나
//		String str;
//		
//		System.out.println("A사원의 연봉/연봉+a :" +a +"/"+(a+a*0.4));
//		System.out.println(str = a+a*0.4 >= 3000 ? "3000 이상" : "3000 미만");
//		System.out.println("B사원의 연봉/연봉+a :" +b +"/"+(float)b);
//		System.out.println(str = b >= 3000 ? "3000 이상" : "3000 미만");	
//		System.out.println("C사원의 연봉/연봉+a :" +c +"/"+d);
//		System.out.println(str = c+c*0.15 >= 3000 ? "3000 이상" : "3000 미만");

//		Scanner sc =new Scanner(System.in);
//		String day = sc.next();
//		
//		
//		switch(day) {
//		case "1":
//		case "화":
//		case "수":
//		case "목":
//		case "금":
//				System.out.println("금일은 정상 영업합니다.");
//				break;
//		case "토":
//		case "일":	
//				System.out.println("쉬어유.");
//				break;
//		default:
//				System.out.println("잘못 입력.");
//		}
		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("5. 종료");
//		System.out.print("메뉴 번호를 입력하세요 :");
//		int a=sc.nextInt();
//		if (a ==1)
//			System.out.println("입력 메뉴입니다");
//			
//		else if (a ==2)
//			System.out.println("수정 메뉴입니다");
//		else if (a ==3)
//			System.out.println("조회 메뉴입니다");
//		else if (a ==4)
//			System.out.println("삭제 메뉴입니다");
//			
//		else if (a ==7)
//			System.out.println("프로그램이 종료됩니다");
		
//		switch(a) {
//		case 1 :
//			System.out.println("입력 메뉴입니다");
//			break;
//		case 2 :
//			System.out.println("수정 메뉴입니다");
//			break;
//		case 3 :
//			System.out.println("조회 메뉴입니다");
//			break;
//		case 4 :
//			System.out.println("삭제 메뉴입니다");
//			break;
//		case 7 :
//			System.out.println("프로그램이 종료됩니다");
//			break;
//		default:
//			System.out.println("잘못 입력하셨습니다");
//		}
		
//		Scanner sc =new Scanner(System.in);
//		System.out.print("숫자를 한 개 입력하세요 :");
//		int a =sc.nextInt();
//		if (a > 0 && a % 2 == 0)
//			System.out.println("짝수다");
//		else if (a % 2 !=0)
//			System.out.println("홀수다");
//		else if (a <= 0)
//			System.out.println("양수만 입력해주세요");
		
//		if (a > 0) {
//			if (a % 2 == 0) {
//				System.out.println("짝수다");
//			else {
//				System.out.println("홀수다");

//			
//		else {
//			System.out.println("양수를 입력해주세요");
//		}
//		}
//		Scanner sc =new Scanner(System.in);
//		int a, b, c;
//		
//		System.out.print("국어점수 :");
//		a = sc.nextInt();
//		System.out.print("수학점수 :");
//		b = sc.nextInt();
//		System.out.print("영어점수 :");
//		c = sc.nextInt();
//		int total = (a + b + c);
//		float avg = ((float)total / 3);
//		
//		if (avg >=60 && a>=40 && b >=40 && c >=40 ) {
//			System.out.println("국어 : "+a);
//			System.out.println("국어 : "+b);
//			System.out.println("국어 : "+c);
//			System.out.println("합계 : "+total);
//			System.out.println("평균 : "+(float)avg);
//			System.out.println("축하합니다, 합격입니다");
//		}
//		else
//			System.out.println("불합격입니다");
		
//		Scanner sc =new Scanner(System.in);
//		String a, b;
//		
//		System.out.print("아이디 : ");
//		a = sc.next();
//		System.out.print("비밀번호 : ");
//		b = sc.next();
//		if (a.equals("myId") && b.equals("myPassword12")) 
//		System.out.println("로그인 성공");
//		else if (a.equals("myId") && !b.equals("myPassword12"))
//		System.out.println("비밀번호가 틀렸습니다");
//		else
//			System.out.println(!a.equals("myId") && b.equals("myPassword12"));
//		System.out.println("아이디가 틀렸습니다");
		
//		Scanner sc =new Scanner(System.in);
//		final String MY_ID, MY_PSW;
//		MY_ID = "myId";
//		MY_PSW = "myPassword12";        /////////////////스트링은 객체다 객체끼리는 무조건 다른 값이다 ==로도 안된다 그렇기때문에  equals로 비교한다
//		
//		String id, psw;
//		
//		System.out.print("아이디 : ");
//		id = sc.next();
//		System.out.print("비밀번호 : ");
//		psw = sc.next();
//		
//		if (MY_ID.equals(id) && MY_PSW.equals(psw))  {
//			System.out.println("로그인 성공");		
//		}
//			else if(!MY_ID.equals(id)) {
//					System.out.println("아이디가 틀렸습니다");
//		}
//			else if   (!MY_PSW.equals(psw))
//					System.out.println("비밀번호가 틀렸습니다");
				
	
		Scanner sc =new Scanner(System.in);
		final String MY_ID, MY_PSW;
		MY_ID = "myId";
		MY_PSW = "myPassword12";        /////////////////스트링은 객체다 객체끼리는 무조건 다른 값이다 ==로도 안된다 그렇기때문에  equals로 비교한다
		
		String id, psw;
		
		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("비밀번호 : ");
		psw = sc.next();
		
		switch(id) {
			case "myId": {
				switch(psw) {
					case "myPassword12" : {
						System.out.println("로그인 성공");
					}break;
					default:
						System.out.println("비밀번호가 틀렸습니다");		
				}
			}
		
		default:
			System.out.println("아이디가 틀렸습니다");
		}
	
//			}
		//초기식 : 반목문을 시작 할 때 한번 세팅을 위한 값
		//조건식 : 매번 반복{}하기 전에 조건에 부합하는지 확인 후 부합하면 반복진행------반복은 중괄호{}
		//증감식 : 반복이 끝날때마다 반복문 탈출을 위해 한번 연산을 진행
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + "출력");
//		for(int i = 1; i <= 10; ) {
//			System.out.println(i + "출력");
//			i++;         ////////////////위치 자유롭다
		
//		int i = 0;
//		while(i < 10) {
//			System.out.println(i + "출력");
//			i++;
//		}
	}	
}