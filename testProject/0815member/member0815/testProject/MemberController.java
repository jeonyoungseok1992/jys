package member0815.testProject;

public class MemberController {
	int SIZE = 3;
	Member[] m = new Member[SIZE];
	int count = 0;
	
	public int existMember() {
		
		return count;
	}
	
	public boolean checkID(String inputId) {
		boolean checkid = true;

		for(Member mem : m){
			if(mem !=null && mem.getId().equals(inputId)) {
				
				checkid = true;
				
				break;
			}
			else
				checkid = false;
		}
		
		return checkid;
			
		
	}
	
	public void insertMember(String id, String name, String password, String email,  char gender, int age) {
		if(this.checkID(id)) {			
			return;
		}
		
		else if(this.existMember() < m.length) {
			m[this.existMember()] =new Member(id, name, password, email, gender, age);
			count++;
						
		}
			
	}
	
	public String searchId(String id) {	
		int i = 0;
		for(i = 0 ; i < m.length ; i++) {
			if(m[i].getId().equals(id)) {
				break;
			}
		}
		return m[i].inform();		
}
	public String searchName(String name) {
		int i = 0;
		for(i = 0 ; i < m.length ; i++) {
			if(m[i].getName().equals(name)) {
				System.out.println("찾으신 회원 조회 결과입니다");	
				break;
			}
		}
		return m[i].inform();		
}
	public String searchEmail(String email) {
		int i = 0;
		for(i = 0 ; i < m.length ; i++) {
			if(m[i].getEmail().equals(email)) {
				System.out.println("찾으신 회원 조회 결과입니다");	
				break;
			}
		}
		return m[i].inform();		
}
	
	public boolean updatePassword(String id,String password) {
		boolean isTrue = true;
		int i = 0;
		for(i = 0 ; i < m.length ; i++) {
			if(m[i] !=null && m[i].getId().equals(id)) {			
				isTrue = true;
				m[i].setEmail(password);
				break;
			}
			else {
				isTrue = false;
				
		}
	}
		return isTrue;
		}	
	
	public boolean updateName(String id,String name) {
		boolean isTrue = true;
		int i = 0;
		for(i = 0 ; i < m.length ; i++) {
			if(m[i] !=null && m[i].getId().equals(id)) {			
				isTrue = true;
				m[i].setEmail(name);
				break;
			}
			else {
				isTrue = false;
				
		}
	}
		return isTrue;
		}
	public boolean updateEmail(String id,String email) {
		boolean isTrue = true;
		int i = 0;
		for(i = 0 ; i < m.length ; i++) {
			if(m[i] !=null && m[i].getId().equals(id)) {			
				isTrue = true;
				m[i].setEmail(email);
				break;
			}
			else {
				isTrue = false;
				
		}
	}
		return isTrue;
		}
				
	
	public boolean delete(String id) {
		boolean isTrue = true;
		int i = 0;
		for(i = 0 ; i < m.length ; i++) {
			if(m[i].getId().equals(id)) {
				System.out.println("성공적으로 삭제하였습니다");
				count--;
				m[i] = null;
				break;
			}
		}
		return isTrue;	
	}
	
	public void delete() {
		m = null;
	}
	
	public Member[] printAll() {
		return m;
	}
	
	
	
}