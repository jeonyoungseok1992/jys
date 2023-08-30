package phone;

abstract class SmartPhone implements CellPhone, TouchDisplay {
	protected String maker;
	
	public SmartPhone() {
		
	}
	
	abstract String printInformation();
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		
		return this.maker;
	}
	



}
