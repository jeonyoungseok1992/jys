package com.kh.library;

import java.util.*;

// 회원생성, 수정, 삭제
// 도서 등록,수정,삭제
// 및 도서대여관리
public class Library {
	// 책들을 저장한 공간
	ArrayList<Book> bookList;
	// 회원들을 저장할 공간
	ArrayList<Human> humanList;
	Scanner sc;

	public Library() {
		bookList = new ArrayList<>();
		bookList.add(new Book("간디", "최지원", 152));
		bookList.add(new Book("이순신", "김수민", 242));
		bookList.add(new Book("잔다르크", "이철수", 457));
		
		humanList = new ArrayList<>();
		humanList.add(new Human(1, "최지원", "910524", 42, 'F'));
		humanList.add(new Human(2, "최수민", "700224", 32, 'M'));
		humanList.add(new Human(3, "박지수", "200114", 11, 'F'));
		sc = new Scanner(System.in);
	}

	// 도서등록, 도서대여, 도서반납
	// 을 선택하는 메인화면 출력
	public void mainMenu() {
		int number = 0;
		while (number != 9) {
			System.out.println("============================");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서대여");
			System.out.println("3. 도서반납");
			System.out.println("4. 회원등록");
			System.out.println("9. 프로그램 종료");
			System.out.println("============================");
			System.out.println("원하시는 서비스 번호를 입력하세요 : ");

			// 원하는 서비스 번호 입력받기
			number = sc.nextInt();
			sc.nextLine();
			switch (number) {
			case 1:
				printBookList();
				bookList.add(this.createBook());
				break;
			case 2:
				rentBook();
				break;
			case 3:
				break;
			case 4:
				printHumanList();
				humanList.add(this.createHuman());
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	// 도서 대여를 위한 메서드
	public void rentBook() {
		if (bookList.size() == 0) {
			System.out.println("도서등록이 필요합니다.");
			return;
		} else if (humanList.size() == 0) {
			System.out.println("회원등록이 필요합니다.");
			return;
		}
		
		// 대여하는 사람을 선택하는 코드
		Human selectHuman = null;
		while(selectHuman == null) {
			printHumanList();
			System.out.print("어떤 회원으로 대여하시겠습니까?(id입력) : ");
			int selectKey = sc.nextInt();
			sc.nextLine();
			
			for (Human human : humanList) {
				if (selectKey == human.getKey()) {
					selectHuman = human;
				}
			}
		}
		
		// 대여할 book을 선택하는 코드
		Book selectBook = null;
		while(selectBook == null) {
			printBookList();
			System.out.println("어떤 책을 대여하시겠습니까?(도서코드입력) : ");
			
			int selectCode = sc.nextInt();
			sc.nextLine();
			
			for (int i = 0; i < bookList.size(); i++) {
				Book book = bookList.get(i);
				if (selectCode == book.getCode()) {
					selectBook = book;
				}
			}
		}
		
		//책을 대여해준다.
		// 책에는 isRent상태를 false로 변경
		// 사람은 대여책 코드를 등록시킨다.
		selectHuman.setRentBookCode(selectBook.getCode());
		selectBook.setIsRent(false);
		
	}

	// bookList의 목록을 보여주는 메서드
	public void printBookList() {
		System.out.println("--------------------------------");
		if (bookList.size() > 0) {
			System.out.println("번호 \t 제목 \t 작가 \t 대여여부");
			for (Book book : bookList) {
				System.out.println(book.toString());
			}
		} else {
			System.out.println("등록된 도서 없음");
		}
		System.out.println("--------------------------------");
	}

	// humanList의 목록을 보여주는 메서드
	public void printHumanList() {
		System.out.println("--------------------------------");
		if (humanList.size() > 0) {
			System.out.println("ID \t 이름 \t 생년월일 \t 나이 \t 성별 \t 도서대여현황");
			for (Human human : humanList) {
				System.out.println(human.toString());
			}
		} else {
			System.out.println("등록된 회원 없음");
		}
		System.out.println("--------------------------------");
	}

	// 사용자에 입력에 따라 사람객체를 생성해서 반환한다.
	public Human createHuman() {
		// 입력받기위한 객체
		String name, residentNumber;
		int age, key;
		char gender;
		// 이름, 나이, 주민등록번호, 성별을 입력받아 사람객체 한개를 생성한다.

		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("주민등록번호 앞 6자리를 입력하세요. : ");
		residentNumber = sc.nextLine();
		System.out.print("성별을 입력해주세요.(남 : M, 여자는: F) : ");
		gender = sc.nextLine().toUpperCase().charAt(0);

		System.out.print("고객 코유코드를 입력하세요. : ");
		key = sc.nextInt();
		sc.nextLine();

		Human human = new Human(key, name, residentNumber, age, gender);
		System.out.println(human.toString() + " 생성완료");

		return human;
	}

	// 사용자에 입력에 따라 책객체를 생성해서 반환한다.
	public Book createBook() {
		// 입력받기위한 객체

		String title, author;
		int code;
		// 제목, 작가, 책코드를 입력받는다.

		System.out.print("책 제목을 입력하세요 : ");
		title = sc.nextLine();
		System.out.print("작가를 입력하세요 : ");
		author = sc.nextLine();
		System.out.print("책 코유코드를 입력하세요. : ");
		code = sc.nextInt();
		sc.nextLine();

		Book book = new Book(title, author, code);
		System.out.println(book.toString() + " 생성완료");

		return book;
	}
}
