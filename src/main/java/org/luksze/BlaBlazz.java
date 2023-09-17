package org.luksze;

import org.luksze.config.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BlaBlazz {
    public static void main(String[] args) {
        EntityManagerFactory abc = Persistence.createEntityManagerFactory("test-pu", new Configuration());
        EntityManager entityManager = abc.createEntityManager();

        entityManager.getTransaction().begin();
        Person person = new Person("jan", "kowalski");
        entityManager.persist(person);
        entityManager.getTransaction().commit();

    }
}
