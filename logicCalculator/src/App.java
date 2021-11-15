import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class App extends Application
{

    Boolean[] prop = new Boolean[10];
    int propNumber = 0;

    Boolean firstEntry = true;

    char operator;

    char[] operators = new char[10];
    int opNumber = 0;

   

    public static void main(String[] args) throws Exception {
        
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {

        java.net.URL url = getClass().getResource("layout.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(url);
        Parent parent = fxmlLoader.load();
        

        Scene mainScene = new Scene(parent);


        stage.getIcons().add(new Image("file:icon.jpg"));
        stage.setTitle("ogic calculator");
        stage.setScene(mainScene);
        stage.show();
    
    }

  
}
