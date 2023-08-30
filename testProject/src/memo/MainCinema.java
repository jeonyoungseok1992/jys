package memo;
import java.util.*;
public class MainCinema {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Menu jeon = new Menu("caramel", "zero", 2, 2);
		Menu jeon = new Menu();
		
		
		System.out.println("주문하시겠습니까?");
			switch(sc.next().charAt(0)){
				case('Y') : {
					while(true) {
						System.out.println("1.팝콘 2.콜라 3.주문하기 4.취소");
						switch(sc.nextInt()) {
							case 1 : {
								System.out.println("1.카라멜 2.일반 3.취소");
								switch(sc.nextInt()) {
									case 1 :{
										jeon.popcorn(1);
										System.out.println("개수를 입력해주세요");
										jeon.popcornN(sc.nextInt());
									break;
									}
									case 2 : {
										jeon.popcorn(2);
										System.out.println("개수를 입력해주세요");
										jeon.popcornN(sc.nextInt());
									break;
									}
									default : 									
										
								}break;
							}
							
							case 2 : {
								System.out.println("1.일반 2.제로 3.취소");
								switch(sc.nextInt()) {
									case 1 :{
										jeon.coke(1);
										System.out.println("개수를 입력해주세요");
										jeon.cokeN(sc.nextInt());
									break;
									}
									case 2 : {
										jeon.coke(2);
										System.out.println("개수를 입력해주세요");
										jeon.cokeN(sc.nextInt());
									break;
									}
									default : 
																					
								}
							}break;
							
							case 3 :{
								jeon.bill();
								jeon.Howcash();
								System.out.println(jeon.total+"원입니다.");
								return;
							}
							case 4 : 
								return;
								
								
							
						}
					}
				}
			}
	}
}

		