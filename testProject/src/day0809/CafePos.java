package day0809;
import java.util.*;
public class CafePos {
	private static CafePos instance;
	private final int MAX = 5;
	private final Product[] DRINK_ARR = new Product[MAX];
	private Scanner sc = new Scanner(System.in);
	private boolean isRun = true;
	
	
	private CafePos() {//외부에서 객체를 생성하지 못하도록 
					   //생성자의 접근제한자를 private로 설정	
	}
	public static CafePos getInstance() {
		if (instance == null)
			instance = new CafePos();
		return instance;
	}
	
	public boolean getIsRun() {
		return this.isRun;
	}
	
	public void setIsRun(boolean isRun) {
		this.isRun = isRun;
	}
	
	public int printMenu() {
		System.out.println("-----------------------");
		System.out.println("1. 메뉴 생성");
		System.out.println("2. 메뉴 수정");
		System.out.println("3. 메뉴 조회");
		System.out.println("4. 메뉴 삭제");
		System.out.println("5. 메뉴 검색");
		System.out.println("그 외 입력 시 종료");
		System.out.println("-----------------------");
		System.out.println("원하는 메뉴를 선택하게나");
		int num = sc.nextInt();
		sc.nextLine();
		return num;		
	}
	
	public void inserMenu() {
		String name, description;
		int price;
		System.out.print("음료명을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("금액을 입력하세요 : ");		
		price = sc.nextInt();
		sc.nextLine();
		System.out.print("설명을 입력하세요 : ");
		description = sc.nextLine();
		for(int i = 0 ; i < DRINK_ARR.length; i++) {
			
			if(DRINK_ARR[i] == null) {
				DRINK_ARR[i] = new Product(name, price, description);
				System.out.println(name + "가 메뉴에 추가되었습니다.");	
				break;	
			}else if (DRINK_ARR[i].getBeverage().equals(name)) {
				System.out.println(name+"은(ms) 이미 등록되어있습니다");	
				break;					
			}else if (i == (DRINK_ARR.length-1))
				System.out.println("더 이상 메뉴를 추가 할 수 없습니다");	
		}
	}
	
	public void viewMenu() {
		System.out.println("번호\t메뉴명\t가격\t설명\t수량");
		for(int i = 0 ; i < DRINK_ARR.length; i++) {
			if(DRINK_ARR[i] == null) {
				System.out.println(i+"\t-\t-\t-");
			}else
				System.out.println(i+"\t"+DRINK_ARR[i].toStirng());
			}
	}
	
//	public void deleteMenu() {
//		for(int i = (DRINK_ARR.length-1) ; i >= 0; i--) {
//			if (DRINK_ARR[i] != null) {
//				System.out.println(DRINK_ARR[i].getBeverage() + "메뉴가 삭제되었습니다");
//				DRINK_ARR[i] = null;
//				break;
//			}else if (i == 0)
//				System.out.println("삭제 할 메뉴가 존재하지 않습니다");					
//		}
//		
//	}
	
	//중간삭제
	public void deleteMenu() {
		int num;
		num = sc.nextInt();
		if(num>=0 && num < DRINK_ARR.length) {
			if(DRINK_ARR[num] == null) {
				System.out.println("삭제 할 메뉴가 없습니다");				
			}else {	
				for(int i = num ; i < DRINK_ARR.length-1; i++) {					
					DRINK_ARR[i] =DRINK_ARR[i+1];						
					}
				DRINK_ARR[DRINK_ARR.length-1] = null;
				System.out.println(num + "번 메뉴가 삭제되었습니다");				 
				}
						
		}else
			System.out.println("올바른 메뉴 번호를 입력해주세요");
					
		
			
			}
	
	public void reupdateDrinkUnit() {
		Product selectMenu;
		System.out.print("수정할 메뉴의 번호를 입력하세요 : ");				
		int num;
		num = sc.nextInt();
		if(num >=0 && num < DRINK_ARR.length) {	
			if(DRINK_ARR[num] == null)
				System.out.println("해당 번호의 메뉴가 존재하지 않습니다");
			else {
				System.out.println("수정할 정보를 입력하세요");
				switch(sc.next()) {
					case "이름":{
						System.out.print("새로운 이름을 입력하세요 : ");
						sc.nextLine();
						DRINK_ARR[num].setBeverage(sc.nextLine());
						System.out.println(num + "\t" + DRINK_ARR[num].toStirng());
					}break;
					case "가격":{
						System.out.print("새로운 가격을 입력하세요 : ");
						DRINK_ARR[num].setPrice(sc.nextInt());	
						System.out.println(num + "\t" + DRINK_ARR[num].toStirng());
					}break;
					case "설명":{
						System.out.print("새로운 설명을 입력하세요 : ");
						DRINK_ARR[num].setDescription(sc.next());
						System.out.println(num + "\t" + DRINK_ARR[num].toStirng());
					}break;
					default:
						System.out.println("잘 못 입력하셨습니다");
					}	
			}
		}else
			System.out.println("올바른 메뉴 번호를 입력해주세요");
	}
	
	public void searchDrinUnit() {
		String str;
		str = sc.next();
		for(int i = 0 ; i < DRINK_ARR.length; i++) {
			if(DRINK_ARR[i] == null) {
				System.out.println("메뉴가 존재하지 않습니다");
				break;				
			}else if(DRINK_ARR[i].getBeverage().equals(str)) { 
				System.out.println(DRINK_ARR[i].toStirng());						
				break;	
			}else if(i == DRINK_ARR.length - 1)
				System.out.println("다 찾아봤는데 그런 메뉴 없음");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
