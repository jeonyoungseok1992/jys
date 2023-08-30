package model;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight
			, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}

	public String getMajor() {
		return major;
	}
	
	public String toStirng() {
		return super.toString() +grade+major;
	}
	

}
