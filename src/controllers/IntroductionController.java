package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class IntroductionController {
    public void toMenu(MouseEvent mouseEvent) throws Exception {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/menu.fxml"));
        stage.setScene(new Scene(root));
    }

    public void toDomain(MouseEvent mouseEvent) throws Exception {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/model.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
}
