package member;

public class MemberController {
	int SIZE = 10;
	Member[] m = new Member[SIZE];
	
	public int exisMemberNum() {
		int count = 0;
		for(int i = 0 ; i < m.length; i++) {
			if(m[i] == null)			
				return i;
			else
				count++;
		}
			return count;
	}
	
	public boolean checkId(String inputId) {
		for(int i = 0 ; i < m.length; i++) {
			if(m[i].getId().equals(inputId))
				return true;
			else
				return false;
	}
		
	
	
	
	
	
	
	
			
}
