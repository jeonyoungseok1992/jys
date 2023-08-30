package cake;

public class Main {

	public static void main(String[] args) {
//		CheeseCake ca1 = new CheeseCake();
//		Cake ca2 = ca1;
//		ca2.sweet();
//		((CheeseCake)ca2).milky();
		
		Cake ca1 = new CheeseCake();
		Cake ca2 = ca1;
		ca2.sweet();
		((CheeseCake)ca2).milky();
	

//		Cake ca3 = new CheeseCake();
//		CheeseCake ca4 = ((CheeseCake)ca3);
//		ca3.sweet();
//		ca4.sweet();
//		ca4.milky();
}
}