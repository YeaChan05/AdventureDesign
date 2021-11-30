public class Character{
    private float health=0;
    private float activeness=0;
    private float interest=0;
    private float money=0;
    private String name="";
    private float intelligence=0;
    private boolean gender=true;
    private int[][] grade=new int[2][8];;
    private int lectureCount=0;
    private boolean electionFlag=false;

    public Character(String Name, boolean Gender){
        this.name=Name;
        this.gender=Gender;
        System.out.println("Character 생성자 작동");
    }

    public float CalculateGrade(int TakeLecture,int Homework,int Study, int[] Exam){//매개변수들은 100점 만점 기준으로 받아야지 계산하기 편함
        float Result=0;
        if((TakeLecture>=75.0)&&(Exam[0]!=-1)&&(Exam[1]!=-1)){//출석률이 75%를 넘겼을때,시험을 응시 했을 때
            Result+=Exam[0]*0.35;//중간 성적
            Result+=Exam[1]*0.35;//기말 성적
            Result+=TakeLecture*0.10;//출석
            Result+=Homework*0.20;//과제
        }
        else
            Result=-1;//F학점

        return Result;
    }

  //데이터 조정
    public void setHealth(int Health){
        this.health=Health;
    }

    public void setActiveness(int Activeness){
        this.activeness=Activeness;
    }

    public void setInterest(int Interest){
        this.interest=Interest;
    }

    public void setMoney(int Money){
        this.money=Money;
    }
    
    public void setIntelligence(int Intelligence){
        this.intelligence=Intelligence;
    }

    public void setElectionFlag(){
        this.electionFlag=true;
    }

    public void setlectureCount(int lectureCount){
        this.lectureCount=lectureCount;
    }





    //데이터 호출
    public float isHealth(){
        return this.health;
    }

    public float isActiveness(){
        return this.activeness;
    }

    public float isInterest(){
        return this.interest;
    }

    public float isMoney(){
        return this.money;
    }
    
    public float isIntelligence(){
        return this.intelligence;
    }

    public boolean isElectionFlag(){
        return this.electionFlag;
    }

    public int islectureCount(){
        return this.lectureCount;
    }





    //기존 데이터 변경
    public float adjHealth(float temp){
        return this.health+=temp;
    }

    public float adjActiveness(float temp){
        return this.activeness+=temp;
    }

    public float adjInterest(float temp){
        return this.interest+=temp;
    }

    public float adjMoney(float temp){
        return this.money+=temp;
    }
    
    public float adjIntelligence(float temp){
        return this.intelligence+=temp;
    }

    public int adjlectureCount(int temp){
        return this.lectureCount+=temp;
    }
}
