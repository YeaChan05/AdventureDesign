import java.util.Scanner;
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
	 
	Scanner in = new Scanner(System.in);

	public Account() {
		
	}
	 
	public Account(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getPw() {
		return this.pw;
	}
	
	public String getName() {
		return this.name;
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
	
	// 회원가입 
	public void userJoin() {
		in.nextLine();
		String id = getStrInput("Id:");
		String pw = getStrInput("PassWord:");
		String pw2 = getStrInput("PassWord Confirm:");
		String name = getStrInput("Name:");
		
		// 공백이 입력될 경우  
		if(id.isEmpty() || pw.isEmpty()|| pw2.isEmpty() || name.isEmpty())
		{
			System.out.println("공백을 입력하지마세여.");
		} else {
			if(idCheck(id)) {
				System.out.println("중복된 ID입니다.");
			} else if(pw.equals(pw2)) {
				users.add(new Account(id, pw, name));
				System.out.println(id + "님 회원가입을 축하드립니다.");
			} else {
				System.out.println("비밀번호를 확인해주세요.");
			}
		}
		
	}
	

	
	
	// 로그인 
	public void userLogin() {
		in.nextLine();
		String id = getStrInput("Id:");
		String pw = getStrInput("PassWord:");
		
		Account user = FindById(id);
		if(id.isEmpty() || pw.isEmpty())
		{
			System.out.println("공백을 입력하지마세여.");
		} else {
			if (user == null) {
				System.out.println("등록되지 않은사용자입니다.");
			} else if(user.getPw().equals(pw)) {
				System.out.println(user.getId() + "님께서 로그인 하셨습니다.");
				System.out.println("공대생 키우기 게임을 시작합니다.");
				
				
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		
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
	
	//id 중복 체크 
		public boolean idCheck(String id) {
	        boolean check = true;
	        Account user = FindById(id);
	        if(user == null)
	            check = false;
	        return check;
	    }
	
	
	
	// user의 id가 있는지 확인 
	public Account FindById(String id) {
        for(Account account : users) {
            if(account.getId().equals(id)) {
                return account;
            }
        }
        return null;
    }
	
	
	public String getStrInput(String msg) {
		System.out.println(msg);
		return in.nextLine();
	}
	
	//로그인과 회원가입 출력  
	public void run() {
		int gamestart =1;
		while(gamestart !=0) {
			System.out.println("---공대생키우기 메뉴선택---");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.게임 종료");
			
			int choice = in.nextInt();
			switch(choice) {
			case 1:
				userJoin();
				break;
			case 2:
				userLogin();
				checkCharacter();
				gamestart = 0;
				break;
			case 3:
				System.out.println("공대생 키우기 게임 종료");
				return;
			}
		}
	}


}
