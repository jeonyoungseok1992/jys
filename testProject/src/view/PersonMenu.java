package view;
import java.util.*;
import model.Student;
import model.Employee;
import controller.PersonController;
public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다");
		System.out.println("현재 저장된 학생은 "+pc.personCount()[0]+"명입니다");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다");
		System.out.println("현재 저장된 학생은 "+pc.personCount()[1]+"명입니다");
		while(true) {
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.println("메뉴번호 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1 :{
				this.studentMenu();
			}break;
			case 2 :{
				this.employeeMenu();
			}break;
			case 9 :{
				
			}return;
			default :
				System.out.println("번호를 잘 못 입력함");
			
			}
		}
	}
	
	public void studentMenu() {
		while(true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.println("메뉴번호 : ");
			int num = sc.nextInt();
			if(pc.personCount()[0] == 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다");
			}
			else {
				switch(num) {
				case 1 :{
					while(true) {
						
						System.out.println("학생 이름 : ");
						String name = sc.next();
						System.out.println("학생 나이 : ");
						int age = sc.nextInt();
						System.out.println("학생 키 : ");
						double height = sc.nextDouble();
						System.out.println("학생 몸무게 : ");
						double weight = sc.nextDouble();
						System.out.println("학생 학년 : ");
						int grade = sc.nextInt();
						System.out.println("학생 전공 : ");
						String major = sc.next();		
						pc.insertStudent(name, age, height, weight, grade, major); 
						if(pc.personCount()[0] == 3) {
							System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다");
							break;
						}
						System.out.println("그만하시려면 n또는 N, 이어하시려면 아무 키나 누르세요");
						char ch = sc.next().charAt(0);
						if (ch == 'n' || ch == 'N') 
							break;
					
					}
					}
						
				}break;
				case 2 :{
					 Student[] students = pc.PrintStudent();
		                for (Student st : students) {
		                    if (st != null) {
		                        System.out.println(st.getName() + ", " +
		                        		st.getAge() + ", " +
		                        		st.getHeight() + ", " +
		                        		st.getWeight() + ", " +
		                        		st.getGrade() + ", " +
		                                st.getMajor());
		                    }
		                }
					
				}break;
				case 9 :{
					
				}return;
				default :
					System.out.println("번호를 잘 못 입력함");
				
				}
		}
		
	
}	
	public void employeeMenu() {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		System.out.println("메뉴번호 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 :{
			
			if(pc.personCount()[1] == 3) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다");
				return;
			}
			System.out.println("사원 이름");
			String name = sc.next();
			System.out.println("사원 나이");
			int age = sc.nextInt();
			System.out.println("사원 키");
			double height = sc.nextDouble();
			System.out.println("사원 몸무게");
			double weight = sc.nextDouble();
			System.out.println("사원 급여");
			int salary = sc.nextInt();
			System.out.println("사원 부서");
			String dept = sc.next();
			while(true) {
				System.out.println("그만하시려면 n또는 N, 이어하시려면 아무 키나 누르세요");
				char ch = sc.next().charAt(0);
				if (ch == 'n' || ch == 'N')
					break;
				else {
					pc.insertEmployee(name, age, height, weight, salary, dept);
				}
				
			}
				
			
		}break;
		case 2 :{
			Employee[] Emplo = pc.PrintEmployee();
			for(Employee Emp : Emplo ){
			     if (Emp != null) {
                     System.out.println(Emp.getName() + ", " +
                    		 Emp.getAge() + ", " +
                    		 Emp.getHeight() + ", " +
                    		 Emp.getWeight() + ", " +
                    		 Emp.getSalary() + ", " +
                    		 Emp.getDept());
                 }
			}
		}break;
		case 9 :{
			
		}return;
		default :
			System.out.println("번호를 잘 못 입력함");
		
		}
		
	}
		
		
	
		

}
	


