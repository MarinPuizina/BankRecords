package com.marin.bankrecords.data.repository;

import com.marin.bankrecords.data.entitiy.Clients;
import org.springframework.data.repository.CrudRepository;

public interface ClientsRepository extends CrudRepository<Clients, Integer> {
}
