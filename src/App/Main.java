package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Hond husky = new Hond("Kiwi");
        Bezoeker piet = new Bezoeker("Piet");


        husky.spelen("rondjes aan het rennen");



        Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
        primaryStage.setScene(new Scene(root, 900, 400));
        primaryStage.show();

    }
}
