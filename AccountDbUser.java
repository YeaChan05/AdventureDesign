public class AccountDbUser {
	private AccountDb db = new AccountDb();
	
	// 새로운 계정 만들기 
	public void setDbUser(String id, String password, String name) {
		db.setUser(id, password, name);
	}
	
	// 유저 정보와 대조한뒤 로그인 하기 
	public void getDbUser(String id, String password) {
		if(db.check(id, password)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
	
	public void getDb() {
		System.out.println("==========DB출력===========");
		System.out.println(db);
	}
	
}
