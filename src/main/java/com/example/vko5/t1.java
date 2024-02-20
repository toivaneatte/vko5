package com.example.vko5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class t1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage alkuIkkuna) {
        StackPane paneeli = new StackPane();
        paneeli.getChildren().add(new Button("Kokeile mua"));
        Scene kehys = new Scene(paneeli,300,400);
        alkuIkkuna.setTitle("Tehtävä 1 ratkaisu");
        alkuIkkuna.setScene(kehys);
        alkuIkkuna.show();

    }
}
