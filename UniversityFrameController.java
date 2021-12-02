import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UniversityFrameController {
	private Stage universityStage=new Stage();
	private Character ch = new Character("inchan", true);
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button clubactivitiesButton;

    @FXML
    private Button culturelecture1Button;

    @FXML
    private Button culturelecture2Button;

    @FXML
    private Button hiddeneventButton;

    @FXML
    private CheckBox hiddeneventCheckBox;

    @FXML
    private Label lecutreLabel;

    @FXML
    private ListView<?> lecutreListView;

    @FXML
    private Button majorlecture1Button;

    @FXML
    private Button majorlecture2Button;

    @FXML
    private Button majorlecture3Button;

    @FXML
    private Button majorlecture4Button;

    @FXML
    private ImageView returnIamgeView;

    @FXML
    private Button specialeventButton;

    @FXML
    private Button studyButton;

    @FXML
    private TextField universityTextField;

    @FXML
    public void OnstudyButton(ActionEvent event) throws Exception {
    	System.out.println("공부하기 버튼 클릭");
    }
   
    @FXML
    public void OnclubactivitiesButton(ActionEvent event) throws Exception {
    	System.out.println("동아리 버튼 클릭");
    }
    
    @FXML 
    public void Onmajorlecture1Button(ActionEvent event) throws Exception {
    	System.out.println("전공1 버튼 클릭");
    }
    
    @FXML 
    public void  Onmajorlecture2Button(ActionEvent event) throws Exception {
    	System.out.println("전공2 버튼 클릭");
    }
    
    
    @FXML 
    public void  Onmajorlecture3Button(ActionEvent event) throws Exception {
    	System.out.println("전공3 버튼 클릭");
    }
    
    
    @FXML 
    public void  Onmajorlecture4Button(ActionEvent event) throws Exception {
    	System.out.println("전공4 버튼 클릭");
    }
    
    @FXML 
    public void Onculturelecture1Button(ActionEvent event) throws Exception {
    	System.out.println("교양1 버튼 클릭");
    }
    
    @FXML 
    public void Onculturelecture2Button(ActionEvent event) throws Exception {
    	System.out.println("교양2 버튼 클릭");
    }
    
    
    @FXML 
    public void OnhiddeneventButton(ActionEvent event) throws Exception {
    	System.out.println("히든이벤트 버튼 클릭");
    	// 버튼이 정해진 틱일떄 조건에 맞게 클릭할수 있도록 해준다. 
    	int tick = 5;
    	if(tick == 5)
    	{	
    		hiddeneventButton.setDisable(false); // 버튼 활성화 
	    	Stage window = new Stage();
	        window.initModality(Modality.APPLICATION_MODAL);
	        Parent root=FXMLLoader.load(getClass().getResource("HiddenFrame.fxml"));
	        Scene scene = new Scene(root, 400, 400);
	        window.setScene(scene);
	        window.show();
    	}
    }
    
    @FXML 
    public void OnspecialeventButton(ActionEvent event) throws Exception {
    	System.out.println("스페셜이벤트 버튼 클릭");
    	int ticks = 5;
    	if(ticks == 5)
    	{	
    		specialeventButton.setDisable(false); // 버튼 활성화 
    		Stage window = new Stage();
	        window.initModality(Modality.APPLICATION_MODAL);
	        Parent root=FXMLLoader.load(getClass().getResource("SpecialFrame.fxml"));
	        Scene scene = new Scene(root, 400, 400);
	        window.setScene(scene);
	        window.show();
    	}
    }
    
    @FXML 
    public void OnreturnButton(ActionEvent event) throws Exception {
    	System.out.println("돌아가기 버튼 클릭");
    	// University 윈도우 끄고 game윈도우만 띄우기 
    	
    }
    
    
    
    @FXML
    void initialize() {
        assert clubactivitiesButton != null : "fx:id=\"clubactivitiesButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert culturelecture1Button != null : "fx:id=\"culturelecture1Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert culturelecture2Button != null : "fx:id=\"culturelecture2Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert hiddeneventButton != null : "fx:id=\"hiddeneventButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert lecutreLabel != null : "fx:id=\"lecutreLabel\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert lecutreListView != null : "fx:id=\"lecutreListView\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture1Button != null : "fx:id=\"majorlecture1Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture2Button != null : "fx:id=\"majorlecture2Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture3Button != null : "fx:id=\"majorlecture3Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert majorlecture4Button != null : "fx:id=\"majorlecture4Button\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert returnIamgeView != null : "fx:id=\"returnIamgeView\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert specialeventButton != null : "fx:id=\"specialButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert studyButton != null : "fx:id=\"studyButton\" was not injected: check your FXML file 'UniversityFrame.fxml'.";
        assert universityTextField != null : "fx:id=\"universityTextField\" was not injected: check your FXML file 'UniversityFrame.fxml'.";

    }
   


}
