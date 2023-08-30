package collection;
import java.io.*;
import java.util.*;
public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("강아지");
		list.add("고양이");
		list.add("송아지");
		System.out.println(list.get(2));
		System.out.println(list);
		System.out.println();
		System.out.println(list.get(1));
		System.out.println();
		int num = 1;
		String str = "망아지";
		list.add(num, str);
		System.out.println(list);
		System.out.println();
		list.set(0, "병아리");
		System.out.println(list);
//		System.out.println(list.size());
//		list.remove(0);
//		System.out.println(list);
//		list.remove("고양이");	
//		System.out.println(list);
		if(list.isEmpty())
			System.out.println("비어있음");
		else
			System.out.println("차있음");
		if(list.contains("망아지"))
			System.out.println("있음");
		else
			System.out.println("없음");
		
		
	}

}
