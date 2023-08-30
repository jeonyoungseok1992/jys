package employee;

import java.util.Scanner;

public class EmployeeMenu {
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호를 누르세요");
			int num = sc.nextInt();
			switch(num) {
				case 1 :{
					this.inserEmp();
				}break;
				case 2 :{
					this.updateEmp();
				}break;
				case 3 :{
					this.deleteEmp();					
				}break;
				case 4 :{
					this.printEmp();
					
				}break;
				case 9 :{
					
				}return;
				default :
					System.out.println("번호를 잘 못 입력함");
				
			}
		}
		
	}
	
	public void inserEmp() {
		System.out.println("사원 번호 : ");
		int num = sc.nextInt();
		System.out.println("사원 이름 : ");
		String name = sc.next();
		System.out.println("사원 성별 : ");
		char gender = sc.next().charAt(0);
		System.out.println("전화 번호 : ");
		sc.nextLine();
		String number = sc.nextLine();
		ec.add(num, name, gender, number);
		System.out.println("추가 정보를 더 입력하시겠습니까?");
		char ch = sc.next().charAt(0);
			if(ch == 'y') {
				System.out.println("사원 부서 : ");
				String dept = sc.next();
				System.out.println("사원 연봉 : ");
				int salary = sc.nextInt();
				System.out.println("보너스 율 : ");
				double bonus = sc.nextDouble();
				ec.add(num, name, gender, number, dept, salary, bonus );
			}else 
				 ec.add(num, name, gender, number);
				      
	}
	public void updateEmp() {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.println("메뉴 번호를 누르세요");
		while(true) {
			int num = sc.nextInt();
			if (num == 1) {
				System.out.print("수정할 번호 : ");
				String str = sc.next();
				ec.modify(str);
				break;
				
			}
			else if (num == 2) {
				System.out.print("수정할 연봉 : ");
				int numbr = sc.nextInt();
				ec.modify(numbr);
				break;
				
			}
			else if (num == 3) {
				System.out.print("수정할 보너스율 : ");
				double bonus = sc.nextDouble();
				ec.modify(bonus);
				break;
			}
			else if(num == 9) {
				System.out.println("메뉴로 돌아갑니다");
				return;
				
			}
			else
				System.out.println("올바른 번호를 입력해주세요");
		
		}
	}
	public void deleteEmp() {
		System.out.println("정말 삭제하시겠습니까");
		char ch =sc.next().charAt(0);
		if(ch == 'y')	
			ec.remove();
		else
			return;
		
		
	}
	public void printEmp() {
		
		if (ec.inform() != null) {
			System.out.println(ec.inform());
		}
		else
			System.out.println("출력 할 데이터가 없습니다");
		
}
}