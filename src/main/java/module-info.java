module com.example.auto_ahora {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.auto_ahora to javafx.fxml;
    exports com.example.auto_ahora;
}