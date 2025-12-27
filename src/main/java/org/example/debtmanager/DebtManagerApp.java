package org.example.debtmanager;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.debtmanager.configuration.AppModule;
import org.example.debtmanager.configuration.DatabaseModule;

import java.io.IOException;

public class DebtManagerApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Injector injector = Guice.createInjector(new AppModule(), new DatabaseModule());

        FXMLLoader loader = new FXMLLoader(getClass().getResource("main-view.fxml"));

        loader.setControllerFactory(injector::getInstance);

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}