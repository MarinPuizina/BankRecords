package com.marin.bankrecords.data.repository;

import com.marin.bankrecords.data.entitiy.Clients;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest

@DisplayName("<= Clients Repository Test =>")
class ClientsRepositoryTest {

    @Autowired
    ClientsRepository clientsRepository;

    @Test
    void clientsRepositoryShouldSaveClient() {

        Clients client = clientsRepository.save(new Clients("Test Name", "Rich"));

        assertNotNull(client);
        assertTrue(client.getId() > 0);

    }

}