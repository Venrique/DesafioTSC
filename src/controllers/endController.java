package controllers;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class endController {
    public void change(String scene, MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/"+scene+".fxml"));
        stage.setScene(new Scene(root));
    }

    public void toStep8(MouseEvent mouseEvent) throws IOException {
        change("step8", mouseEvent);
    }

    public void end(MouseEvent mouseEvent) throws IOException {
        Platform.exit();
        System.exit(0);
    }
}
