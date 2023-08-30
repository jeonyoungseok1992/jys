package testProject;
import java.util.*;
public class D0808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		String pwd;
		
		
		System.out.println("아이디 : ");
		id = sc.next();
		System.out.println("비밀번호 : ");
		pwd = sc.next();
		switch(id) {
			case("myId"):{
				switch(pwd) {
					case("myPassword12"):{
						System.out.println("로그인 성공");
					}break;
					default : 
						System.out.println("비밀번호가 틀렸습니다");
				}
			}break;
			default:
				System.out.println("아이디가 틀렸습니다");
		}
		
		
		
		

	}

}
