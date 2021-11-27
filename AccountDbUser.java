import java.util.ArrayList;
import java.util.List;

public class AccountDbUser {
	private AccountDb db = new AccountDb();
	//private List<Character> clist = new ArrayList<>();
	//private Character lastUsedCharacters;
	
	// 새로운 계정 만들기 
	public void setDbUser(String id, String password, String name) {
		db.setUser(id, password, name);
	}
	
	// 유저 정보와 대조한뒤 로그인 하기 
	public void getDbUser(String id, String password) {
		db.check(id, password);
	}
	
	public void getDb() {
		System.out.println("==========DB출력===========");
		System.out.println(db);
	}
	/*
	public void checkCharacters() {
		if(clist.isEmpty()) {
			System.out.println("캐릭터가 없습니다. 캐릭터를 생성하여 주세요.");
			createCharacters();
		} else {
			lastUsedCharacters =clist.get(clist.size()-1);
		}
	}
	
	// 캐릭터를 생성하는 함수 
	public void createCharacters() {
		String cname;
			
		cname = Main.getStrInput("캐릭터의 이름을 입력해주세요.");
			
		// 캐릭터의 이름, 성별 
		clist.add(new Character(cname, true));
			
	}
	*/
	
}
