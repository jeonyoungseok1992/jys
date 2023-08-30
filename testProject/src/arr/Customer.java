package arr;

public class Customer {
	 // 필드
    private String name;
    private String id;
    private String password;
    private String email;
    
    // 모든 데이터를 초기화하는 생성자
    public Customer(String name, String id, String password, String email) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
    }
    
    // 값들을 가지고 오는 getter 메서드들
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    
    // 값들을 넣어주는 setter 메서드들
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    // 정보를 반환해주는 toString 메서드
    @Override
    public String toString() {
    	String str =  this.name + "\t" + this.id + "\t" + 
    			    this.password+ "\t" + this.email; 
        return str;
    }
    
    public boolean equals(String id, String password) {
    	return ( this.id.equals(id) && this.password.equals(password));
    }
    
    public boolean idCheck(String id) {
    	return (this.id.equals(id));
    }
    
    public boolean passwordCheck(String password) {
    	return (this.password.equals(password));
    }
    
}
