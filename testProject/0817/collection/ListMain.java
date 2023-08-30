package collection;
import java.util.*;

public class ListMain {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();        //List 인터페이스가 부모   //바구니가 없는 상태
		List<String> list = new LinkedList<>();          //필요에 따라 골라쓰면 된다
//		컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");                    //첫번째 배열 자리 만들고 Toy넣어준 것
		list.add("Box");
		list.add("Robot");
		
		System.out.println(list);
		//저장된 문자열 인스턴스의 참조
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i) + '\t');
			
		}
		list.remove(0);
		System.out.println(list.get(0));
//		System.out.println();
//		
//		
  //첫번째 인스턴스 삭제
//		
//		//첫번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
//		for(int i = 0; i < list.size(); i++)
//			System.out.println(list.get(i) + '\t');
//		System.out.println();
		
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			list2.add(i);
			System.out.print(list2.get(i));
		}
		System.out.println();
		System.out.println(list2.get(3));
		
			
		
		
	}
	

}
