package test;
import java.util.*;
public class TestMain1 {
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num > 10)
			System.out.println("10 초과");
		else if(num <= 10)
			System.out.println("10 이하");
		for(int i = 1; i <= num; i++) {
			System.out.println(1000-i);
		}
		
		int[] arr = new int[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num;
			System.out.println(arr[i]);
		}
		
		Human s = new Student("장건웅",18);
		
		s.makeSound();
		((Student)s).sleep();
		((Student)s).swim();
		
		List<>
		
	}

}
