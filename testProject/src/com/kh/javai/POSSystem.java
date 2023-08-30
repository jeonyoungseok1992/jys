package com.kh.javai;

import java.util.Scanner;

//pos의 전체적인 관리를 위한 클래스
public class POSSystem {
	Scanner sc = new Scanner(System.in);
	//외부에서 접근이 불가능한 posInstance객체 생성
	private final static Customer[] CUSTOMER_LIST = new Customer[10];
	private static POSSystem posInstance = new POSSystem();
	
	private POSSystem() {          //외부클래스에서 POSSystem 생성자 생성 못하게 막음
		
	}
	public static POSSystem getPosInstance() {
		//POSSystem내부에 있는 매서드 영역이므로 private한 posInstance에 접근이 가능하다
		return posInstance;
	}
	
	//pos 메뉴를 나타내주는 메서드
	public int printMenu() {
		System.err.println("---------------");
		System.err.println("1. 회원등록");
		System.err.println("2. 회원삭제");
		System.err.println("3. 회원목록출력");
		System.err.println("4. 로그인");
		System.err.println("---------------");
		System.err.println("원하시는 번호를 입력해 주세요.(이 외 번호 입력 ");
		
		return sc.nextInt();
	}

	public void viewCustomer() {
		for(int i = 0; i < CUSTOMER_LIST.length; i++) {
			if (CUSTOMER_LIST[i] == null)         //null안걸르고 출력하면 null에서 toString()메소드 기능을 쓸 수 없다
				break;
			System.out.println(CUSTOMER_LIST[i].toString());
		}
		
	}


//객체를 한개만 만들어서 돌려쓰는걸 싱글톤이라고 한다 ex.예약페이지 모든 고객이 하나의 예약페이지로 해야한다

	//회원가입 정보입력받아 배열에 저장하는 메서드
	public void joinCustomer() {
		
	}
	
	
	//회원가입 정보입력을 받기 위한 매서드
	public Customer insertCustomer() {
		String name;		
		String id;		
		String pwd;		
		String email;
				
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.println("아이디를 입력하세요 : ");
		id = sc.next();
		
		System.out.println("비밀번호를 입력하세요 : ");
		pwd = sc.next();
		
		System.out.println("이메일을 입력하세요 : ");
		email = sc.next();
		
		return new Customer(name, id, pwd, email);
		//Customer tmp = new Customer(name, id, pwd, email);
		//return tmp;
		}


	public void saveCustomer(Customer user) {
		for(int i = 0; i < this.CUSTOMER_LIST.length; i++) {
			if(this.CUSTOMER_LIST[i] == null) {
				this.CUSTOMER_LIST[i] = user;
				
				System.out.println(this.CUSTOMER_LIST[i].toString());
				System.out.println("회원정보가 정상적으로 등록되었습니다");
				break;
			}else if(i ==this.CUSTOMER_LIST.length-1) {
				System.out.println("더 이상 회원을 등록할 수 없습니다.");
			}
		}
	}
	}