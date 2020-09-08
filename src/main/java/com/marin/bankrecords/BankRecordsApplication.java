package com.marin.bankrecords;

import com.marin.bankrecords.data.entitiy.Clients;
import com.marin.bankrecords.data.entitiy.Records;
import com.marin.bankrecords.data.repository.ClientsRepository;
import com.marin.bankrecords.data.repository.RecordsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BankRecordsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BankRecordsApplication.class, args);


		// ADDED TO BE ABLE TO ADD TEST DATA IN DATABASE
		RecordsRepository recordsRepository = context.getBean(RecordsRepository.class);
		ClientsRepository clientsRepository = context.getBean(ClientsRepository.class);

		Records record = new Records("Invoice");
		Clients client = new Clients("Test Name", "Rich");
		client.addRecord(record);

		recordsRepository.save(record);
		clientsRepository.save(client);

	}

}
