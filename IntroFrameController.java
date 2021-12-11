import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class IntroFrameController extends Application implements EventHandler<ActionEvent>{
    private Stage window;
    private  Character character=new Character();
    GameFrameController con;
    private GameFrameController temp;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private ImageView introimage;

    @FXML
    private Button gamestartbutton;
    
    @FXML
    void initialize() throws IOException {
        assert anchorpane != null : "fx:id=\"anchorpane\" was not injected: check your FXML file 'IntroFrame.fxml'.";
        assert introimage != null : "fx:id=\"introimage\" was not injected: check your FXML file 'IntroFrame.fxml'.";
        assert gamestartbutton != null : "fx:id=\"gamestartbutton\" was not injected: check your FXML file 'IntroFrame.fxml'.";
    }
    @FXML
    public void OnGameStart() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GameFrame.fxml"));
        Parent parent = loader.load();
        con=loader.getController();
        con.setIntroFrameController(this);
        this.character=con.getCharacter();
        closeStage();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("IntroFrame.fxml"));
        stage.getIcons().add(new Image("file:resources/user.png"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    @Override
    public void handle(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
    
    public static void Launch() {
        launch();
    }

    public void closeStage() {
		Stage stage = (Stage)anchorpane.getScene().getWindow();
		Platform.runLater(() -> {
            stage.close();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("GameFrame.fxml"))));
                stage.getIcons().add(new Image("file:resources/user.png"));
                stage.show();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
		});
	}

    public Character getCharacter() {
        return this.character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
