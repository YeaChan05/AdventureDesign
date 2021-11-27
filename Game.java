import java.util.Scanner;


public class Game {
	Scanner in = new Scanner(System.in);
	private AccountManger am = new AccountManger();
	/*
	App app = new App();

    while (true) {
        while (true) {
            // 게임 시작, 회원가입, 로그인, (게임 종료)
            app.initStage();
        }
        while (true) {
            // 캐릭터 생성, 캐릭터 선택, (게임 종료)
            app.characterStage();
        }
        while (true) {
            // 게임중, (게임 종료)
            app.gameStage();
        }
    }
    */
	// 게임시작, 회원가입, 로그인, (게임 종료)
	public void initStage() {
    	System.out.println(am.getAccounts());
    	// 초기유저를 선언 (./init/data/accounts.txt 에서 읽어오기)
    	
    	
		System.out.println("-----------공대생 게임 키우기---------");
		System.out.println("1. 회원가입  2. 로그인  3. 게임종료");
		
		int choice = in.nextInt();
		if(choice == 1) {
			String id = Main.getStrInput("Id :");
	    	String password = Main.getStrInput("Password :");
	    	String password2 = Main.getStrInput("Password2 :");
	    	String name = Main.getStrInput("Name :");
	    	// Sign-up
	    	if (am.checkSignUpInput(id, password, password2, name)){
	    		am.addAccount(new Account(id, password, name));
	    	}
		}
		else if (choice == 2) {
			String id = Main.getStrInput("Id :");
	    	String password = Main.getStrInput("Password :");
	    	// Sign-In 
	    	Account currentAccount;
	    	if(am.checkSignInInput(id, password)) {
	    		currentAccount = am.findById(id);
	    		if(currentAccount == null) {
	    			System.out.println("등록되지 않은 사용자입니다.");
	    		} else {
	    			if(currentAccount.getPw().equals(password)) {
		    			System.out.println(currentAccount.getId() + "님께서 로그인 하셨습니다.");
		                System.out.println("공대생 키우기 게임을 시작합니다.");
		    		} else {
		    			 System.out.println("비밀번호가 틀렸습니다.");
		    		}
	    		}
	    	}
	    	
		} else if(choice ==3) {
			System.out.println("게임종료");
			
		} else {
			System.out.println("잘못입력했습니다.");
		}
    	
		
	}
	
	// 캐릭터 생성, 캐릭터 선택, (게임종료) 
	public void characterStage() {
		
	}
	
	// 게임중, (게임종료)
	public void gameStage() {
		
	}
}
