package com.kh.javai;

import java.util.Scanner;

public class Mainlogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		POSSystem pos = POSSystem.getPosInstance();       //클래스 이름으로 바로 접근하면 static메소드다
////		POSSystem pos = new POSSystem();        //private로 잠가놔서 못만드는거같다    
//		pos.saveCustomer(new Customer("전영석", "dudtjr92", "1234", "www"));    //여기가 ㅈㄴ어려움 Customer user 에 new Customer입히는거
//		
////		int jeon = pos.printMenu();
//		boolean isLoop = true;
//		while(true) {
//			switch(pos.printMenu()) {
//				case 1:{//회원등록
//					Customer newUser = pos.insertCustomer();
//					pos.saveCustomer(newUser);
//				}break;
//				case 2:{//회원삭제
//					
//				}break;
//				case 3:{//회원목록출력
//					
//				}break;
//				case 4:{//로그인
//					
//				}break;
//				default:
//					isLoop = false;
//			}
//		
//		}
		//길이가 10인 customer 객체배열을 생성하고
		//0번째 인덱스에 id : myId, password : myPassword12로 객체생성(이름 이메일 자유)
//		Customer[] arr = new Customer[10];
//		arr[0] = new Customer("전영석", "dudtjr92", "1234", "www");
//		
//		//아이디 비밀번호 이름 이메일을 입력받아 Customer객체를 추가해보자
//		
//		//회원삭제//
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == null && i != 0) {
//				arr[i-1] = null;
//				break;
//			}
//			else if(i == arr.length-1)
//				arr[i] = null;
//			
//		}
////		
//		
//		
//		//모든 회원 출력
//		for(int i = 0; i < arr.length; i++) {
//			if (arr[i] == null)         //null안걸르고 출력하면 null에서 toString()메소드 기능을 쓸 수 없다
//				break;
//			System.out.println(arr[i].toString());
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		String name;
//		
//		String id;
//		
//		String pwd;
//		
//		String email;
//		
//		int i = 0;
//		while(i < arr.length) {
//			
//				
//			System.out.println("이름을 입력하세요 : ");
//			name = sc.next();
//			
//			System.out.println("아이디를 입력하세요 : ");
//			id = sc.next();
//			
//			System.out.println("비밀번호를 입력하세요 : ");
//			pwd = sc.next();
//			
//			System.out.println("이메일을 입력하세요 : ");
//			email = sc.next();
//			
//			if(arr[i] == null) {
//			arr[i] = new Customer(name, id, pwd, email);
//			System.out.println("이름 : "+ name);
//			System.out.println("아이디 : "+ id);
//			System.out.println("비밀번호 : "+ pwd);
//			System.out.println("이메일 : "+ email);
//			System.out.println("회원정보가 정상적으로 등록되었습니다"+arr[0].getName());
//			return;
//			}
//			else if(i == arr.length - 1) {
//				System.out.println("더 이상 회원등록을 할 수 없습니다");
//				break;
//			}
//			
//		}
//		
//		
//		
//		
//		
//		//----------------로그인--------------------
//		
////		Customer loginCustomer;
////		
////		String id;
////		String pwd;
////		
////		
////		System.out.println("아이디 : ");
////		id = sc.next();
////		System.out.println("비밀번호 : ");
////		pwd = sc.next();
////		String str = "아이디를 찾을 수 없습니다";
////		for(int i = 0; i < arr.length; i++) {
////			if(arr[i] == null) {
////				System.out.println("등록된 회원정보를 찾을 수 없습니다");
////				break;
////			}
////			if(arr[i].equals(id, pwd)) {
////				loginCustomer = arr[i];       //메모리 생성 전! loginCustomer에서 정보 바꾸면 arr[i]정보도 바뀐다 --같은걸 바라보고 있기때문에(얕은복사)
////				str = "로그인 성공";
////			break;
////			
////			}else if(arr[i].idCheck(id)) {
////				str = "비밀번호가 틀렸습니다";
////				break;
////			}else if (i == arr.length - 1) {
////				System.out.println("등록된 회원정보를 찾을 수 없습니다");
////			}
////		}
//		//---------여기까지 로그인 ----------------

		Customer[] cusArr = new Customer[10];
		cusArr[0] = new Customer("전영석", "dudtjr92", "1234", "www");
		
		
		
		
		
		
		
	}

}
