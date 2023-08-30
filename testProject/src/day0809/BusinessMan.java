package day0809;

class BusinessMan extends Man {
	String company;
	String position;
	
	public BusinessMan() {
		System.out.println("BusinessMan 기본생성");
	}
	
	public BusinessMan(String name, String company, String position) {
		super("수지"); // this.name 도 가능한데 private name 으로 하면 안됨
		this.company = company;
		this.position = position;
		tellYourName();
		
	}
	
	
	
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}

}
