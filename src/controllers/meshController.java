package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.io.IOException;

public class meshController {

    @FXML
    private StackPane meshContainer;

    TriangleMesh mesh = new TriangleMesh();
    MeshView box = new MeshView(mesh);

    private Rotate rotateX = new Rotate(0, Rotate.X_AXIS);
    private Rotate rotateY = new Rotate(0, Rotate.Y_AXIS);

    private double mousePosX, mousePosY = 0;

    public void initialize(){
        float d = 170;

        float points[] =
                {
                        0, 0, d,
                        d, 0, d,
                        0, d, d,
                        d, d, d,
                        0, 0, 0,
                        d, 0, 0,
                        0, d, 0,
                        d, d, 0
                };

        int faces[] = {
                5,0,4,0,0,0     //P5,T1 ,P4,T0  ,P0,T3
                ,5,0,0,0,1,0    //P5,T1 ,P0,T3  ,P1,T4
                ,0,0,4,0,6,0    //P0,T3 ,P4,T2  ,P6,T7
                ,0,0,6,0,2,0    //P0,T3 ,P6,T7  ,P2,T8
                ,1,0,0,0,2,0    //P1,T4 ,P0,T3  ,P2,T8
                ,1,0,2,0,3,0    //P1,T4 ,P2,T8  ,P3,T9
                ,5,0,1,0,3,0    //P5,T5 ,P1,T4  ,P3,T9
                ,5,0,3,0,7,0   //P5,T5 ,P3,T9  ,P7,T10
                ,4,0,5,0,7,0   //P4,T6 ,P5,T5  ,P7,T10
                ,4,0,7,0,6,0  //P4,T6 ,P7,T10 ,P6,T11
                ,3,0,2,0,6,0   //P3,T9 ,P2,T8  ,P6,T12
                ,3,0,6,0,7,0  //P3,T9 ,P6,T12 ,P7,T13
                ,1,0,4,0,6,0
                ,1,0,6,0,3,0
                ,4,0,1,0,3,0
                ,4,0,3,0,6,0
        };


        mesh.getPoints().addAll(points);
        mesh.getTexCoords().addAll(0,0);
        mesh.getFaces().addAll(faces);


        box.setDrawMode(DrawMode.LINE);
        rotateX.setAngle(10);
        rotateY.setAngle(30);
        box.getTransforms().addAll(rotateX, rotateY);
        box.setTranslateX(360);
        box.setMaterial(new PhongMaterial(Color.FORESTGREEN));

        meshContainer.getChildren().add(box);

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
                        (dy / 300 * 360) * (Math.PI / 40));
                rotateY.setAngle(rotateY.getAngle() -
                        (dx / 300 * -360) * (Math.PI / 40));
            }
            mousePosX = me.getSceneX();
            mousePosY = me.getSceneY();
        });
    }

    public void toCondition(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/conditions.fxml"));
        stage.setScene(new Scene(root));
    }

    public void toTable(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/table.fxml"));
        stage.setScene(new Scene(root));
    }
}
