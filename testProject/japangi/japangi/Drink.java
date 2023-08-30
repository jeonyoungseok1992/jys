package japangi;

public class Drink extends Ddrink {
	private String name;
	private int price;
	private int count;
	
	public Drink() {
		
	}
	
	public Drink(String name, int price, String company) {
		super(company);
		this.name = name;
		this.price = price;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return this.count;
	}
	
	
	public String inform() {
		return this.company +" "+name +" "+ price+"원 "+count+"개";
	}
	
	
	
	

}
