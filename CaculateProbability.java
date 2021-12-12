import java.util.ArrayList;
public class CaculateProbability {
    private ArrayList<Float> probabilities;
    private float num;
    public CaculateProbability(ArrayList<Float> probabilities,float num){
        this.probabilities = probabilities;
        this.num = num;
    }
    
    public float Caculater(){
        float previousnum=0;
        for(int i=0;i<probabilities.size();i++){
            float currentnum=probabilities.get(i);
            if((previousnum<=num)&&(num<previousnum+currentnum)){
                return num;
            }
            previousnum+=currentnum;
        }
        return -1;
    }
}
