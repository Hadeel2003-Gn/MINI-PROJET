module com.example.miniprojet {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    opens com.example.tp1gd to javafx.fxml;
    exports com.example.tp1gd;
    exports com.example.tp1gd.models;
    opens com.example.tp1gd.models to javafx.fxml;

}