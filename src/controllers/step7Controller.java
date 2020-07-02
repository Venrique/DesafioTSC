package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class step7Controller {

    public void change(String scene, MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/"+scene+".fxml"));
        stage.setScene(new Scene(root));
    }

    public void toStep6(MouseEvent mouseEvent) throws IOException {
        change("step6",mouseEvent);
    }

    public void toAssembly(MouseEvent mouseEvent) throws IOException {
        change("ensamblaje",mouseEvent);
    }

    public void one(MouseEvent mouseEvent) throws IOException {
        change("step7",mouseEvent);
    }

    public void two(MouseEvent mouseEvent) throws IOException {
        change("step7-2",mouseEvent);
    }

    public void three(MouseEvent mouseEvent) throws IOException {
        change("step7-3",mouseEvent);
    }

    public void four(MouseEvent mouseEvent) throws IOException {
        change("step7-4",mouseEvent);
    }

    public void five(MouseEvent mouseEvent) throws IOException {
        change("step7-5",mouseEvent);
    }

    public void six(MouseEvent mouseEvent) throws IOException {
        change("step7-6",mouseEvent);
    }
}
