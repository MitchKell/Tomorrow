package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL loc = getClass().getClassLoader().getResource("layout/HomeScreen.fxml");
        FXMLLoader loader = new FXMLLoader(loc);
        Parent rootPane = loader.load();
        primaryStage.setScene(new Scene(rootPane));
        primaryStage.show();
    }


    public static void main(String[] args){
        launch(args);
    }
}
