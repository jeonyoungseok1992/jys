package inherit;

public class Main {

	public static void main(String[] args) {
		Friend[] fr = new Friend[10];
		int cnt = 0;
		
		fr[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
		fr[cnt++] = new UnivFriend("SEO", "Elec", "010-333-555");
		fr[cnt++] = new CompFriend("Computer" );
		fr[cnt++] = new CompFriend("PARK", "Phone", "010-333-555");
		
		
		for(int i = 0; i < cnt; i++) {		
			fr[i].showInfo();
			
			
			System.out.println();
			
		}
		((UnivFriend)fr[1]).seeinfo();
		fr[0].showInfo();

	}

}
