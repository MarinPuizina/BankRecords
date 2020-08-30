package com.marin.bankrecords.data.repository;

import com.marin.bankrecords.data.entitiy.Clients;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends CrudRepository<Clients, Integer> {
}
