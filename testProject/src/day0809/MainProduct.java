package day0809;
import java.util.*;
public class MainProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CafePos pos = CafePos.getInstance();
//		Product aa = new Product("아메리카노", 1800, "아이스입니다");
//		Product latte = new Product("카페라떼", 1900, "고소하죠");
//		Product choco = new Product("핫초코", 2000, "달달하죠");
//		
//		System.out.println(aa.toStirng());
//		System.out.println(latte.toStirng());
//		System.out.println(choco.toStirng());
		
		
		//객체배열 생성하는 방법
//		Product[] ProArr = new Product[3];
//		ProArr[0] = new Product("아메리카노", 1800, "아이스입니다");
//		ProArr[1] = new Product("카페라떼", 1900, "고소하죠");
//		ProArr[2] = new Product("핫초코", 2000, "달달하죠");
//		for(int i = 0 ; i < ProArr.length ; i++)
//			System.out.println(ProArr[i].toStirng());
//		
//		System.out.println(ProArr[1]);
		
		final int MAX = 20;
		
		Product[] menuArr = new Product[MAX];
		
		//음료 금액 설명을 입력받아 객체배열에 추가해 보아라
		String name, description;
		int price;
		boolean isTrue = true;
		Product selectMenu;
		while(isTrue) {
			System.out.println("1.음료추가 \t2.음료삭제 \t3.음료조회 \t4.음료검색 "
					+ "\t5.메뉴수정\t그외입력 : 종료");
			switch(sc.nextInt()) {
			case 1 :{
				System.out.print("음료명을 입력하세요 : ");
				name = sc.next();
				System.out.print("금액을 입력하세요 : ");
				price = sc.nextInt();
				System.out.print("설명을 입력하세요 : ");
				description = sc.next();
				for(int i = 0 ; i < menuArr.length; i++) {
					
					if(menuArr[i] == null) {
						menuArr[i] = new Product(name, price, description);
						System.out.println(name + "가 메뉴에 추가되었습니다.");		
						break;	
					}else if (menuArr[i].getBeverage().equals(name)) {
						System.out.println(name+"은 이미 등록되어있습니다");	
						break;					
					}else if (i == (menuArr.length-1))
						System.out.println("더 이상 메뉴를 추가 할 수 없습니다");
				}
			}break;
			case 2 :{
				for(int i = (menuArr.length-1) ; i >= 0; i--) {
					if (menuArr[i] != null) {
						System.out.println(menuArr[i].getBeverage() + "메뉴가 삭제되었습니다");
						menuArr[i] = null;
						break;
					}else if (i == 0)
						System.out.println("삭제 할 메뉴가 존재하지 않습니다");					
				}
			}break;
			case 3 :{				
				System.out.println("번호\t메뉴명\t가격\t설명");
				for(int i = 0 ; i < menuArr.length; i++) {
					if(menuArr[i] == null) {
						System.out.println(i+"\t-\t-\t-");
					}else
						System.out.println(i+"\t"+menuArr[i].toStirng());
					}
				
			}break;
			case 4:{
				String str;
				str = sc.next();
				for(int i = 0 ; i < menuArr.length; i++) {
					if(menuArr[i] == null) {
						System.out.println("메뉴가 존재하지 않습니다");
						break;				
					}else if(menuArr[i].getBeverage().equals(str)) { 
						System.out.println(menuArr[i].toStirng());						
						break;	
					}else if(i == menuArr.length - 1)
						System.out.println("다 찾아봤는데 그런 메뉴 없음");
				}
			}break;
			case 5 :{//수정할 정보 입력
				System.out.print("수정할 메뉴의 번호를 입력하세요 : ");				
				int num;
				num = sc.nextInt();
				selectMenu = menuArr[num];
				if(selectMenu == null)
					System.out.println("해당 번호의 메뉴가 존재하지 않습니다");
				else {
					System.out.println("수정할 정보를 입력하세요");
					switch(sc.next()) {
						case "이름":{
							System.out.print("새로운 이름을 입력하세요 : ");
							selectMenu.setBeverage(sc.next());
							System.out.println(num + "\t" + selectMenu.toStirng());
						}break;
						case "가격":{
							System.out.print("새로운 가격을 입력하세요 : ");
							selectMenu.setPrice(sc.nextInt());	
							System.out.println(num + "\t" + selectMenu.toStirng());
						}break;
						case "설명":{
							System.out.print("새로운 설명을 입력하세요 : ");
							selectMenu.setDescription(sc.next());
							System.out.println(num + "\t" + selectMenu.toStirng());
						}break;
						default:
							System.out.println("잘 못 입력하셨습니다");
						
						
					}
				}break;				
			
			}
			default : 
				isTrue = false;
				
		
		}
		
		
		
		
	}

}
}