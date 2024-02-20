package com.example.vko5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class teht3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage alkuIkkuna) {
        Rectangle valkoinen = new Rectangle();
        valkoinen.setWidth(70);
        valkoinen.setHeight(210);
        valkoinen.setFill(Color.TRANSPARENT);
        valkoinen.setStroke(Color.BLACK);
        valkoinen.setStrokeWidth(3);

        Circle punainen = new Circle();
        punainen.setRadius(25);
        punainen.setFill(Color.RED);
        punainen.setStroke(Color.BLACK);

        Circle keltainen = new Circle();
        keltainen.setRadius(25);
        keltainen.setFill(Color.YELLOW);
        keltainen.setStroke(Color.BLACK);

        Circle vihrea = new Circle();
        vihrea.setRadius(25);
        vihrea.setFill(Color.GREEN);
        vihrea.setStroke(Color.BLACK);


        VBox vb = new VBox(5);
        vb.setAlignment(Pos.CENTER);
        vb.getChildren().addAll(punainen,keltainen,vihrea);


        StackPane sp = new StackPane();
        sp.getChildren().addAll(valkoinen,vb);

        Rectangle ruskea = new Rectangle();
        ruskea.setWidth(40);
        ruskea.setHeight(200);
        ruskea.setFill(Color.BROWN);
        ruskea.setStroke(Color.BLACK);
        ruskea.setStrokeWidth(3);

        HBox hb = new HBox(10);
        hb.getChildren().add(ruskea);
        hb.setAlignment(Pos.CENTER);


        BorderPane p = new BorderPane();
        p.setCenter(sp);
        p.setBottom(hb);


        Scene s = new Scene(p,500,400);
        alkuIkkuna.setScene(s);
        alkuIkkuna.setTitle("Tehtävä 3");
        alkuIkkuna.show();

    }
}
