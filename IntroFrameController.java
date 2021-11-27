
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.text.*;

public class IntroFrameController extends Application implements EventHandler<ActionEvent>{
    static Stage window;
    static Scene scene2;
    private static AccountDb db=new AccountDb();
    private static AccountDbUser db_user=new AccountDbUser();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {

    }

    @Override
    public void handle(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }
    
    public static void Launch() {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Stage loginwindow;
        Stage gamewindow;
        loginwindow = stage;
        loginwindow.setWidth(1500);
        loginwindow.setHeight(800);
        loginwindow.setX(200);
        loginwindow.setY(50);
        loginwindow.setTitle("시작 화면");
        loginwindow.setScene(gamestart());
        loginwindow.show();

        //if(){
            //loginwindow.close();

            gamewindow=new Stage();
            gamewindow.setWidth(1500);
            gamewindow.setHeight(800);
            gamewindow.setX(200);
            gamewindow.setY(50);
            gamewindow.setTitle("게임 화면");
            gamewindow.setScene(gameplay());
            gamewindow.show();
        //}로그인 성공시 해당 코드 작동
    }

  

    @Override
    public void stop() throws Exception {
        // TODO Auto-generated method stub
        super.stop();
    }

    public Scene gamestart(){
        window = new Stage();
        Scene startscene;
        window.initModality(Modality.APPLICATION_MODAL);
        window.setWidth(1500);
        window.setHeight(800);
        window.setX(200);
        window.setY(50);
        Label label1 = new Label("게임 시작화면");
        Button button_login = new Button("Login");
        button_login.setOnAction(e->Login());
 
        VBox layout_gamestart = new VBox(100);
        layout_gamestart.getChildren().addAll(label1,button_login);
        startscene = new Scene(layout_gamestart);
        layout_gamestart.setAlignment(Pos.CENTER);
        window.setScene(startscene);
        return startscene;
    }

    private Scene gameplay() throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("IntroFrame.fxml"));
        window = new Stage();
        Scene playscene;
        window.initModality(Modality.APPLICATION_MODAL);
      
        playscene=new Scene(root);
        return playscene;
    }

    public static void Login(){
        window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 300, 275);

        Text scenetitle = new Text("Welcome"); 
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:"); 
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField(); 
        grid.add(userTextField, 1, 1);
        String id_text=userTextField.getText();

        Label pw = new Label("Password:"); 
        grid.add(pw, 0,2);

        PasswordField pwBox = new PasswordField(); 
        grid.add(pwBox, 1, 2);
        String pw_text=userTextField.getText();

        Button loginAccount = new Button("Login");
        grid.add(loginAccount,1,3);
        loginAccount.setOnAction(e->db.check(id_text,pw_text));

        Button createAcount = new Button("create acount");
        grid.add(createAcount,1,4);
        createAcount.setOnAction(e->createAcount());

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        window.setScene(scene);
        window.show();

    }


    public static void createAcount() {
        window = new Stage();
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 300, 275);

        Text scenetitle = new Text("Creat Account"); 
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label name = new Label("Name:"); 
        grid.add(name, 0,1);
        Label id = new Label("User Name:"); 
        grid.add(id, 0, 2);
        Label pw = new Label("Password:"); 
        grid.add(pw, 0,3);
       
        TextField nameField = new TextField(); 
        grid.add(nameField, 1, 1);
        String newName=nameField.getText();

        TextField idField = new TextField(); 
        grid.add(idField, 1, 2);
        String newId=idField.getText();        

        PasswordField pwField = new PasswordField(); 
        grid.add(pwField, 1, 3);
        String newPw=pwField.getText();

        Button creat = new Button("Creat!");
        grid.add(creat,1,4);
        creat.setOnAction(AtionEvent->{
            db.setUser(newId, newPw, newName);
           // if(){계정 생성에 성공하면 종료 가능하도록 조건문 만들기
                window.close();
         //   }
            });

        
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        window.setScene(scene);
        window.show();

    }

   
}
