package controllers;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    public void exit(MouseEvent mouseEvent) {
        Platform.exit();
        System.exit(0);
    }

    public void introduction(MouseEvent mouseEvent) throws Exception {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/introduction.fxml"));
        stage.setScene(new Scene(root));
    }

    public void selectStep(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/selectStep.fxml"));
        stage.setScene(new Scene(root));
    }
}
