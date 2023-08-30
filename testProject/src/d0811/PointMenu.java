package d0811;
import java.util.*;
public class PointMenu {
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("====메뉴=====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		if(num == 1) {
			circleMenu();
			
			
		}
		else if(num ==2) {
			rectangleMenu();
			
		}else
			break;
		}
		
	}
	public void circleMenu() {
		while(true) {
		System.out.println("====원 메뉴=====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		if(num == 1) {
			calcCircum();
			break;
		}
		else if(num ==2) {
			calcCircleArea();
			break;
		}else
			break;
		}
		
	}
	public void rectangleMenu() {
		while(true) {
		System.out.println("====사각형 메뉴=====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		if(num == 1) {
			calcPerimeter();
			break;
		}
		else if(num ==2) {
			calcRecArea();
			break;
		}else
			break;
		}
		
	}
	public void calcCircum() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, radius));
	}
	public void calcCircleArea() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
	}
	public void calcRecArea() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("높이 : ");
		int height = sc.nextInt();
		System.out.println("넓이 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcArea(x, y, width, height));
	}
	public void calcPerimeter() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		System.out.println("높이 : ");
		int height = sc.nextInt();
		System.out.println("넓이 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcimeter(x, y, width, height));
	}
	
	
}
