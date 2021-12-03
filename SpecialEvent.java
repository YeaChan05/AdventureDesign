import java.util.Scanner;

public class SpecialEvent {
    Scanner scanner=new Scanner(System.in);
    private int[][] examResult;
    private Character character;
    public SpecialEvent(Character character){
        this.character=character;
        this.examResult=new int[2][8];
    }

    public void Festival(int key){
       
        Main.getStrInput("입력:");
        switch (key) {
            case 1://주점

            case 2://즐기기
            
            case 3://스킵

                break;
        
            default:
                break;
        }
    }

    public void MembershipTraining(int key){
        Main.getStrInput("입력:");
        switch (key) {
            case 1://참여

            case 2://불참
            
                break;
        
            default:
                break;
        }
    }

    public void CouncilElection(int key){
        Main.getStrInput("입력:");
        switch (key) {
            case 1://참여

            case 2://불참
            
                break;
        
            default:
                break;
        }
    }

    public void Exam(){//매개변수를 getIntelligence로 받아옴
        float intel=this.character.getIntelligence();

    }

    public void Contest(int key){
        Main.getStrInput("입력:");
        switch (key) {
            case 1:

            case 2:
            
            case 3:
            
                break;
        
            default:
                break;
        }
    }

}
