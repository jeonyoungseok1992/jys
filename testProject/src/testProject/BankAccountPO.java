package testProject;

public class BankAccountPO {	
	int balance = 0;
	String name;
	
	public BankAccountPO() {		       //기본 생성자(다른 생성자가 없으면 자동으로 만들어진다)
	}
	
	public BankAccountPO(int money) {
		balance = money;
	}
	public BankAccountPO(int money, String n) {
		balance = money;
		name = n;
	}

 
 	public int deposit(int amount) {
 		balance += amount;
 		return balance;
 	}
 	public int withdraw(int amount) {
 		balance -= amount;
 		return balance;
 	}
 	public int checkMybalance() {
 		System.out.println("잔액 : " + balance);
 		System.out.println("성함 : " + name);
 		
 		return balance;
 	}	
}
