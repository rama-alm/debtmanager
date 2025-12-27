module org.example.debtmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires org.hibernate.orm.community.dialects;
    requires com.google.guice;
    requires com.google.common;

    opens org.example.debtmanager to javafx.fxml, com.google.guice, org.hibernate.orm.core;
    opens org.example.debtmanager.configuration to javafx.fxml, com.google.guice, org.hibernate.orm.core;
    opens org.example.debtmanager.service to javafx.fxml, com.google.guice, org.hibernate.orm.core;
    opens org.example.debtmanager.domain to javafx.fxml, com.google.guice, org.hibernate.orm.core;
    opens org.example.debtmanager.controller to javafx.fxml, com.google.guice, org.hibernate.orm.core;

    exports org.example.debtmanager;
}