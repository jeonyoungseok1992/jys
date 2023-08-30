package phone;

public class V40 extends SmartPhone implements NotePen {
	
	
	public V40() {
		super.setMaker("삼성");
	}
	
	public String printInformation() {
		 
		return "V40 \t 블루투스 펜 탑재 여부 : "+super.maker+this.bluetoothPen();
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
