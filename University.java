
public class University {
    private Character character;
    public University(Character character){
        this.character=character;
    }

    //마우스로 해당 부분 클릭 시 실행되는 메소드들
    public void takeLecture(){
        character.adjIntelligence(0.5f);
        character.adjlectureCount(1);
        character.adjHealth(-1);//1말고 나중에는 get~~~꼴로 변경
    }

    public void clubActivities(){
        character.adjIntelligence(-0.3f);
        character.adjInterest(1);
        character.adjHealth(-1.0f);
    }

    public void Study(){
        character.adjIntelligence(2);
        character.adjHealth(-2.0f);
    }

    public void Homework(){
        character.adjIntelligence(0.5f);
        character.adjHealth(-1.5f);
    }
    //public void LectureApplication(){}//수강 신청 이벤트(학기 초반에 신청)
}
