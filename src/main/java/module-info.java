module com.example.demoprojecgt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoprojecgt to javafx.fxml;
    exports com.example.demoprojecgt;
}