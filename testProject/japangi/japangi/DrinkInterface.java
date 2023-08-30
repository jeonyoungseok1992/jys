package japangi;

interface DrinkInterface {
	
	abstract void insertDrink(String name, int price, String company);
	
	Boolean checkDrink(String name, String company);
	
	void countDrink(String name, String company, int count);
	
	void inputDrink(int count);
	
	void deleteDrink();
	
	
	
	

}
