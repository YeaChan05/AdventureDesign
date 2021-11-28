import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Account {
	private String id; // 아이디 
	private String pw; // 패스워드 
	private int jewel =0; // 환생하면 얻을수 있는 재화 
	private Character lastUsedCharacter;
	private List<Character> list = new ArrayList<>();
	private List<Account> users = new ArrayList<>();
	private File file = new File("C:\\Programming\\EngineerMaker\\resources\\account.txt");	
	Scanner in = new Scanner(System.in);
	 
	public Account() {}

	public String isId() {
		return this.id;
	}
	
	public String isPw() {
		return this.pw;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setJewel(int jewel) {
		this.jewel = jewel;
	}

	//파일을 열어 찾는 계정이 있는지 확인
	public boolean checkAccountFile(String id, String password) throws IOException {
		FileReader filereader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(filereader);	
		String str;
		String account = id + "/" + password;
		while((str =bufReader.readLine()) != null) {
			if (str.equals(account)) {
				System.out.print(account);
				return true;
			} else {
				continue;
			}
		}
		bufReader.close();
		return false;
		
	}

	//txt파일에 접근하여 추가할 계정 정보를 추가할
	public void creatAccount(String id, String password) throws IOException {
		String newAccount =id + "/" + password+"\n";
		BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
		writer.append(newAccount);
    	writer.close();
	}
}	