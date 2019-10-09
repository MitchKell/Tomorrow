package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.net.URL;

public class HomeController
{

    @FXML
    private AnchorPane background;

    @FXML
    private TabPane tabs;

    @FXML
    private Tab allEvents;

    @FXML
    private Button optionsBut;
    
    @FXML
    public void openEvent(ActionEvent actionEvent) throws Exception
    {
        try {
            URL loc = getClass().getClassLoader().getResource("layout/NewEvent.fxml");
            FXMLLoader loader = new FXMLLoader(loc);
            Parent rootPane = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(rootPane));
            stage.show();
        }
        catch(Exception e) {
            System.out.println("Exception caught in openEvent handler");
            System.out.println("-------------------------------------");
            e.printStackTrace();
        }
    }

    public void openOptions(ActionEvent actionEvent)
    {
        try {
            URL loc = getClass().getClassLoader().getResource("layout/Options.fxml");
            FXMLLoader loader = new FXMLLoader(loc);
            Parent rootPane = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(rootPane));
            stage.show();
        }
        catch(Exception e) {
            System.out.println("Exception caught in openOptions handler");
            System.out.println("-------------------------------------");
            e.printStackTrace();
        }
    }
}
