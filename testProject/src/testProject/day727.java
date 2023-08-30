package testProject;
import java.util.Scanner;
public class day727 {
	public static void main(String[] args) {     
//		Scanner sc = new Scanner(System.in);
//		System.out.print("계절을 입력하세요 :");
//		int month = sc.nextInt();
//		System.out.print("온도를 입력하세요 :");
//		int temperature = sc.nextInt();
//
//		String season ;
//		if (month == 1 || month == 2 || month == 12) {
//			season = "겨울";
//				
//		}else if(temperature >= -12) {
//				
//		}
//	    else if(month >=3 && month <=5) 
//				 season = "봄" ;	 
//			 
//	    else if(month >=6 && month <=8) 
//				 season = "여름" ;	 
//			 
//	    else if(month >=9 && month <=11) 
//				 season = "가을" ;	 
//			 
//	    else  season = "해당하는 계절이 없습니다.";
//	}
//}

		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("계절을 입력하세요 :");
//		int month = sc.nextInt();
//		
//		switch (month) {
//			case 1 :
//			case 2 :
//			case 12 :
//				System.out.println("겨울");
//			break;
//			case 3 :
//			case 4 :
//			case 5 :
//				System.out.println("봄");
//			case 6 :
//			case 7 :
//			case 8 :
//				System.out.println("여름");
//			case 9 :
//			case 10 :
//			case 11 :
//				System.out.println("가을");
//		default :
//			System.out.println("해당하는 계절이 없습니다");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		String id;
//		
//		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
//		id = sc.next();		
//				
//		switch (id) {
//			case ("관리자") : {
//				System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//				break;
//		}	case ("회원") : {
//				System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//				break;
//		}	case ("비회원") : {
//				System.out.println("게시글 조회");
//				break;
//		}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		String a ;
//		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
//		a = sc.next();
//		if (a.equals("관리자")){
//				System.out.println("회원관리");
//		}	else if (a.equals("회원")){
//			System.out.println("게시글");
//		}	else if (a.equals("비회원")) {
//			System.out.println("게시글 조회");
//		}
//				
//				
//				
		
//		Scanner sc = new Scanner(System.in);
//		double height, weight, bMI ;
//		
//		System.out.print("키(m)를 입력해 주세요 : ");
//		height = sc.nextDouble();
//		System.out.print("몸무게(kg)를 입력해 주세요 : ");
//		weight = sc.nextDouble();
//		bMI = (weight/(height*height));
//		System.out.println("BMI 지수 : " + bMI);
//		if ((bMI) < 18.5) {
//				
//				System.out.println("저체중");
//		}	else if ((bMI >= 18.5) && (bMI) < 23) {
//				System.out.println("정상체중");
//		}	else if (bMI >= 23 && bMI < 25) {
//				System.out.println("과체중");
//		}	else if (bMI >= 25 && bMI < 30) {
//				System.out.println("비만");
//		}	else if (bMI > 30) {
//				System.out.println("고도 비만");
//		}
			
//		Scanner sc = new Scanner(System.in);
//		int num1, num2 ;
//		char a ;
//		System.out.print("피연산자1 입력 : ");
//		num1 = sc.nextInt();
//		System.out.print("피연산자2 입력 : ");
//		num2 = sc.nextInt();
//		System.out.print("연산자를 입력(%/+-) : ");
//		a = sc.next().charAt(0);
		
//		if (num1 > 0 && num2 > 0 ) {
//			if (a == '+') 
//				System.out.println(num1+" "+a+" "+num2+" = "+(num1+num2)) ;
//				else if (a == '-')
//					System.out.println(num1+" "+a+" "+num2+" = "+(num1-num2)) ;
//				else if (a == '*')
//					System.out.println(num1+" "+a+" "+num2+" = "+(num1*num2)) ;
//				else if (a == '/')
//					System.out.println(num1+" "+a+" "+num2+" = "+((double)num1/num2)) ;
//				else if (a == '%')
//					System.out.println(num1+" "+a+" "+num2+" = "+(num1%num2)) ;
//		}
//		else	
//			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
		
		
//		if (num1 > 0 && num2 > 0 ) {
//				switch (a) {
//					case('+') : {
//						System.out.println(num1+" "+a+" "+num2+" = "+(num1+num2)) ;
//					}break;
//					case('-') : {
//						System.out.println(num1+" "+a+" "+num2+" = "+(num1-num2)) ;
//					}break;
//					case('*') : {
//						System.out.println(num1+" "+a+" "+num2+" = "+(num1*num2)) ;
//					}break;
//					case('/') : {
//						System.out.println(num1+" "+a+" "+num2+" = "+((double)num1/num2)) ;
//					}break;
//					case('%') : {
//						System.out.println(num1+" "+a+" "+num2+" = "+(num1%num2)) ;
//					}break;
//				default :
//					System.out.println("잘못입력햇음둥");
//				}	
//		}else
//			System.out.println("잘못 입력 했음둥");
	
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int a, b, c ;
//		float total, d ;
//		System.out.print("중간 고사 점수 : ");
//		a = sc. nextInt();
//		System.out.print("기말 고사 점수 : ");
//		b = sc. nextInt();
//		System.out.print("과제 점수 : ");
//		c = sc. nextInt();
//		System.out.print("출석 횟수 : ");
//		d = sc. nextInt();
//		
//		
//		total = (float)(a*0.2 + b*0.3 + c*0.3 + d) ;
//		System.out.println("======== 결과 =======");
//		System.out.println("중간 고사 점수(20) : " + a*0.2);
//		System.out.println("기말 고사 점수(20) : " + b*0.3);
//		System.out.println("과제 점수(20) :	 " + c*0.3);
//		System.out.println("출석 횟수(20) :	 " + d);
//		System.out.println("총점 : "+total);
//		if (total >= 70) {
//			System.out.println("Pass");{
//			}
//		}		
//		else if (total < 70 || 14 >=d)
//			System.out.println("Fail[점수미달]");
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		char num ;
//		System.out.println("실행할 기능을 선택하세요.");
//		System.out.println("1. 권한 확인");
//		System.out.println("2. BMI");
//		System.out.println("3. 계산기");
//		System.out.println("4. P/F");
//		System.out.println("선택 : ");
//		num = sc.next().charAt(0);
//		switch (num) {
//			case('1') :
//					System.out.println("1번 실습문제");             ////////////패스!!!!!!!!!!!!!!!! 시간엄슴
//		}
//		
		
		
//		{
//		int i = 0;
//		
//		while(i<10) {		
//			System.out.println(i);
//			i++;
//			
//		}
//		}
		
//		for (int i = 0; i < 10; i++) {     //////i는 지역변수
//			System.out.println(i);
//		}
//		int dan = 2;
//		for (int i = 1; i < 9; i++) {
//			System.out.println(dan + " * " + i + " = " + (i * dan));
//		}	
		
//		Scanner sc = new Scanner(System.in);
//		int num1 ;
//		System.out.print("1 이상의 숫자를 입력하세요 : ");
//		num1 = sc.nextInt();
//		if (num1 >=1) {
//		for(int i = 1; i <= num1; i++)
//			System.out.print(i+" ");
//		}
//		else if (num1 < 0) {
//			
//			System.out.println("1이상의 숫자를 입력하세요");
//			System.out.println("1이상의 숫자를 입력해주세요");
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//				num1 =sc.nextInt();
//				for(int i = 1; i <= num1; i++)
//					System.out.print(i+" ");
//		}	
		
	
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0;
//		while(num < 1) {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if (num < 1) 
//				System.out.println("1이상의 숫자를 입력해주세요.");
//			
//			else {
//				int i =1;
//				while(i <=num) {
//					System.out.print(i + " ");
//							i++;
//				}
//			
//			}
//				
//		}	
	
			
//		Scanner sc = new Scanner(System.in);
//		
//		int num ;
//		do {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if (num < 1) 
//				System.out.println("1이상의 숫자를 입력해주세요.");
//			
//			else {
//				int i =1;
//				while(i <=num) {
//					System.out.print(i + " ");
//							i++;
//				}
//			
//			}
//				
//		}while(num < 1)	;
	
//		Scanner sc = new Scanner(System.in);
//		int num ;
//		System.out.println("1이상의 숫자를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		for (int i = num; i >= 1; i--){
//			System.out.print(i + " ");
//		}
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int num ;
//		do {
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		num = sc.nextInt();
//		if (num < 1)
//			System.out.println("1이상의 숫자 입력하라고");
//		else {
//			int i = 1;
//			while(i <=num) {
//				System.out.print(num + " ");
//						num--;
//		}
//		}		
//		}while (num <1);
		
		
		Scanner sc = new Scanner(System.in);
		int num = 0;                   //////////////////////while 조건이 작동할 수 있게 일부로 조건에 안맞게 0으로 설정해준 것!
		  									//////////////////////while do while 비교!!!!!!!!!!!!!!!!!!
		while(num < 1) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();		
			
			if (num > 0) {
				for (int i = num; i >=1; i--) {
					System.out.println(i + " ");
				}
			}else {
				System.out.println("1이상을 숫자를 입력하라고");
			}
		}
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int num, sum = 0 ;
//		System.out.print("정수를 하나 입력하세요 : ");
//		num = sc.nextInt();
//		
//		for (int i = 1; num >= i; i++){
//			sum = sum + i;
//			if (num == i)
//				System.out.print(i+" = ");
//			else
//				System.out.print(i + "+" );
//		
//				
//		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int num1, num2, min, max;
//		
//		System.out.print("첫 번째 숫자 : ");
//		num1 = sc.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		num2 = sc.nextInt();
//		if (num1 > 0 && num2 > 0) {
//			for(int i = 0; i < 10; i++) {
//			}
//			if (num1 > num2) {
//				max = num1;
//				min = num2;
//			}else {
//				max = num2;
//				min = num1;
//						
//			}
//			for (int i = min; i <= max; i++)         ///////////대신 for (int i = (num1 > num2 ? num2 : num1); 이런식으로 삼항연산이용해서 위에 min max 지우고 할 수 있다
//				System.out.print(i + " ");
//		}else { 
//			System.out.println("1이상의 숫자 입력하셈.");
//		}
				
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int num1, num2, min, max;
//		
//		
//		do {
//			System.out.print("첫 번째 숫자 : ");
//			num1 = sc.nextInt();
//			System.out.print("두 번째 숫자 : ");
//			num2 = sc.nextInt();
//		if (num1 > 0 && num2 > 0) {
//			if (num1 > num2) {
//				max = num1;
//				min = num2;
//			}else {
//				max = num2;
//				min = num1;
//						
//			}
//			for (int i = min; i <= max; i++)         ///////////대신 for (int i = (num1 > num2 ? num2 : num1); 이런식으로 삼항연산이용해서 위에 min max 지우고 할 수 있다
//				System.out.print(i + " ");
//		}else { 
//			System.out.println("1이상의 숫자 입력하셈.");
//		}
//		
//		
//		 
//		}while (num1 <= 0 || num2 <= 0);
		
		

	
		
		
		
		
		}
	}