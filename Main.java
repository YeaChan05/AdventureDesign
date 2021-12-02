import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import javafx.application.Application;

public class Main{
	
	static Scanner sin = new Scanner(System.in);
    public static String getStrInput(String msg) {
        Scanner in = new Scanner(System.in);
		System.out.println(msg);
		return in.nextLine();
	}
    
    public static void main(String[] args) throws Exception{
        //IntroFrameController.Launch();
        

    	// // 프로그램 전체 구조
    	
    	// Game app = new Game();
        // while (true) {
        //     while (true) {
        //         // 게임 시작, 회원가입, 로그인, (게임 종료)
        //         app.initStage();
        //     }
        //     /*
        //     while (true) {
        //         // 캐릭터 생성, 캐릭터 선택, (게임 종료)
        //         app.characterStage();
        //     }
        //     while (true) {
        //         // 게임중, (게임 종료)
        //         app.gameStage();
        //     }
        //     */
        // }
       
        /* JavaFx 부분 
        Random rand = new Random();
        float num=100*rand.nextFloat();
        ArrayList<Float> list =new ArrayList<Float>();
        list.add(33.3f);
        list.add(33.3f);
        list.add(33.3f);
        
        for(int i=0;i<100;i++){
            num=100*rand.nextFloat();
            CaculateProbability cal=new CaculateProbability(list,num);
            System.out.println(cal.Caculater());
        }
        모든 이벤트 실행 시 시간 소모
        */
        
        Character character =new Character("C://Programming//EngineerMaker//resources//gamedata//testdata.csv");
    }
    
  
    

}   