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
    	// DataStorage ds = new DataStorage();
    	// ds.openAccountFile("id","password");
    	
        // Random rand = new Random();
        // float num=100*rand.nextFloat();
        // ArrayList<Float> list =new ArrayList<Float>();
        // list.add(33.3f);
        // list.add(33.3f);
        // list.add(33.3f);
        
        // for(int i=0;i<100;i++){
        //     num=100*rand.nextFloat();
        //     CaculateProbability cal=new CaculateProbability(list,num);
        //     System.out.println(cal.Caculater());
        // }
        IntroFrameController.Launch();
 
    
   
    
    }  
}   