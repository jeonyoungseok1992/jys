package com.kh.javai;
import java.util.*;
public class Car {
	//색상, 브랜드, 타입, 엔진, 제조날짜
	String color;
	String brand;
	String type;
	String engine;
	String date;
	int speed;
	int maxSpeed;
	int zero100;
	int maxCc;
	int cc ;
	public Car(String color, String brand, String type, String engine, String date, int maxSpeed, int maxCc) {
		this.color = color;               //.은 접근지정자
		this.brand = brand;
		this.type = type;
		this.engine = engine;
		this.date = date;
		this.maxSpeed = maxSpeed;
		this.maxCc = maxCc;		
		this.cc = 0;
		this.speed = 0;
		
	}
	public int onAxel() {
		if((speed +5) >= maxSpeed) {
			speed = maxSpeed;
		}else {
			speed += 5;
		}
		return speed;
	}
	public int onBreak() {
		if((speed -5) <= 0) {
			speed = 0;
		}else
			speed = 5;
		return speed;

}
	//넣은 기름만큼 추가 남은양 반환
	public int insertCc(int tCc) {
		if((cc +tCc) >= maxCc) {
			int tmpCc = (cc + tCc - maxCc);
			cc = maxCc;
			return tmpCc;
		}else {
			cc += tCc;
			return 0;
		}
	}	
	
	public void statusDisplay(int type) {
		switch(type) {
			case 1 : {
			System.out.println(color+"색 "+brand+"차는 "+type+" "+engine+"타입이고 "+date+"제조되었다 "+"최대속력은 "+maxSpeed+"이고 최대주유량은 "+maxCc+"이다");
			}break;
			case 2 : {
				System.out.println("속도 : "+this.speed);
				System.out.println("잔여기름 : "+this.cc);
			}
			}
		
	
}
}
