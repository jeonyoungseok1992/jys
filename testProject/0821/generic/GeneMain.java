package generic;

public class GeneMain {
	public static void main(String[] args) {
		Dbox<String, Integer> box = new Dbox<>();
		box.set("Apple", 25);
		System.out.println(box);
		
	}

}
