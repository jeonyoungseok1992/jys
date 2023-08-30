package day0809;

class Man {
	private String name = "동건";    //private로 하면 "영석"저장 안됨	
	public Man() {
		
		System.out.println("Man 기본생성");
		
	}
	
	public Man(String name) {
		this.name = name;
		System.out.println(name+"넘겨받아 생성");
	}
	
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
	
	
}
