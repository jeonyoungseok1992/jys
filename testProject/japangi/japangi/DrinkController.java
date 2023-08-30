package japangi;

public class DrinkController implements DrinkInterface {
	private final int SIZE = 3;
	Drink[] D = new Drink[SIZE]; 
	
	public void insertDrink(String name, int price, String company) {
		for(int i = 0 ; i < D.length ; i++) {
			if(D[i] == null) {
				D[i] = new Drink(name, price, company);
			
				System.out.println("등록 완료");
				return;		
			}
		}
		System.out.println("더 이상 추가할 수 없습니다");
	}
		
	
	public Boolean checkDrink(String name, String company) {
		Boolean isTrue = true;
		for(Drink dr : D) {
			if(dr != null && dr.getName().equals(name) && dr.getCompany().equals(company)) {				
				System.out.println("등록 되어 있는 음료수입니다");
				isTrue = true;
				
			}
			else {
				isTrue = false;
				
			}
				
		}return isTrue;
	}
	
	public void countDrink(String name, String company, int count) {
		for(Drink dr : D) {
			if(dr != null && dr.getName().equals(name) && dr.getCompany().equals(company)) 	{			
				dr.setCount(count);
				System.out.println(dr.inform());
			}
				
	}
	
	}
	public void inputDrink(int count) {
		
		
		
		
	}
	
	public void deleteDrink() {
		
	}
	

}
