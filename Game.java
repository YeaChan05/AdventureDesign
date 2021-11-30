// import java.util.Scanner;


// public class Game {
// 	Scanner in = new Scanner(System.in);
// 	private AccountManger am = new AccountManger();
// 	/*
// 	App app = new App();

//     while (true) {
//         while (true) {
//             // 게임 시작, 회원가입, 로그인, (게임 종료)
//             app.initStage();
//         }
//         while (true) {
//             // 캐릭터 생성, 캐릭터 선택, (게임 종료)
//             app.characterStage();
//         }
//         while (true) {
//             // 게임중, (게임 종료)
//             app.gameStage();
//         }
//     }
//     */
// 	// 게임시작, 회원가입, 로그인, (게임 종료)
// 	public void initStage() {
//     	System.out.println(am.getAccounts());
    	
    
// 		System.out.println("-----------공대생 게임 키우기---------");
// 		System.out.println("1. 회원가입  2. 로그인  3. 게임종료");
		
// 		int choice = in.nextInt();
// 		if(choice == 1) {
// 			String id = Main.getStrInput("Id :");
// 	    	String password = Main.getStrInput("Password :");
// 	    	// Sign-up
// 	    	if (am.checkSignUpInput(id, password)){
// 	    		am.addAccount(new Account(id, password));
// 	    		// 파일에다가 1줄 바로 저장 
// 	    	}
// 		}
// 		else if (choice == 2) {
// 			String id = Main.getStrInput("Id :");
// 	    	String password = Main.getStrInput("Password :");
// 	    	// Sign-In 
// 	    	Account currentAccount;
// 	    	if(am.checkSignInInput(id, password)) {
// 	    		currentAccount = am.findById(id);
// 	    		if(currentAccount == null) {
// 	    			System.out.println("등록되지 않은 사용자입니다.");
// 	    		} else {
// 	    			if(currentAccount.isPw().equals(password)) {
// 		    			System.out.println(currentAccount.isId() + "님께서 로그인 하셨습니다.");
// 		                System.out.println("공대생 키우기 게임을 시작합니다.");
// 		    		} else {
// 		    			 System.out.println("비밀번호가 틀렸습니다.");
// 		    		}
// 	    		}
// 	    	}
	    	
// 		} else if(choice ==3) {
// 			System.out.println("게임종료");
			
// 		} else {
// 			System.out.println("잘못입력했습니다.");
// 		}
    	
		
// 	}
	
// 	// 캐릭터 생성, 캐릭터 선택, (게임종료) 
// 	public void characterStage() {
		
// 	}
	
// 	// 게임중, (게임종료)
// 	public void gameStage() {
		
// 	}
	
	
// 	// GUI 이벤트 핸들러 구현 
// 	// 계정 생성 
// 	public void setUser(String newId, String newPw) {
// 		// Sign-up
//     	if (am.checkSignUpInput(newId, newPw)){
//     		am.addAccount(new Account(newId, newPw));
    		
//     	}
// 	}
	
// 	// 로그인 
// 	public void check(String id_text, String pw_text) {
// 		Account currentAccount;
//     	if(am.checkSignInInput(id_text, pw_text)) {
//     		currentAccount = am.findById(id_text);
//     		if(currentAccount == null) {
//     			// 등록된 아이디가 없다. 
//     		} else {
//     			if(currentAccount.isPw().equals(pw_text)) {
// 	    			// 로그인 성공  
// 	    		} else {
// 	    			// 비밀번호 틀림 
// 	    		}
//     		}
//     	}
// 	}
// }
