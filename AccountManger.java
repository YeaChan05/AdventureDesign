import java.util.ArrayList;
import java.util.List;

public class AccountManger {
	// 유저의 account 저장하는 리스트 
	private List<Account> accounts = new ArrayList<>();
	
	public List<Account> getAccounts(){
		return this.accounts;
	}
	
	// 유저 계정 추가 
	public boolean addAccount(Account account) {
		return accounts.add(account);
	}
	
	// 유저 계정 삭제 
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	
	// id 있는지 없는지 찾아냄 
	public Account findById(String id) {
		if(accounts.size() == 0) {
			return null;
		}
		else {
			for(Account account: accounts) {
				if(account.getId().equals(id)) {
	                return account;
	            }
			}
		}
		return null;
	}
	
	public boolean checkSignUpInput(String id,String pw, String pw2,String name) {
		if (id.isEmpty() ||pw.isEmpty() || pw2.isEmpty() ||  name.isEmpty()) {
			System.out.println("공백을 입력하지마세요.");
			return false;
		}
		if (!pw.equals(pw2)) {
            System.out.println("비밀번호를 확인해주세요.");
            return false;
        }
		if (isDuplicatedAccount(id)) {
	        System.out.println("중복된 ID입니다.");
	        return false;
	    }
		
		return true;
	}
	
	public boolean checkSignInInput(String id, String pw) {
		if(id.isEmpty() || pw.isEmpty()) {
			System.out.println("공백을 입력하지 마세여.");
			return false;
		}
		return true;
	}
	
	// 중복 id가 있는지 찾아냄 
	public boolean isDuplicatedAccount(String id) {
		for(Account account : accounts) {
			if(account.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	
	
}
