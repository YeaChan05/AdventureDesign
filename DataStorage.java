import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataStorage {
	File file = new File("C:\\Programming\\EngineerMaker\\resources\\account.txt");	

	public void openAccountFile(String id, String password) throws IOException {
		FileReader filereader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(filereader);
		
		String str;
		String account = id + "/" + password;
		while((str =bufReader.readLine()) != null) {
			if (str.equals(account)) {
				System.out.print(account);
				break;
			} else {
				continue;
			}
		}
		bufReader.close();
		
	}
}
