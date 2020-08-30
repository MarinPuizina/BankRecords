package com.marin.bankrecords.data.repository;

import com.marin.bankrecords.data.entitiy.Records;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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