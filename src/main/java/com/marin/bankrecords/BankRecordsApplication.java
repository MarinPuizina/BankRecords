package com.marin.bankrecords;

import com.marin.bankrecords.data.entitiy.Clients;
import com.marin.bankrecords.data.entitiy.Records;
import com.marin.bankrecords.data.repository.ClientsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BankRecordsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BankRecordsApplication.class, args);

		ClientsRepository clientsRepository = context.getBean(ClientsRepository.class);

		Records record = new Records("Invoice");
		Clients client = new Clients("Test Name", "Rich");
		client.addRecord(record);

		clientsRepository.save(client);

	}

}
