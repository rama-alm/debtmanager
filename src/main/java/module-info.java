module org.example.debtmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens org.example.debtmanager to javafx.fxml;
    exports org.example.debtmanager;
}