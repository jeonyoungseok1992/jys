package snack;

public class SnackController {
	  private Snack s = new Snack();

	  

	    public String saveData(String kind, String name, String flavor, int numOf, int price) {
	        s = new Snack(kind, name, flavor, numOf, price);
	        return "저장 완료되었습니다.";
	    }

	    public String confirmData() {
	        return s.information();
	    }
}
//클래스의 인스턴스가 만들어질 때 본 클래스에 넘겨주는 정보에 따라 그에 맞는 본 클래스의 생성자에 정보가 저장되어 넘겨진다