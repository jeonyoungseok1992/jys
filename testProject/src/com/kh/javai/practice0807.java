package com.kh.javai;
import java.util.*;
public class practice0807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				//관리할 클래스를 선택해 주세요
				//1.학생추가
				//2.학생삭제
				//3.학생목록 확인
				//4.학생조회
				//기타입력시 뒤로 그전까지 반복
		
		Student[] iban = new Student[30];
		Student[] hban = new Student[30];
		Student[] jban = new Student[30];
		Student[] selectBan = null;
		
		while(true) {
			System.out.println("관리할 클래스를 선택해주세요 1.i 2.h 3.j 기타입력시 종료");
			int num;
			num = sc.nextInt();
			if(num == 1) {
				selectBan = iban;
				
			}else if(num == 2) {
				selectBan = hban;
				
			}else if(num == 3) {
				selectBan = jban;
				
			}else
				selectBan = null;
			if(selectBan == null)
				break;
				
			
			boolean isTrue = true;
				while(isTrue) {
					System.out.println("1.학생추가 \n2.학생삭제 \n3.학생목록 확인 \n4.학생조회 \n기타입력시 뒤로");
					switch(sc.nextInt()) {
						case 1 : {				
							for(int i = 0; i < selectBan.length; i++) {
								if(selectBan[i].equals(null)) {
									selectBan[i] = new Student(sc.next(), sc.nextInt(), sc.next());								
								}								
							}
						}break;
						case 2 : {
							for(int i = 0; i <= selectBan.length; i++) {
								if(i == 0 || selectBan[i].equals("null")) {
									System.out.println("삭제할 학생이 없습니다");							
								}else
									selectBan[i] = null;
									Student.count--;
								}
							}break;
						default:
							isTrue = false;
							
					}
					
				
				
			
				
		}	
	}	
}

}