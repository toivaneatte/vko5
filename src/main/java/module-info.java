module com.example.vko5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.javadoc;


    opens com.example.vko5 to javafx.fxml;
    exports com.example.vko5;
}

