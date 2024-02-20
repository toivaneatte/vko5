package com.example.vko5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class teht2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage alkuIkkuna) {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15,15,15,5));

        vBox.getChildren().add(new Button("Ylin"));
        vBox.getChildren().add(new Button("Keskellä"));
        vBox.getChildren().add(new Button("Alin"));

        Scene kehys = new Scene(vBox,400,500);
        alkuIkkuna.setTitle("Tehtävä 2");
        alkuIkkuna.setScene(kehys);
        alkuIkkuna.show();
    }
}
