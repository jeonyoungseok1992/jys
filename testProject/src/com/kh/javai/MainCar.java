package com.kh.javai;
import java.util.*;
public class MainCar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Car bee = new Car("검정", "Honda", "sedan", "gasoline", "2020-09-11", 200, 20000  );
	
		bee.statusDisplay(sc.nextInt());
		
	
		//행동을 입력하는 프로그램 
		boolean isFinish = false;
		while(!isFinish) {
			System.out.println("원하는 행동의 버튼을 클릭하세요");
			System.out.println("-------------------");
			System.out.println("1. 달린다");
			System.out.println("2. 멈춘다");
			System.out.println("3. 기름을 충전한다");
			System.out.println("4. 속도와 잔여기름양을 확인한다");
			System.out.println("다음버튼을 누르면 종료");
			
			switch(sc.nextInt()) {
				case 1:{
					bee.onAxel();
					break;
				}
				case 2:{
					bee.onBreak();
					break;
				}
				case 3:{
					System.out.println("얼마나 충전하시겠습니까?");
					int cc2 = sc.nextInt();
					bee.insertCc(cc2);
					System.out.println("충전 완료했습니다");
					break;
				}
				case 4:
					bee.statusDisplay(2);
				default:
					isFinish = true;
			}
		
		}
	}
}
