package org.example.debtmanager.configuration;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.community.dialect.SQLiteDialect;

import java.util.Properties;

public class DatabaseModule extends AbstractModule {

    @Provides
    @Singleton
    public EntityManagerFactory provideEntityManagerFactory() {
        Configuration config = new Configuration();

        Properties settings = new Properties();
        settings.put("hibernate.connection.driver_class", "org.sqlite.JDBC");
        settings.put("hibernate.connection.url", "jdbc:sqlite:D:/projects/debtmanagerDB.db");

        settings.put("hibernate.dialect", SQLiteDialect.class.getName());
        settings.put("hibernate.hbm2ddl.auto", "validate");
        settings.put("hibernate.show_sql", "true");      // Log SQL to console

        config.setProperties(settings);

        config.addAnnotatedClass(org.example.debtmanager.domain.Customer.class);
        config.addAnnotatedClass(org.example.debtmanager.domain.Debt.class);
        config.addAnnotatedClass(org.example.debtmanager.domain.TransactionHistory.class);

        return config.buildSessionFactory();
    }
}
