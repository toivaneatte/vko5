package com.example.vko5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class T4 extends Application {
    @Override
    public void start(Stage lh4) {
        StackPane paneeli = new StackPane();
        Circle paa = new Circle(100,100,43);
        paa.setTranslateY(-330);
        paa.setTranslateX(50);
        paa.setStroke(Color.BLACK);
        paa.setFill(Color.RED);
        Ellipse ympy = new Ellipse(100,100,300, 100);
        ympy.setStroke(Color.BLACK);
        ympy.setFill(Color.YELLOW);
        Line viiva1 = new Line(-300,100,-300,400);
        viiva1.setTranslateX(-100);
        viiva1.setTranslateY(-244);
        viiva1.setStrokeWidth(5);
        viiva1.setStroke(Color.GRAY);
        Line viiva2 = new Line(-150, 400, 50, 400);
        viiva2.setTranslateY(-395);
        viiva2.setStrokeWidth(5);
        viiva2.setStroke(Color.GRAY);
        Line viiva3 = new Line(150, 300 ,150 ,70);
        viiva3.setTranslateX(50);
        viiva3.setTranslateY(-280);
        viiva3.setStrokeWidth(2);
        viiva3.setStroke(Color.ORANGERED);
        Line kasi1 = new Line(60, 100, 20, 30);
        kasi1.setTranslateX(70);
        kasi1.setTranslateY(-230);
        kasi1.setStrokeWidth(2);
        kasi1.setStroke(Color.ORANGERED);
        Line kasi2 = new Line(-40, 100, 0, 30);
        kasi2.setTranslateX(30);
        kasi2.setTranslateY(-230);
        kasi2.setStrokeWidth(2);
        kasi2.setStroke(Color.ORANGERED);
        Line jalka1 = new Line(70, 50, 30, 0);
        jalka1.setTranslateX(70);
        jalka1.setTranslateY(-140);
        jalka1.setStrokeWidth(2);
        jalka1.setStroke(Color.ORANGERED);
        Line jalka2 = new Line(70, 0, 30, 50);
        jalka2.setTranslateX(30);
        jalka2.setTranslateY(-140);
        jalka2.setStrokeWidth(2);
        jalka2.setStroke(Color.ORANGERED);
        lh4.setTitle("Tehtävä 4");
        paneeli.setTranslateX(0);
        paneeli.setTranslateY(150);
        paneeli.getChildren().addAll(ympy, viiva1,viiva2,viiva3, paa,kasi1,kasi2,jalka1,jalka2);
        Scene kehys = new Scene(paneeli, 600, 600);
        lh4.setScene(kehys);
        lh4.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}

