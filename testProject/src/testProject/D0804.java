package testProject;
import java.util.*;
public class D0804 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
		System.out.println("정수 : ");
		num = sc.nextInt();
		if(num >= 1 && num <= 10) {
			switch(num % 2) {
				case 0:{
					System.out.println("짝수");
				break;
				}
				case 1:{
					System.out.println("홀수");
				break;
				}
				
			}
			return;
		}else
			System.out.println("1~10 사이의 정수를 입력하세요.");
		
		}	
	
	
//	int num;
//	int num1 = 0;
//	num = sc.nextInt();
//	if(num >= 1 && num <= 10)	{
//		for(int i = 0; i < num; i++) {
//		 num1 += 1;
//			System.out.println(num1);
//		}
//		}
		
		
		
//		int[] arr = new int[10];
//		int num = 11;
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] =num + i;
//			System.out.println(arr[i]);
//		}
		
//		변수()---------메서드
//		Circle c(참조변수) = new Circle();
		
		
		
	
	}

}
