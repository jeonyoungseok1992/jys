package employee;

public class Employee {
	private int empNO;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	public Employee() {
		
	}
	
	public Employee(int empNO, String name, char gender, String phone) {
			this.empNO = empNO;
			this.name = name;
			this.gender = gender;
			this.phone = phone;
		
	}
	public Employee(int empNO, String name, char gender, String phone, String dept, int salary, double bonus ) {
			this.empNO = empNO;
			this.name = name;
			this.gender = gender;
			this.phone = phone;
			this.dept = dept;
			this.salary = salary;
			this.bonus = bonus;
		
	}
	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNO() {
		return empNO;
	}
	public String getName() {
		return name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getBonus() {
		return bonus;
	}
	public String printEmployee() {
		if(dept == null)
			return empNO+" "+name+" "+gender+" "+phone;
		else
			return empNO+" "+name+" "+gender+" "+phone+" "+dept+" "+salary+" "+bonus;
	}

		
		
	
}
