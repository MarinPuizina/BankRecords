package com.marin.bankrecords.data.repository;

import com.marin.bankrecords.data.entitiy.Records;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest

@DisplayName("<= Records Repository Test =>")
class RecordsRepositoryTest {

    @Autowired
    RecordsRepository recordsRepository;

    @Test
    void recordsRepositoryShouldSaveRecord() {

        Records record = recordsRepository.save(new Records("Invoice"));

        assertNotNull(record);

    }

}