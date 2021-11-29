import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class IntroFrameController extends Application implements EventHandler<ActionEvent>{
    private Stage window;
    private Stage primeStage=new Stage();
    private Account account= new Account();
    private static boolean loginSuccess=false;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private Text gamename;

    @FXML
    private ImageView introimage;

    @FXML
    private Button loginbtn;
    
    @FXML
    void initialize() {
        assert anchorpane != null : "fx:id=\"anchorpane\" was not injected: check your FXML file 'IntroFrame.fxml'.";
        assert gamename != null : "fx:id=\"gamename\" was not injected: check your FXML file 'IntroFrame.fxml'.";
        assert introimage != null : "fx:id=\"introimage\" was not injected: check your FXML file 'IntroFrame.fxml'.";
        assert loginbtn != null : "fx:id=\"loginbtn\" was not injected: check your FXML file 'IntroFrame.fxml'.";

    }
    @FXML
    public void Login() throws IOException{
        
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        Parent root=FXMLLoader.load(getClass().getResource("LoginFrame.fxml"));
        Scene scene = new Scene(root, 300, 275);
        window.setScene(scene);
        window.show();

    }

    public void createAcount() {
        window = new Stage();
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 300, 275);

        Text scenetitle = new Text("Creat Account"); 
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label id = new Label("User Name:"); 
        grid.add(id, 0, 1);
        Label pw = new Label("Password:"); 
        grid.add(pw, 0,2);
       

        TextField idField = new TextField(); 
        grid.add(idField, 1, 1);     

        TextField pwField = new PasswordField(); 
        grid.add(pwField, 1, 2);
        Button creat = new Button("Creat!");
        grid.add(creat,1,3);
        creat.setOnAction(AtionEvent->{
            try {
                if(account.checkAccountFile(idField.getText(), pwField.getText())){
                    alert("account already exist");
                }
                else{
                    account.creatAccount(idField.getText(), pwField.getText());
                    System.out.println(idField.getText());
                    System.out.println(pwField.getText());
                    window.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            });
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        window.setScene(scene);
        window.show();

    }

    public void alert(String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 200, 130);
        Label l=new Label(message);
        Button b=new Button("close");
        b.setOnAction(e ->window.close());

        grid.add(b,0,1);
        grid.add(l,0,0);
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        window.setScene(scene);
        window.show();

    }

    public static boolean isloginSuccess(){
        return loginSuccess;
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("IntroFrame.fxml"));
        primeStage.setScene(new Scene(root));
        primeStage.show();
    }

    @Override
    public void handle(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stop() throws Exception {
        // TODO Auto-generated method stub
        super.stop();
    }
    public static void Launch() {
        launch();
    }
}
