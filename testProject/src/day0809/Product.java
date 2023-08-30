package day0809;
import java.util.*;


public class Product {
	private String beverage;
	private int Price;
	private int count;   //재고
	private String description; //상품설명
	
	private final int MAX_COUNT = 50;
	
	
	public Product(String beverage, int price, String description) {
		this.beverage = beverage;
		this.Price = price < 0 ? 0 : price;
		this.count = this.MAX_COUNT;
		this.description = description;
		
	}
	//get , set 메서드 만드는 이유??? 필드값을 private로 했기 때문에 게터세터 메서드를 이용해서 필드값을 사용하기 위함임
	public String getBeverage() {
		return this.beverage;
	}
	public int getPrice() {
		return this.Price;
	}
	public String getDescription() {
		return this.description;
	}
	
	public void setBeverage(String beverage) {
		this.beverage = beverage == null ? "이름없음" : beverage;
	}
	public void setPrice(int price) {
		this.Price = price < 0 ? 0 : price;
	}
	public void setDescription(String description) {
		this.description = description == null ? "-" : description;
	}
	
	public String toStirng() {
		String str = this.beverage + "\t" + this.Price + "\t" + this.description + this.count;
		return str;
	}
	
	public int setcount() {
		return this.count;
	}
//	public void getcount(int count) {
//		this.count += count;
//	}
	
	
}
