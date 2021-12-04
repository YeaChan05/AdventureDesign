import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.util.HashMap;
public class GameData {
    private String filepath;
    private HashMap<String, String> map;
    private Character character;
    private BufferedReader br;
    private BufferedWriter bw;
    public GameData(String filepath) throws IOException{
        this.filepath = filepath;
        this.map = new HashMap<String, String>();
        this.character=new Character();
        this.br = new BufferedReader(new FileReader(filepath));
        this.bw= new BufferedWriter(new FileWriter(this.filepath));
    }

    public void mkfile() throws IOException{
        bw=new BufferedWriter(new FileWriter(this.filepath));
    }

    public void writefile() throws IOException{
        
        bw.write("health,"+this.character.getHealth());
        bw.newLine();

        bw.write("activeness,"+this.character.getActiveness());
        bw.newLine();

        bw.write("interest,"+this.character.getIntelligence());
        bw.newLine();

        bw.write("money,"+this.character.getMoney());
        bw.newLine();

        bw.write("intelligence,"+this.character.getIntelligence());
        bw.newLine();

        bw.write("period ,"+this.character.getPeriod().length);
        bw.newLine();

        bw.write("lectureCount,"+this.character.getlectureCount());
        bw.newLine();

        bw.write("electionFlag,"+this.character.getElectionFlag());
        bw.flush();
        bw.close();
        System.out.println("writefile!!");
    }

    public void readfile() throws IOException{
        System.out.println("readfile!!");
        
        try {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null) 
                try {
                    br.close(); 
                }
                catch (IOException e){}
        }
    }

    
}
