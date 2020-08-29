package com.marin.bankrecords.data.repository;

import com.marin.bankrecords.data.entitiy.Records;
import org.springframework.data.repository.CrudRepository;

public interface RecordsRepository extends CrudRepository<Records, Integer> {
}
