package com.kh.javai;
import java.util.*;


public class Book {	
	Scanner sc = new Scanner(System.in);
	private String name;
	private String location;
	
	public Book(String name, String location) {
		this.name = name;
		this.location = location;
	}

	
	public void setName(String name) {
		this.name = name;
}
	public void setLocation(String location) {
		this.location = location;
}
	public String getName() {
		return this.name;
}
	public String getLocation() {
		return this.location;
}

	public String viewBook() {
		String str =  this.name + "\t" + this.location + "\t" ;
			    
		return str;
	}
	
	
	
}