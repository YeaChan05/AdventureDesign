public class Character{
    private float health=50;
    private float activeness=50;
    private float interest=50;
    private int money=10000;
    private float intelligence=50;
    private int[][] period=new int[2][8];
    private int lectureCount=0;
    private boolean electionFlag=false;
    private int semester=0;//학기
    private int schoolyear=0;
    private float time=0;
    private boolean majorlecture1Flag=false;
    private boolean majorlecture2Flag=false;
    

    private boolean majorlecture3Flag=false;
    private boolean majorlecture4Flag=false;
    private boolean culturelecture1Flag=false;
    private boolean culturelecture2Flag=false;
    private boolean clubactivitiesFlag=false;
    public Character() {	
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
    public void setHealth(float Health){
        this.health=Health;
    }

    public void setActiveness(float Activeness){
        this.activeness=Activeness;
    }

    public void setInterest(float Interest){
        this.interest=Interest;
    }

    public void setMoney(int Money){
        this.money=Money;
    }
    
    public void setIntelligence(float Intelligence){
        this.intelligence=Intelligence;
    }

    public void setElectionFlag(boolean electionFlag){
        this.electionFlag=electionFlag;
    }

    public void setlectureCount(int lectureCount){
        this.lectureCount=lectureCount;
    }

    public void setPeriod(int[][] period){
        this.period=period;
    }

    public void setSemester(int semester){
        this.semester=semester;
    }

    public void setSchoolyear(int schoolyear){
        this.schoolyear=schoolyear;
    }

    public void setTime(float time){
        this.time=time;
    }


    
    //데이터 호출
    public float getHealth(){
        return this.health;
    }

    public float getActiveness(){
        return this.activeness;
    }

    public float getInterest(){
        return this.interest;
    }

    public int getMoney(){
        return this.money;
    }
    
    public float getIntelligence(){
        return this.intelligence;
    }

    public boolean getElectionFlag(){
        return this.electionFlag;
    }

    public int getlectureCount(){
        return this.lectureCount;
    }

    public int[][] getPeriod(){
        return this.period;
    }

    public int getSemester(){
        return this.semester;
    }

    public int getSchoolyear(){
        return this.schoolyear;
    }

    public float getTime(){
        return this.time;
    }



    //기존 데이터 변경
    public float adjHealth(float temp){
        if((this.health+temp<0)||(this.health+temp>100)){
            return this.health;
        }
        return this.health+=temp;
    }

    public float adjActiveness(float temp){
        if((this.activeness+temp<0)||(this.activeness+temp>100)){
            return this.activeness;
        }
        return this.activeness+=temp;
    }

    public float adjInterest(float temp){
        if((this.interest+temp<0)||(this.interest+temp>100)){
            return this.interest;
        }
        return this.interest+=temp;
    }

    public float adjMoney(float temp){
        if(this.money+temp<0){
            return this.money;
        }
        return this.money+=temp;
    }
    
    public float adjIntelligence(float temp){
        if((this.intelligence+temp)<0||(this.intelligence+temp>100)){
            return this.intelligence;
        }
        return this.intelligence+=temp;
    }

    public int adjlectureCount(int temp){
        // if(()||()){
            
        // }
        return this.lectureCount+=temp;
    }

    public int adjSemester(int temp){
        return this.semester+=temp;
    }

    public int adjSchoolyear(int temp){
        // if((this.schoolyear+temp<0)||(this.schoolyear+temp>100)){
        //     return this.schoolyear;
        // }
        return this.schoolyear+=temp;
    }

    public float adjTime(float temp){
        if((this.time+temp<0)||(this.time+temp>100)){
            return this.time;
        }
        return this.time+=temp;
    }



    
    public boolean getMajorlecture1Flag() {
        return majorlecture1Flag;
    }

    public void setMajorlecture1Flag(boolean majorlecture1Flag) {
        this.majorlecture1Flag = majorlecture1Flag;
    }

    public boolean getMajorlecture2Flag() {
        return majorlecture2Flag;
    }

    public void setMajorlecture2Flag(boolean majorlecture2Flag) {
        this.majorlecture2Flag = majorlecture2Flag;
    }

    public boolean getMajorlecture3Flag() {
        return majorlecture3Flag;
    }

    public void setMajorlecture3Flag(boolean majorlecture3Flag) {
        this.majorlecture3Flag = majorlecture3Flag;
    }

    public boolean getMajorlecture4Flag() {
        return majorlecture4Flag;
    }

    public void setMajorlecture4Flag(boolean majorlecture4Flag) {
        this.majorlecture4Flag = majorlecture4Flag;
    }

    public boolean getCulturelecture1Flag() {
        return culturelecture1Flag;
    }

    public void setCulturelecture1Flag(boolean culturelecture1Flag) {
        this.culturelecture1Flag = culturelecture1Flag;
    }

    public boolean getCulturelecture2Flag() {
        return culturelecture2Flag;
    }

    public void setCulturelecture2Flag(boolean culturelecture2Flag) {
        this.culturelecture2Flag = culturelecture2Flag;
    }

    public boolean getClubactivitiesFlag() {
        return clubactivitiesFlag;
    }

    public void setClubactivitiesFlag(boolean clubactivitiesFlag) {
        this.clubactivitiesFlag = clubactivitiesFlag;
    }
}
