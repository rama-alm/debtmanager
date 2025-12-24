module org.example.debtmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.debtmanager to javafx.fxml;
    exports org.example.debtmanager;
}