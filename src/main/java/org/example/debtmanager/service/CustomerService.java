package org.example.debtmanager.service;

import com.google.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.debtmanager.domain.Customer;

import java.util.List;

public class CustomerService {
    private final EntityManagerFactory entityManagerFactory;

    @Inject
    public CustomerService(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public List<Customer> getAllCustomer() {
        try (EntityManager em = entityManagerFactory.createEntityManager()) {
            return em.createQuery("SELECT c FROM customer c", Customer.class).getResultList();
        }
    }
}
