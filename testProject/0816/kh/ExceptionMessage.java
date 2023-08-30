package kh;

public class ExceptionMessage {
	public static void md1(int n) {
		md2(n, 0);
	}
	
	public static int md2(int n1, int n2) {
		int r = n1 / n2;
		
		return r;
	}

	public static void main(String[] args) {
		try {
		md1(3);
		System.out.println(md2(3,3));
		System.out.println("안녕");
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("안녕");
		
	}

}
