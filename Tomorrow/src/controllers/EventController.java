package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EventController
{
    @FXML
    private ChoiceBox<String> typeBox;

    @FXML
    private ToggleGroup priGroup;

    @FXML
    private TextField eveNameBox;

    @FXML
    private Button saveEvent;

    @FXML
    void saveEvent(ActionEvent event) throws IOException
    {
        //ignore this, it isnt working but isn't causing errors
        PrintWriter out = new PrintWriter("Events.txt");
        out.println(eveNameBox);
    }

    @FXML
    void showTypeList(MouseEvent Event)
    {
        try
        {
            ObservableList<String> list = FXCollections.observableArrayList();
            list.addAll("Appointment", "HW");
            typeBox.setItems(list);
            typeBox.setValue("Event");
            System.out.println("inside showTypeList");
        }
        catch(Exception e)
        {
            System.out.println("Error in showTypeList");
            e.printStackTrace();
        }
    }

}
