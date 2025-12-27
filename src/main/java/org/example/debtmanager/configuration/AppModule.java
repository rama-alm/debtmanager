package org.example.debtmanager.configuration;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.example.debtmanager.service.CustomerService;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CustomerService.class).in(Singleton.class);
    }

}
