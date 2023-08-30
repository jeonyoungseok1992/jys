package japangi;
import java.util.*;
public class DrinkMenu {
	Scanner sc = new Scanner(System.in);
	DrinkController dc = new DrinkController();
	
	public void MainMenu() {
		Boolean isTrue = true;
		while(isTrue) {
			System.out.println("1. 음료수 등록");
			System.out.println("2. 음료수 관리");
			System.out.println("3. 현금 관리");
			System.out.println("9. 종료");
			System.out.println("메뉴번호 : ");
			int num = sc.nextInt();
			switch(num){
				case 1 :{	
					System.out.println("등록 할 음료수 이름");
					String name = sc.next();
					System.out.println("등록 할 음료수 회사 이름 : ");
					String company = sc.next();
					dc.checkDrink(name, company);
					System.out.println("음료수 가격 : ");
					int price = sc.nextInt();
					dc.insertDrink(name, price, company);	
				}break;
				case 2 :{
					System.out.println("수정 할 음료수 이름 : ");
					String name = sc.next();
					System.out.println("음료수 회사 이름 : ");
					String company = sc.next();
					int i = 0;
					for(i = 0 ; i < dc.D.length ; i++) {
						if(dc.D[i] !=null && dc.D[i].getName().equals(name)
								&& dc.D[i].getCompany().equals(company)) {
							
							System.out.println("1. 음료수 개수추가");
							System.out.println("2. 음료수 삭제");
							System.out.println("3. 음료수 가격변경");
							System.out.println("9. 종료");
							System.out.println("메뉴번호 : ");
							int num2 = sc.nextInt();
							switch(num2) {
								case 1 :{									
									System.out.println("추가할 개수를 입력하세요 : ");
									int count = sc.nextInt();
									dc.inputDrink(count);
									dc.countDrink(name, company, count);

								}break;

							
						
							}
							
						}
					}

		
		
				}
			}
		}
	}
}



