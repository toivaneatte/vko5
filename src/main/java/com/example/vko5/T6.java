package com.example.vko5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class T6 extends Application {
    @Override
    public void start(Stage lh6) {
        StackPane paneeli = new StackPane();
        Image ruoka = new Image("ruoka.png");
        ImageView ruokala = new ImageView(ruoka);
        ruokala.setFitHeight(100);
        ruokala.setFitWidth(150);
        ruokala.setTranslateX(-80);
        Rectangle uuni = new Rectangle(150, 100, 200, 130);
        uuni.setStroke(Color.BLACK);
        uuni.setFill(Color.WHITE);
        uuni.setTranslateX(-80);
        Label teksti = new Label("MIKROAALTOUUNI");
        teksti.setFont((Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15)));
        teksti.setTranslateX(110);
        teksti.setTranslateY(50);
        HBox valik = new HBox(0);
        valik.setAlignment(Pos.CENTER);
        valik.setTranslateX(137);
        valik.setTranslateY(-30);
        valik.getChildren().add(new Button("Start"));
        valik.getChildren().add(new Button("Stop"));
        valik.getChildren().add(new Button("Clear"));
        Rectangle aja = new Rectangle(90,200,120,20);
        aja.setFill(Color.WHITE);
        aja.setStroke(Color.BLACK);
        aja.setTranslateX(136);
        aja.setTranslateY(-55);
        Label aika = new Label("0:00");
        aika.setFont((Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 13)));
        aika.setTranslateX(138);
        aika.setTranslateY(-54);



        paneeli.getChildren().addAll(teksti,uuni, ruokala, valik,aja, aika );
        paneeli.setAlignment(Pos.CENTER);
        lh6.setTitle("Tehtävä 6");
        Scene kehys = new Scene(paneeli, 400, 140);
        lh6.setScene(kehys);
        lh6.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}


