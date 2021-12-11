import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameFrameController extends IntroFrameController{
    private IntroFrameController introFrameController=new IntroFrameController();
    private UniversityFrameController universityFrameController;
    private DowntownFrameController downtownFrameController;
    private Character character;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label activenessLabel;

    @FXML
    private ProgressBar activenessProgressBar;

    @FXML
    private Text activenessText;

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private Button downtownButton;

    @FXML
    private ImageView downtownImageView;

    @FXML
    private Label healthLabel;

    @FXML
    private ProgressBar healthProgressBar;

    @FXML
    private Text healthText;

    @FXML
    private Label intelligenceLabel;

    @FXML
    private ProgressBar intelligenceProgressBar;

    @FXML
    private Text intelligenceText;

    @FXML
    private Label interestLabel;

    @FXML
    private ProgressBar interestProgressBar;

    @FXML
    private Text interestText;

    @FXML
    private Label moneyLabel;

    @FXML
    private Text moneyText;

    @FXML
    private Label semesterLabel;

    @FXML
    private Text semesterText;

    @FXML
    private ProgressBar timeProgressBar;

    @FXML
    private Text timeText;

    @FXML
    private Button universityButton;

    @FXML
    private ImageView universityImageView;

    @FXML
    private ImageView userImageView;

    @FXML
    private ImageView wallpaperImage;

    @FXML
    void OndowntownButton(ActionEvent event) throws IOException {
        Stage window = new Stage();
        //Parent root=FXMLLoader.load(getClass().getResource("DowntownFrame.fxml"));
        FXMLLoader Dloader = new FXMLLoader(getClass().getResource("DowntownFrame.fxml"));
        Parent Dparent;
        Dparent=Dloader.load();
        this.downtownFrameController=Dloader.getController();
        this.downtownFrameController.setController(this);
        this.character=this.introFrameController.getCharacter();
        Scene scene = new Scene(Dparent);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void OnuniversityButton(ActionEvent event) throws IOException {
        Stage window = new Stage();
        //Parent root=FXMLLoader.load(getClass().getResource("UniversityFrame.fxml"));
        FXMLLoader Uloader = new FXMLLoader(getClass().getResource("UniversityFrame.fxml"));
        Parent Uparent;
        Uparent=Uloader.load();
        this.universityFrameController=Uloader.getController();
        this.universityFrameController.setGameFrameController(this);
        Scene scene = new Scene(Uparent);
        window.setScene(scene);
        window.show();
    }

    @FXML
    void initialize() throws IOException {
        GameData gd=new GameData("./resources/gamedata.txt");
        introFrameController.setCharacter(gd.readfile());
        this.timeProgressBar.setProgress((Float)(introFrameController.getCharacter().getTime()/100));
        this.healthProgressBar.setProgress((Float)(introFrameController.getCharacter().getHealth()/100));
        this.interestProgressBar.setProgress((Float)(introFrameController.getCharacter().getInterest()/100));
        this.activenessProgressBar.setProgress((Float)(introFrameController.getCharacter().getActiveness()/100));
        this.intelligenceProgressBar.setProgress((Float)(introFrameController.getCharacter().getIntelligence()/100));
        
        this.timeText.setText(Float.toString(((introFrameController.getCharacter().getTime()))));
        this.healthText.setText(Float.toString(((introFrameController.getCharacter().getHealth()))));
        this.interestText.setText(Float.toString(((introFrameController.getCharacter().getInterest()))));
        this.activenessText.setText(Float.toString(((introFrameController.getCharacter().getActiveness()))));
        this.intelligenceText.setText(Float.toString(((introFrameController.getCharacter().getIntelligence()))));


        assert activenessLabel != null : "fx:id=\"activenessLabel\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert activenessProgressBar != null : "fx:id=\"activenessProgressBar\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert activenessText != null : "fx:id=\"activenessText\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert anchorpane != null : "fx:id=\"anchorpane\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert downtownButton != null : "fx:id=\"downtownButton\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert downtownImageView != null : "fx:id=\"downtownImageView\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert healthLabel != null : "fx:id=\"healthLabel\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert healthProgressBar != null : "fx:id=\"healthProgressBar\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert healthText != null : "fx:id=\"healthText\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert intelligenceLabel != null : "fx:id=\"intelligenceLabel\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert intelligenceProgressBar != null : "fx:id=\"intelligenceProgressBar\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert intelligenceText != null : "fx:id=\"intelligenceText\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert interestLabel != null : "fx:id=\"interestLabel\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert interestProgressBar != null : "fx:id=\"interestProgressBar\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert interestText != null : "fx:id=\"interestText\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert moneyLabel != null : "fx:id=\"moneyLabel\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert moneyText != null : "fx:id=\"moneyText\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert semesterLabel != null : "fx:id=\"semesterLabel\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert semesterText != null : "fx:id=\"semesterText\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert timeProgressBar != null : "fx:id=\"timeProgressBar\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert universityButton != null : "fx:id=\"universityButton\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert universityImageView != null : "fx:id=\"universityImageView\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert userImageView != null : "fx:id=\"userImageView\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert timeText != null : "fx:id=\"timeText\" was not injected: check your FXML file 'GameFrame.fxml'.";
        assert wallpaperImage!=null : "fx:id=\"wallpaperImage\" was not injected: check your FXML file 'GameFrame.fxml'.";
    }

    public void adjTime(float temp) {
        timeProgressBar.setProgress(((Float)introFrameController.getCharacter().adjTime(temp)/100));
        this.setCharacter(introFrameController.getCharacter());
        this.timeText.setText(Float.toString(((introFrameController.getCharacter().getTime()))));
    }

    public void adjHealth(float temp){
        healthProgressBar.setProgress(((Float)introFrameController.getCharacter().adjHealth(temp)/100));
        this.setCharacter(introFrameController.getCharacter());
        this.healthText.setText(Float.toString(((introFrameController.getCharacter().getHealth()))));
    }

    public void adjInterest(float temp) {
        interestProgressBar.setProgress(((Float)introFrameController.getCharacter().adjInterest(temp)/100));
        this.setCharacter(introFrameController.getCharacter());
        this.interestText.setText(Float.toString(((introFrameController.getCharacter().getInterest()))));
    }
    
    public void adjactiveness(float temp) {
        activenessProgressBar.setProgress(((Float)introFrameController.getCharacter().adjActiveness(temp)/100));
        this.setCharacter(introFrameController.getCharacter());
        this.activenessText.setText(Float.toString(((introFrameController.getCharacter().getActiveness()))));
    }
    
    public void adjIntelligence(float temp) {
        intelligenceProgressBar.setProgress(((Float)introFrameController.getCharacter().adjIntelligence(temp)/100));
        this.setCharacter(introFrameController.getCharacter());
        this.intelligenceText.setText(Float.toString(((introFrameController.getCharacter().getIntelligence()))));
    }

    public void adjlectureCount(int temp){
        introFrameController.getCharacter().adjlectureCount(temp);
        this.setCharacter(introFrameController.getCharacter());
    }



    public void setIntroFrameController(IntroFrameController introFrameController) {
        this.introFrameController=introFrameController;
    }

    public IntroFrameController getIntroFrameController() {
        return this.introFrameController;
    }

    public void setUniversityFrameController(UniversityFrameController universityFrameController){
        this.universityFrameController= universityFrameController;
    }

    public UniversityFrameController getUniversityFrameController() {
        return this.universityFrameController;
    } 
    
    public void setDowntownFrameController(DowntownFrameController downtownFrameController) {
        this.downtownFrameController=downtownFrameController;
    }

    public DowntownFrameController getDowntownFrameController() {
        return this.downtownFrameController;
    } 
}
