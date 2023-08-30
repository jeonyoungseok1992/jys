package phone;

public class GalaxyNote9 extends SmartPhone implements NotePen {
	
	
	public GalaxyNote9() {
		super.setMaker("삼성");
		
	}
	
	public String printInformation() {
		 
		return "갤럭시 \t 블루투스 펜 탑재 여부 : "+this.maker+this.bluetoothPen();
	}
	
	public String charge() {
		return "";
	}
	
	public String picture() {
		return"";
	}
	
	public String makeCall() {
		return "";
	}
	
	public String takeCall() {
		return "";
	}
	
	public String touch() {
		return "";
	}
	
	public  Boolean bluetoothPen() {
		return true;
	}
	

}
