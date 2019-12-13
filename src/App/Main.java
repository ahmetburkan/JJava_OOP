package App;

import App.model.*;
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

        Kat kitten = new Kat();
        kitten.setNaam("kittie kat");
        kitten.setSpel("miauwen");



        Konijn konijntje = new Konijn();
        konijntje.setNaam("flappie konijnie");
        konijntje.setSpel("hup hup");


        Hond husky = new Hond();
        husky.setNaam("kiwi hondie");
        husky.setSpel("rennen");
//
//        Bezoeker gast1 = new Bezoeker();
//        gast1.setNaam("piet");
//        gast1.setSpel("springen");
//
//
//        gast1.setMetWie(husky.getNaam());
//        husky.setMetWie(gast1.getNaam());
//
//        System.out.println(gast1.aanHetSpelen());
//        System.out.println(husky.aanHetSpelen());


        Parent root = FXMLLoader.load(getClass().getResource("view/App.fxml"));
        primaryStage.setScene(new Scene(root, 900, 400));
        primaryStage.show();

        System.out.println(DierenLijst.getInstance().lijst);

    }
}
