package controller;
import model.Student;
import model.Employee;

public class PersonController {
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];


	
	
    public int[] personCount() {
        int[] counts = new int[2]; // 학생과 사원 객체 수를 담을 배열

        // 학생 배열의 객체 수 계산
        int studentCount = 0;
        for (Student student : s) {
            if (student != null) {
                studentCount++;
            }
        }
        counts[0] = studentCount;

        // 사원 배열의 객체 수 계산
        int employeeCount = 0;
        for (Employee employee : e) {
            if (employee != null) {
                employeeCount++;
            }
        }
        counts[1] = employeeCount;

        return counts; // 학생과 사원 객체 수를 담은 배열 반환
    }

	public void insertStudent(String name, int age, double height, double weight
			, int grade, String major) {		
			System.out.println();
			for (int i = 0; i < s.length; i++) {
				if (s[i] == null) {
					s[i] = new Student();
					s[i].setName(name);
					s[i].setAge(age);
					s[i].setHeight(height);
					s[i].setWeight(weight);
					s[i].setGrade(grade);
					s[i].setMajor(major);
					break;
				}				
				else if(i == s.length-1) {
					System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다");
					break;
				}
			
		}	
}
	
	public Student[] PrintStudent() {			
		
		return s;
		
	}
	
	public void insertEmployee(String name, int age, double height, double weight,
			 int salary, String dept) {
		while(true) {
			for (int i = 0; i < e.length; i++) {
				if (e[i] == null) {
					e[i] = new Employee();
					e[i].setName(name);
					e[i].setAge(age);
					e[i].setHeight(height);
					e[i].setWeight(weight);
					e[i].setSalary(salary);
					e[i].setDept(dept);
					break;
				}
				else if(i ==e.length-1) {
					System.out.println("더 이상 추가 할 수 없습니다");
					break;
				}
			}
		}	
		
	}

	public Employee[] PrintEmployee() {
		return e;
	}



}