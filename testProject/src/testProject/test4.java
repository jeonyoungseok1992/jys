package testProject;
import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		int num1, num2, num3, num4 ,num5, num6;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년:");
		num1 = sc.nextInt();
		System.out.print("월:");
		num2 = sc.nextInt();
		System.out.print("일:");
		num3 = sc.nextInt();
		System.out.print("시:");
		num4 = sc.nextInt();
		System.out.print("분:");
		num5 = sc.nextInt();
		System.out.print("초:");
		num6 = sc.nextInt();
		System.out.println("지금은 " +num1+ "년" +num2+ "월");

	}

}
