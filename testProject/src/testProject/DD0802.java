package testProject;
import java.util.*;
public class DD0802 {
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.println("프로그램의 시작");
//		hiEveryone(12);
//		hiEveryone(13);
//		System.out.println("프로그램의 끝");
//		
//	}
//	                             //매개변수
//	public static void hiEveryone(int age) {          //int age = 넘어오는값; 이랑 똑같다
//		System.out.println("좋은 아침입니다");
//		System.out.println("제 나이는"+ age + "세 입니다");
//	}
		
		
//	public static void main(String[] args) {
//		double myHeight = 169;
//		hiEveryone(12, 12.5);
//		hiEveryone(13, myHeight);
//		
//	}
//	public static void hiEveryone(int age, double height) {
//		System.out.println("제 나이는"+ age + "세 입니다");
//		byEveryone();
//		System.out.println("저의 키는"+ height + "cm 입니다");
//	}
//	public static void byEveryone() {
//		System.out.println("다음에 뵙겠습니다");                
//	}
	
//	public static void main(String[] args) {
//		int result;
//		result = adder(4,5);
//		System.out.println("4 + 5 = " + result);
//		System.out.println("3.5 x 3.5 - " + square(3.5));
//	}
//	public static int adder(int num1, int num2) {
//		int addResult = num1 + num2;
//		return addResult;
//	}
//	public static double square(double num) {
//		return num * num;
//	}
	
//	public static void main(String[] args) {
//		System.out.print(factorial(3));
//	}	
//	public static int factorial(int n) {
//		
//		if(n == 1) {
//			return 1;
//		}
//		else
//			return n * factorial(n-1);
//	
//		
//	}
	public static void main(String[] args) {
//		BankAccount yoon = new BankAccount();
//		BankAccount park = new BankAccount();
//		BankAccount tmp ;
//		
//		yoon.balance = 100;
//		park.balance = 200;
////		
////		yoon.name = "youngseok"
////		park.name = "youngseok"
//		
//		System.out.println(yoon.balance);
//		System.out.println(park.balance);
////		
//		tmp = yoon;
//		yoon = park;
//		park = tmp;
//		tmp = null;
//		yoon.deposti(1000);		
//		park.deposti(3000);
//		System.out.println(yoon.checkMyBalance());
//		System.out.println(park.checkMyBalance());
//	
		BankAccount jeon = new BankAccount();              //창조변수 jeon 으로 주소만들고 BankAccount라는 설계도로 메모리 공간 잡아준다
		BankAccount yoon = new BankAccount(500, "윤","123-456");
		System.out.println(yoon.checkMyBalance());
		System.out.println(jeon.checkMyBalance());
}
}
////////////class는 객체를 만들기 위한 설계도 

class BankAccount {
	int balance = 10;
	String name;
	String number;
	public BankAccount() {
		balance = 0;
		name = "이름없음";
		number = "0000-0000";
	}
	public BankAccount(int b, String n, String p) {
		balance = b;
		name = n;
		number = p;
	}
	
//	
//	public int deposti(int amount) {
//		balance += amount;
//		return balance;
//	}
//	public int withdraw(int amount) {
//		balance += amount;
//		return balance;
//	}
	public int checkMyBalance() {
		System.out.println("이름 : "+ name);
		System.out.println("잔액 : "+ balance);		
		System.out.println("계좌번호 : " + number);
		return balance;
	}
	
	
	//추상화 : 객체를 생성할 때 모두 갖고 있지만 조금씩 다를수 있는 것
	
}
