package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.io.IOException;


public class domainController {

    @FXML
    private StackPane dominio;

    Box box = new Box(200, 200, 200);
    private Rotate rotateX = new Rotate(0, Rotate.X_AXIS);
    private Rotate rotateY = new Rotate(0, Rotate.Y_AXIS);
    private Rotate rotateZ = new Rotate(0, Rotate.Z_AXIS);
    private double mousePosX, mousePosY = 0;

    public void initialize(){

        rotateX.setAngle(30);
        rotateY.setAngle(30);
        box.setDrawMode(DrawMode.FILL);
        box.getTransforms().addAll(rotateX, rotateY);
        box.setMaterial(new PhongMaterial(Color.FORESTGREEN));
        box.setTranslateX(330);
        dominio.getChildren().add(box);

        handleMouseEvents();
    }

    private void handleMouseEvents() {
        box.setOnMousePressed((MouseEvent me) -> {
            mousePosX = me.getSceneX();
            mousePosY = me.getSceneY();
        });

        box.setOnMouseDragged((MouseEvent me) -> {
            double dx = (mousePosX - me.getSceneX()) ;
            double dy = (mousePosY - me.getSceneY());
            if (me.isPrimaryButtonDown()) {
                rotateX.setAngle(rotateX.getAngle() -
                        (dy / box.getHeight() * 360) * (Math.PI / 40));
                rotateY.setAngle(rotateY.getAngle() -
                        (dx / box.getWidth() * -360) * (Math.PI / 40));
            }
            mousePosX = me.getSceneX();
            mousePosY = me.getSceneY();
        });
    }

    public void toModel(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/model.fxml"));
        stage.setScene(new Scene(root));
    }

    public void toConditions(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/conditions.fxml"));
        stage.setScene(new Scene(root));
    }
}
