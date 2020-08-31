package com.marin.bankrecords.data.repository;

import com.marin.bankrecords.data.entitiy.Clients;
import com.marin.bankrecords.data.entitiy.Records;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest

@DisplayName("<= Clients and Records Many To Many Test")
public class ClientsRecordsManyToManyTest {

    @Autowired
    ClientsRepository clientsRepository;

    @Autowired
    RecordsRepository recordsRepository;

    @Test
    void manyToManyShouldSaveData() {

        Records record = new Records("Invoice");
        Clients client = new Clients("Test Name", "Rich");
        client.addRecord(record);

        Clients clientTest = clientsRepository.save(client);

    }

}
