import java.util.Scanner;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Account {
	private String id; // 아이디 
	private String pw; // 패스워드 
	private String name; // 회원가입때 필요한 사용자 이름 
	private int jewel =0; // 환생하면 얻을수 있는 재화 
	private Character lastUsedCharacter;
	private List<Character> list = new ArrayList<>();
	private List<Account> users = new ArrayList<>();
	private boolean loginSuccess = false;
	 
	Scanner in = new Scanner(System.in);

	public Account() {
		
	}
	 
	public Account(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		
	}
	
	public String isId() {
		return this.id;
	}
	
	public String isPw() {
		return this.pw;
	}
	
	public String isName() {
		return this.name;
	}

	public boolean isLoginSuccess() {
		return loginSuccess;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setJewel(int jewel) {
		this.jewel = jewel;
	}

	public void setLoginSuccess(boolean loginSuccess) {
		this.loginSuccess = loginSuccess;
	}
	
	// 캐릭터가 있는지 없는지 찾는 함수 
	public void checkCharacter() {
		if(list.isEmpty()) {
			System.out.println("캐릭터가 없습니다. 생성하여 주세요");
			createCharacter();
		} else {
			lastUsedCharacter = list.get(list.size()-1);
		}
	
	}
	
	// 캐릭터를 생성하는 함수 
	public void createCharacter() {
		String cname;
		
		cname = Main.getStrInput("캐릭터의 이름을 입력해주세요.");
		
		// 캐릭터의 이름, 성별 
		list.add(new Character(cname, true));
		
	}

}
