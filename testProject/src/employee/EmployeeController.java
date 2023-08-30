package employee;
import java.util.*;
public class EmployeeController {
	
	Employee e = new Employee();
	
	public void add(int empNO, String name, char gender, String phone) {
		e = new Employee(empNO, name, gender, phone );
	
	
	}
	
	public void add(int empNO, String name, char gender, String phone, String dept, int salary, double bonus) {
		e = new Employee(empNO, name, gender, phone, dept, salary, bonus );
}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	}
	
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	public Employee remove() {
		e = null;
		return e;
	}
	public String inform() {
		if (e != null)
			return e.printEmployee();
		else
			return null;
	}
	





}