package com.kh.javai;
import java.util.Scanner;
public class Customer {

	
		String name, id, password, email;
		
		
		
		
		public Customer(String n, String i, String p, String e) {
			this.name = n;
			this.id = i;
			this.password = p;
			this.email = e;
		}
			
		public void setName(String n) {
			this.name = n;
		}
		public void setId(String i) {
			this.id = i;
		}
		public void setPassword(String p) {
			this.password = p;
		}
		public void setEmail(String e) {
			this.name = e;
		}
		
		public String getName() {
			return name;
		}
		public String getId() {
			return id;
		}		
		public String getPassword() {
			return password;
		}
		public String getEmail() {
			return email;
		}
		
		
		public String toString() {
			String str = "이름\tId\tPassword\tEmail"+
						this.name + this.id+ this.password+this.email;
			return str;
		}
		public boolean equals(String id, String password) {
			return (this.id.equals(id) && this.password.equals(password));
		}
		public boolean idCheck(String id) {
			return (this.id.equals(id));
		}
		public boolean passwordCheck(String password) {
			return (this.password.equals(password));
		}
	//this.메소드 ????????????
		

}
