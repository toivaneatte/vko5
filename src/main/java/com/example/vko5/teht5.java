package com.example.vko5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class teht5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane paneeli = new GridPane(100,50);
        paneeli.setAlignment(Pos.TOP_LEFT);
        paneeli.setPadding(new Insets(10,12,14,16));
        paneeli.setHgap(5.5);
        paneeli.setVgap(5.5);



        //SUOMI
        ImageView suomi = new ImageView("Suomi.jpg");
        suomi.setFitWidth(150);
        suomi.setFitHeight(100);

        //RUOTSI
        ImageView ruotsi = new ImageView("Sverige.jpg");
        ruotsi.setFitWidth(150);
        ruotsi.setFitHeight(100);

        //Norja
        ImageView norja = new ImageView("Norge.jpg");
        norja.setFitWidth(150);
        norja.setFitHeight(100);

        //italia
        ImageView italia = new ImageView("italy.png");
        italia.setFitWidth(150);
        italia.setFitHeight(100);

        //ukraina
        ImageView ukraina = new ImageView("ukraine.png");
        ukraina.setFitWidth(150);
        ukraina.setFitHeight(100);

        //britannia
        ImageView britit = new ImageView("union-jack.jpg");
        britit.setFitWidth(150);
        britit.setFitHeight(100);




        paneeli.add(suomi,0,0);
        paneeli.add(ruotsi,1,0);
        paneeli.add(norja,2,0);
        paneeli.add(italia,0,1);
        paneeli.add(ukraina,1,1);
        paneeli.add(britit,2,1);
        Scene kehys = new Scene(paneeli,700,500);
        primaryStage.setScene(kehys);
        primaryStage.setTitle("Tehtävä 5");
        primaryStage.show();

    }
}
