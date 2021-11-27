import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main{
	
	static Scanner sin = new Scanner(System.in);
	static AccountDbUser user = new AccountDbUser(); 
	
    public static String getStrInput(String msg) {
        Scanner in = new Scanner(System.in);
		System.out.println(msg);
		return in.nextLine();
	}
    
    public static void main(String[] args) throws Exception{
        
        //Account account=new Account();
        //account.run();
        
        
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
        //모든 이벤트 실행 시 시간 소모
    //     while(true) {
    //     	System.out.println("1: 회원가입 \t 2: 로그인 \t 3 종료 ");
    //     	String n = Main.getStrInput(">>>>>>");
    //     	if (n.equals("1")) {
    //     		make_user();        	
    //     	}
    //     	else if (n.equals("2")) {
    //     		login();
    //     	}
    //     	else if (n.equals("3")) {
    //     		break;
    //     	}
    //     	else if (n.equals("st-lab")) {
    //     		System.out.println("개발자 접근");
    //     		user.getDb();
    //     	}
    //     	else {
    //     		System.out.println("잘못입력");
    //     	}
    //     	System.out.println();
        	
    //     }
           
    // }
    
    // static void make_user() throws Exception {
    // 	String id = Main.getStrInput("아이디 입력 :");
    // 	String password = Main.getStrInput("비밀번호 입력:");
    // 	String name = Main.getStrInput("이름입력 :");
    // 	user.setDbUser(id, password, name);
    // }
    
    // static void login() throws Exception {
    // 	String id = Main.getStrInput("아이디 입력 :");
    // 	String password = Main.getStrInput("비밀번호 입력:");
    	
    // 	user.getDbUser(id,password);
     }
    
    
}   