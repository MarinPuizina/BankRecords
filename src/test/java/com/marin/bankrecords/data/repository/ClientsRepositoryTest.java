package com.marin.bankrecords.data.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ClientsRepositoryTest {

    @Autowired
    ClientsRepository clientsRepository;

}