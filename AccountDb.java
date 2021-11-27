import java.util.ArrayList;
public class AccountDb {
	
	private static ArrayList<String[]> userData = new ArrayList<>();
	
	// 유저 생성 
	public void setUser(String id, String password) {
		String[] temp = { id, password};
		userData.add(temp);
	}
	
	// 들어온 id 와 비밀번호가 일치하는지 체크 
	public boolean check(String id, String password) {
		for(int i=0; i< userData.size(); i++) {
			if(id.equals(userData.get(i)[0])) {
				if(password.equals(userData.get(i)[1])) {
					return true;
				}
			}
		}
		return false;
	}
	
	// 개발자가 계정을 보기위한 관리 
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(String[] temp : userData) {
			sb.append("ID : " +temp[0] + "\tPassword : " + temp[1] + "\tName : "+ temp[2]).append("\n\n");
		}
		return sb.toString();
	}
}
