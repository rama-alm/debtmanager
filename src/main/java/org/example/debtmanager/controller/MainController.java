package org.example.debtmanager.controller;

import com.google.inject.Inject;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import org.example.debtmanager.domain.Customer;
import org.example.debtmanager.service.CustomerService;

import java.util.stream.Collectors;

public class MainController {
    private final CustomerService customerService;

    @FXML
    private ListView<String> listContainer;

    @Inject
    public MainController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @FXML
    public void initialize() {
        var customers = customerService.getAllCustomer();

        System.out.println("Loaded customers: " + customers);

        listContainer.getItems().addAll(customers.stream().map(Customer::getName).toList());
    }
}
