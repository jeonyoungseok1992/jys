package testProject;

public class MainStart {
	public static void main(String[] args) {
//		BankAccountPO jeon = new BankAccountPO();
		BankAccountPO yoon = new BankAccountPO(0);
//		BankAccountPO choi = new BankAccountPO(2000, "영석");
		BankAccountPO kim = yoon;
		yoon.deposit(500);
		kim.deposit(300);
		
		kim.checkMybalance();
	}
}


//생성자--초기값을 세팅해주는 역할

//protected는 다 되는데 패키지가 다르면 안됨 다만, 패키지가 달라도 상속받은 경우엔 가능함.

//static-----한번 만들어 놓고 공유한다