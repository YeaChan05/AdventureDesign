import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

public class GameData {
    private String filepath;
    private BufferedReader br;
    private BufferedWriter bw;
    public GameData(String filepath) throws IOException{
        this.filepath = filepath;
        
        }

    public void writefile(Character character) throws IOException{
        bw= new BufferedWriter(new FileWriter(this.filepath));
        
        bw.write("time,"+character.getTime());
        bw.newLine();

        bw.write("health,"+character.getHealth());
        bw.newLine();

        bw.write("activeness,"+character.getActiveness());
        bw.newLine();

        bw.write("interest,"+character.getIntelligence());
        bw.newLine();

        bw.write("money,"+character.getMoney());
        bw.newLine();

        bw.write("intelligence,"+character.getIntelligence());
        bw.newLine();

        bw.write("school year,"+character.getSchoolyear());
        bw.newLine();

        bw.write("semester,"+character.getSemester());
        bw.newLine();

        bw.write("lectureCount,"+character.getlectureCount());
        bw.newLine();

        bw.write("electionFlag,"+character.getElectionFlag());
        bw.flush();
        bw.close();
        System.out.println("writefile!!");
    }

    public Character readfile() throws IOException{
        br = new BufferedReader(new FileReader(this.filepath));
        System.out.println("readfile!!");
        Character character=new Character();
        character.setTime(Float.parseFloat((String)(Linetok(br.readLine()))));

        character.setHealth(Float.parseFloat((String)(Linetok(br.readLine()))));

        character.setActiveness(Float.parseFloat((String)(Linetok(br.readLine()))));

        character.setInterest(Float.parseFloat((String)(Linetok(br.readLine()))));

        character.setMoney(Integer.parseInt((String)(Linetok(br.readLine()))));

        character.setIntelligence(Float.parseFloat((String)(Linetok(br.readLine()))));
        
        character.setSchoolyear(Integer.parseInt((String)(Linetok(br.readLine()))));

        character.setSemester(Integer.parseInt((String)(Linetok(br.readLine()))));

        character.setlectureCount(Integer.parseInt((String)(Linetok(br.readLine()))));
        
        character.setElectionFlag(Boolean.parseBoolean((String)br.readLine()));
        
        return character;
    }
    public Object Linetok(String line){
        StringTokenizer st= new StringTokenizer(line,",");
        Object var="0";
        while(st.hasMoreTokens()){
            var=st.nextToken();
        }
        System.out.println((String)var);
        return var;
    }
}
