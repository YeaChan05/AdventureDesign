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
        IntroFrameController.Launch();
        
    }  
}   