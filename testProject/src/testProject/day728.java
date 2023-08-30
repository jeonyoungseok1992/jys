package testProject;
import java.util.Scanner;
public class day728 {

	public static void main(String[] args) {
		
		//변수 : 변수는 메모리공간을 사용하기위해 이름을 붙여 선언하는 것          int num;
		//변수이름 = 값;                 //변수이름                      num = 5; // 변수이름 num
		//자료형 변수이름 = 값; (한번에쓰면)
		
		
		//isButton = @isButton
//		int num = 0
//		if (true) {
//			int i = 0           //i는 if문 {}지역영역 안에서만 사용가능하다
//			System.out.println();
//		}
		
		
		//String str = new String("")
		// (4bYte)  !=   (메모리 자동 계산)
		
//		자료형 [] 배열이름 ;      //여기까지만 적혀있으면 메모리공간을 모르기때문에 사용할 수 없다//배열의 선언
//		배열이름 = new 자료형[길이or크기] ;                                          //배열 메모리 생성 완료
		
		
//		int[] ar = new int[3];
//		
//		ar[0] = 7;
//		ar[1] = 8;
//		ar[2] = 9;
//		
//		int num = ar[0] + ar[1] + ar[2];
//		System.out.println(num);
		
		
		
		
//실습문제8
//		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.print("숫자 : ");
//		num = sc.nextInt();
//		System.out.println("======"+num+"단"+"======");
//		for(int i = 1 ; i <= 9 ; i++) {
//			System.out.println(num+ " * "+i+ " = "+ num*i);
//		
//		}
//		
//실습문제9		-----------왜 무한반복되고 안될까??????????----------i는 ++되지만 num은 입력값 그대로이기때문에  while 때문에 무한반복됨
//		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.print("숫자 : ");
//		num = sc.nextInt();
//		if (num <= 9 && num >0) {
//			while(num<=9) {
//				System.out.println("======"+num+"단"+"======");				
//					for(int i = 1 ; i <= 9 ; i++) {
//						System.out.println(num+ " * "+i+ " = "+ num*i);
//					}			
//			
//			}
//		
//		
//		}else
//			System.out.println("9이하의 숫자만 입력해주세요.");
		
		
//실습문제9 정답			
//		Scanner sc = new Scanner(System.in);
//		int dan;
//		System.out.print("숫자 : ");
//		dan = sc.nextInt();
//	
//		if (dan<10 && dan > 0) {
//			for (int j = dan; j <10 ; j++) {
//				System.out.println("======"+j+"단"+"======");
//					for (int i = 1 ; i <10; i++) {
//							System.out.println(j+ " * "+i+ " = "+ dan*i);
//					}
//		}		
//		}else
//			System.out.print("9이하의 숫자만 입력해주세요.");
		
//실습문제11
//		Scanner sc = new Scanner(System.in);
//		int num1, num2;
//		System.out.print("시작 숫자 : ");
//		num1 = sc.nextInt();
//		System.out.print("공차 : ");
//		num2 = sc.nextInt();
//		
//		for (int i = num1; i <= 9*num2+num1 ;i += num2 ) {
//			System.out.print(i+" ");
//		}
		
//실습문제11 정답
//		Scanner sc = new Scanner(System.in);
//		int start, term;
//		System.out.print("시작 숫자 : ");
//		start = sc.nextInt();
//		System.out.print("공차 : ");
//		term = sc.nextInt();
//		
//		for (int i = 0 ; i < 10; i++) {
//			System.out.println(start + " ");
//			start += term;
//		}
	
		
		
//실습문제12		
//		Scanner sc = new Scanner(System.in);
//		int num1, num2;
//		String str ;
//		do {
//		System.out.print("연산자(%^+/*) : ");
//		str = sc.next();	
//		System.out.print("정수1 : ");
//		num1 = sc.nextInt();
//		System.out.print("정수2 : ");
//		num2 = sc.nextInt();
//			switch (str) {
//				case("+") : {
//					System.out.println(num1 +" + "+num2+" = "+(num1+num2));
//					break;
//			}	case("-") :
//					System.out.println(num1 +" - "+num2+" = "+(num1-num2) );
//					break;
//				case("*") :
//					System.out.println(num1 +" * "+num2+" = "+num1*num2 );
//					break;
//				case("/") :
//					System.out.println(num1 +" / "+num2+" = "+num1/num2 );
//					break;
//				case("%") :
//					System.out.println(num1 +" % "+num2+" = "+num1%num2 );
//					break;
//				case("exit") :
//					System.out.println("프로그램을 종료합니다.");
//				    break;
//			}	
//			break;
//		}while (str != "+" && str != "-" &&str != "*" &&str != "/" &&str != "%");
//			System.out.println("없는 연산자입니다. 다시 입력해주세요");
		
		
//실습문제12 정답		
//		Scanner sc = new Scanner(System.in);
//		int num1, num2;
//		String str ;
//		while(true) {
//		System.out.print("연산자(%^+/*) : ");
//		str = sc.next();	
//		
//		if (str.equals("exit")) {
//			System.out.println("프로그램을 종료합니다");
//			break;
//		}
//		System.out.print("정수1 : ");
//		num1 = sc.nextInt();
//		System.out.print("정수2 : ");
//		num2 = sc.nextInt();
//		
//		
//		switch (str) {
//			case("+") : 
//				System.out.println(num1 +" + "+num2+" = "+(num1+num2));
//				break;
//			case("-") :
//				System.out.println(num1 +" - "+num2+" = "+(num1-num2) );
//				break;
//			case("*") :
//				System.out.println(num1 +" * "+num2+" = "+num1*num2 );
//				break;
//			case("/") :
//				if (num2 ==0) 
//					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//			
//				System.out.println(num1 +" / "+num2+" = "+num1/num2 );
//				break;
//			case("%") :
//				System.out.println(num1 +" % "+num2+" = "+num1%num2 );
//				break;
//			default : 
//				System.out.println("없는 연산자입니다. 다시 입력해주세요");
//		}
//		
//		}
		   
//실습문제13				
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		for (int i = 1 ; i <=num ; i++) {				
				for (int j = 0; j < i ; j++)
					System.out.print("*");
				System.out.println();
		}
		
		

		
		
//실습문제1		
//		Scanner sc = new Scanner(System.in);
//		int num ;
//		do {
//			System.out.println("정수 : ");
//			num = sc.nextInt();
//			if(num<0) {
//				System.out.println("양수가 아닙니다");			
//			}for(int i = 0 ; i >=num; i++)
//					if(i%2 != 0)
//						System.out.println("박");
//					else
//						System.out.println("수");
//		}while(num<0);

		
		
//실습문제1 정답	
//		Scanner sc = new Scanner(System.in);
//		int num ;
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//		
//		if (num < 1)
//			System.out.print("양수가 아닙니다");
//		else {
//			for (int i = 1; i <= num; i++) {
//				if (i % 2 == 0)
//					System.out.print("수");
//				else
//					System.out.print("박");
//		}
//		
//		}
		

//실습문제2
//		Scanner sc = new Scanner(System.in);
//		int num ;
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//		do {
//		if (num < 1) {
//			System.out.print("양수가 아닙니다");
//		}
//		else {
//			for (int i = 1; i <= num; i++) {
//				if (i % 2 == 0)
//					System.out.print("수");
//				else
//					System.out.print("박");
//			}	
//			}while (num>=1);	
//		
//		}
		
		
//실습문제2 정답
//		Scanner sc = new Scanner(System.in);
//		int num ;
//		
//		do {
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//		
//		if (num < 1)
//			System.out.print("양수가 아닙니다");
//		else {
//			for (int i = 1; i <= num; i++) {
//				if (i % 2 == 0)
//					System.out.print("수");
//				else
//					System.out.print("박");
//		}
//		
//		}
//		}while(num < 1);
		
//실습문제2 다른정답		
//		Scanner sc = new Scanner(System.in);
//		int num ;
//		
//		while(true) {
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//		
//		if (num < 1)
//			System.out.print("양수가 아닙니다");
//		else {
//			for (int i = 1; i <= num; i++) {
//				if (i % 2 == 0)
//					System.out.print("수");
//				else
//					System.out.print("박");
//		}
//		
//		}break;
//		}	
		
//실습문제5		
//		Scanner sc = new Scanner(System.in);
//		int num1, num2, num3;
//		while(true)
//		System.out.print("난수를 입력하세요 : ");
//		num1 = sc.nextInt();
//		System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
//		num2 = sc.nextInt();	
//		if(num2 >0 && num2 <=100) {
//			 if(num2 <num1)
//				 System.out.print("Down !");
//			 else if(num2 > num1)
//				 System.out.print("Up !");
//			 else if(num1 == num2)
//				 System.out.print("정답입니다 !");
//			 break;
//		 }else 
//			System.out.print("1~100 사이의 숫자를 입력해주세요 : ");
//				num3 = sc.nextInt();
//		
//		
////		}while(num1 <1 || num1 > 100);
		
		
		
		
//실습문제5 정답	
//		Scanner sc = new Scanner(System.in);
//		int nan, in, count = 0;
//		System.out.print("난수를 입력하세요 : ");
//		nan = sc.nextInt();
//		
//		do {
//		System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
//		in = sc.nextInt();
//		count++;
//		if (nan ==in) {
//			System.out.println("정답입니다 !");
//			System.out.print(count+"회만에 맞추셨습니다");
//		} else if (in < 1 || in > 100) {
//			System.out.println("1~100 사이의 숫자를 입력해주세요 ");
//		}else if (nan > in) {
//			System.out.println("up !");
//		} else if (nan < in){
//			System.out.println("down !");
//		}
//		}while(in < 1 || in > 100 ||nan > in ||nan < in);
		
		
		//실습문제5 정답	
//		Scanner sc = new Scanner(System.in);
//		int nan, in, count = 0;
//		System.out.print("난수를 입력하세요 : ");
//		nan = sc.nextInt();
//		
//		while(true) {
//		System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
//		in = sc.nextInt();
//		count++;
//		
//		if (nan ==in) {
//			System.out.print("정답입니다 !");
//			System.out.println(count+"회만에 맞추셨습니다");
//			break;
//		} else if (in < 1 || in > 100) {
//			System.out.println("1~100 사이의 숫자를 입력해주세요 ");
//			count--;
//		}else if (nan > in) {
//			System.out.println("up !");
//		} else if (nan < in){
//			System.out.println("down !");
//		}
//		
//		}
		
		
}

}