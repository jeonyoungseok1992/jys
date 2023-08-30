package memo;
import java.util.*;
public class Menu {
	String popcorn;
	String coke;
	int cashPopcorn ;
	int cashCoke ;
	int popcornN;
	int cokeN;
	int total= 0;
	
//	public Menu(String popcorn, String coke, int popcornN, int cokeN) {
//		this.popcorn = popcorn;
//		this.coke = coke;
//		this.popcornN = popcornN;
//		this.popcornN = popcornN;
//		
//	}
	
	public void bill() {
		System.out.println("주문메뉴 : "+this.popcorn+"팝콘 "+this.popcornN+"개 "+this.coke+"콜라 "+this.cokeN+"개 입니다.");
	}
	
	
	public void popcorn(int N) {
		if(N == 1) {
			this.popcorn = "카라멜";
		}else
			this.popcorn = "일반";
	}
	public void coke(int N) {
		if(N == 1) {
			this.coke = "일반";
		}else
			this.coke = "제로";
	}
	public void popcornN(int N) {
		this.popcornN = N;
	}	
	
	public void cokeN(int N) {
		this.cokeN = N;
	}	
	
	
	public void Howcash() {
		total = 7000*this.popcornN + 3000*this.cokeN;
		
	}
	
	 
	 
	 
	 
 }

