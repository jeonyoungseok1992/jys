package com.kh.javai;
import java.util.*;

import arr.POSSystem;
public class MainBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Library bk = Library.getLibInstance();
//		Book[] arrBook = new Book[5];
		
//		boolean isTrue = true;
//		while(true) {
//			System.out.println("1.도서등록\t2.도서삭제\n3.전체도서조회\n4.도서검색\n5.뒤로가기");
//			switch(sc.nextInt()) {
//				case 1:{
//			//도서등록
//					for(int i = 0; i < arrBook.length; i++) {
//						if(arrBook[i] == null) {
//							String name;
//							System.out.println("등록할 책 이름 : ");
//							name = sc.next();
//							String location;
//							System.err.println("등록할 책 위치 : ");
//							location = sc.next();
//							
//							arrBook[i] = new Book(name, location);
//							System.out.println(arrBook[i].viewBook());
//							break;
//						}else if(i == arrBook.length-1) {
//							System.out.println("더 이상 책을 등록할 수 없습니다");
//						}
//					}
//				}break;
//				case 2:{
//					//도서삭제
//					for(int i = arrBook.length-1; i >= 0; i--) {
//						if(arrBook[i] != null) {
//							arrBook[i] = null;
//							break;
//						}else if(i == 0)
//							System.out.println("더 이상 등록된 책이 없습니다");
//				}
//				}break;
//				case 3:{
//					//전체 도서 조회
//					for(int i = 0; i < arrBook.length; i++) {
//						if (arrBook[i] == null)
//							break;
//						System.out.println(arrBook[i].viewBook());
//				}
//				}break;
//				case 4:{
//				//도서 검색
//					String str = sc.next();
//					boolean found = false;
//					for(int i = 0; i < arrBook.length; i++) {						
//						if(arrBook[i] != null && arrBook[i].getName().equals(str)) {
//							System.out.println(arrBook[i].getLocation());
//							System.out.println(str+" 책을 찾았습니다");
//							found = true;
//							break;
//						} 
//					}
//					if(!found)						
//						System.out.println("책을 찾을 수 없습니다");
//				}break;
//				default:
//					isTrue = false;
//		}
//		
//	}	
		
		
		
		
		
		
		
		boolean isTrue = true;
		while(isTrue) {			
			switch(bk.printMenu()) {
				case 1:{
					bk.resistBook();
				}break;
				case 2:{
					bk.deletBook();
				}break;
				case 3:{
					bk.reviewBook();
				}break;
				case 4:{
					bk.searchBook();
				}break;
				default:{
					isTrue = false;
					System.out.println("프로그램종료");
					
				}
			}
		
	}

}
}