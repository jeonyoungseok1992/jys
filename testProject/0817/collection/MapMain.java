package collection;
import java.util.*;
public class MapMain {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//key-Value 기반 데이터 저장
		map.put(45,"Brown");            //45---int에서 Integer로 오토박싱
		map.put(37,"James");
		map.put(23,"Martin");
		map.put(7,"john");
		map.put(2,"Lee");
		
		//데이터 탐색
		System.out.println("23번 : " + map.get(23));
		System.out.println("37번 : " + map.get(37));
		System.out.println("45번 : " + map.get(45));
		
		//데이터 삭제
		map.remove(37);

		
		//데이터 삭제 확인
		System.out.println("37번 : " + map.get(37));
		
		Set<Integer> ks = map.keySet();
		
		for(Integer n : ks) 
			System.out.print(n.toString()+" ");
		
		
		for(Integer n : ks) 
			System.out.print(map.get(n)+" ");
		System.out.println();

		
			
	}

}
