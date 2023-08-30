package member0815.testProject;
import java.util.Iterator;
import java.util.Scanner;
public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {	
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("최대 등록 가능한 회원 수는 3명입니다");
			System.out.println("현재 등록된 회원 수는 "+mc.existMember()+"명입니다");
			if(mc.existMember() < 3)                   //이거 문장 왜 출력됨?????
				System.out.println("1. 새 회원 등록");
			else
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			switch(num) {
				case 1 :{
					this.insertMember();
				
				}break;
				case 2 :{
					this.searchMember();
				}break;
				case 3 :{
					this.updateMember();
				}break;
				case 4 :{
					this.deleteMember();
					
				}break;
				case 5 :{
					this.printAll();
				}break;
				case 9:{
					System.out.println("종료합니다");
					isTrue = false;
					break;
				}
				default :{
					System.out.println("잘못 입력하셨습니다");
					break;
				}
				}
			}
		
	}
	public void insertMember() {
		char gender;
		System.out.println("새 회원을 등록합니다");
		System.out.print("아이디 : ");
		String id = sc.next();
		if(mc.checkID(id)) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요");
			return;
		}
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		while(true) {
			System.out.print("성별(M/F) : ");
			gender = sc.next().charAt(0);
				if(gender != 'M' && gender != 'F') {
					System.out.println("성별을 다시 입력하세요");
					
				}
				else
					break;
		}
		System.out.print("나이 : ");
		int age = sc.nextInt();
		mc.insertMember(id, name, password, email, gender, age);

	
		
	}
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		switch(num) {
			case 1 :{
				this.searchId();
			}break;
			case 2 :{
				this.searchName();
			}break;
			case 3 :{
				this.updatePassword();
			}break;
			case 9:{
				System.out.println("메인으로 돌아갑니다");
				break;
			}
			default :{
				System.out.println("잘못 입력하셨습니다");
				break;
			}
		}
		
	}
	public void searchId() {	
		System.out.println("검색 할 아이디");
		String id = sc.next();
		if(mc.checkID(id))
			mc.searchId(id);
		else
			System.out.println("존재하지 않는 아이디입니다");
	}
	public void searchName() {
		System.out.println("검색 할 아이디");
		String id = sc.next();
		if(mc.checkID(id))
			mc.searchName(id);
		else
			System.out.println("존재하지 않는 아이디입니다");
		
	}
	public void searchEmail() {
		System.out.println("검색 할 아이디");
		String id = sc.next();
		if(mc.checkID(id))
			mc.searchEmail(id);
		else
			System.out.println("존재하지 않는 아이디입니다");
		
	}
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아하기");
		System.out.println("메뉴번호 : ");
		int num = sc.nextInt();
		switch(num) {
				case 1 :{
					this.updatePassword();
				}break;
				case 2 :{
					this.updateName();
				}break;
				case 3 :{
					this.updateEmail();
				}break;
				case 4 :{
					System.out.println("메인으로 돌아갑니다");
					break;
				}
				default :{
					System.out.println("잘못 입력하셨습니다");
					break;
				}
		}
		
	}
	public void updatePassword() {
		System.out.println("수정할 회원의 아이디");
		String id = sc.next();							
		System.out.println("수정할 비밀번호");
		String password = sc.next();
		if(mc.updatePassword(id, password)) 
			System.out.println("수정이 성공적으로 되었습니다");
		else
			System.out.println("존재하지 않는 아이디입니다");
		
	}
	public void updateName() {
		System.out.println("수정할 회원의 아이디");
		String id = sc.next();							
		System.out.println("수정할 이메일");
		String name = sc.next();
		if(mc.updateName(id, name)) 
			System.out.println("수정이 성공적으로 되었습니다");
		else
			System.out.println("존재하지 않는 아이디입니다");
	}
	public void updateEmail() {
		System.out.println("수정할 회원의 아이디");
		String id = sc.next();							
		System.out.println("수정할 이메일");
		String email = sc.next();
		if(mc.updateEmail(id, email)) 
			System.out.println("수정이 성공적으로 되었습니다");
		else
			System.out.println("존재하지 않는 아이디입니다");
		

			    
		
	}
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아하기");
		System.out.println("메뉴번호 : ");
		int num = sc.nextInt();
		switch(num) {
				case 1 :{
					this.deleteOne();
				}break;
				case 2 :{
					this.deleteAll();
				}break;
				case 9 :{
					System.out.println("메인으로 돌아갑니다");
					break;
				}
				default :{
					System.out.println("잘못 입력하셨습니다");
					break;
				}
		}
		
	}
	public void deleteOne() {
		System.out.println("삭제할 회원의 아이디 : ");
		String id = sc.next();
		System.out.println("정말 삭제하시겠습니까?(y/n)");
		char ch = sc.next().charAt(0);
		if(ch == 'y')
			mc.delete(id);
	}
	public void deleteAll() {
		System.out.println("정말 삭제하시겠습니까?(y/n)");
		char ch = sc.next().charAt(0);
		if(ch == 'y')
			mc.delete();
		
	}
	public void printAll() {
		
		for(Member mem : mc.printAll()){
			if(mem != null)
				System.out.println(mem.inform());
		}
		
	}

}
