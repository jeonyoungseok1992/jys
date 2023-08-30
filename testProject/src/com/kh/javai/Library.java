package com.kh.javai;

import java.util.Scanner;

public class Library {
	Scanner sc = new Scanner(System.in);
	private final static Book[] BOOK_LIST = new Book[5];
	private static Library libInstance = new Library();
	
	
	private Library() {
		
	}
	
	public static Library getLibInstance() {
		return libInstance;
	}
	
	public void resistBook() {
		for(int i = 0; i < BOOK_LIST.length; i++) {
			if(BOOK_LIST[i] == null) {
				String name;
				System.out.println("등록할 책 이름 : ");
				name = sc.next();
				String location;
				System.err.println("등록할 책 위치 : ");
				location = sc.next();
				
				BOOK_LIST[i] = new Book(name, location);
				System.out.println(BOOK_LIST[i].viewBook());
				break;
			}else if(i == BOOK_LIST.length-1) {
				System.out.println("더 이상 책을 등록할 수 없습니다");
			}
		}
	}
	
	public void deletBook() {
		for(int i = BOOK_LIST.length-1; i >= 0; i--) {
			if(BOOK_LIST[i] != null) {
				BOOK_LIST[i] = null;
				break;
			}else if(i == 0)
				System.out.println("더 이상 등록된 책이 없습니다");
	}
	}
	
	public void reviewBook() {
		for(int i = 0; i < BOOK_LIST.length; i++) {
			if (BOOK_LIST[i] == null)
				break;
			System.out.println(BOOK_LIST[i].viewBook());
	}
	}
	
	public void searchBook() {
		String str = sc.next();
		boolean found = false;
		for(int i = 0; i < BOOK_LIST.length; i++) {						
			if(BOOK_LIST[i] != null && BOOK_LIST[i].getName().equals(str)) {
				System.out.println(BOOK_LIST[i].getLocation());
				System.out.println(str+" 책을 찾았습니다");
				found = true;
				break;
			} 
		}
		if(!found)						
			System.out.println("책을 찾을 수 없습니다");
	}
	
	public int printMenu() {
		System.out.println("---------------");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 삭제");
		System.out.println("3. 책 목록출력");
		System.out.println("4. 책 검색");
		System.out.println("---------------");
		System.out.println("원하시는 번호를 입력해 주세요.(이 외 번호 입력시 종료 ");
		
		return sc.nextInt();
	}
	
	
	
	
	
	
}
