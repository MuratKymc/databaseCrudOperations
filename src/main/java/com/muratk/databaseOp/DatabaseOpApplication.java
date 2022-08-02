package com.muratk.databaseOp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseOpApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseOpApplication.class, args);
	}
	
	@Bean
	CommandLineRunner databasePopulator(CustomerRepository repository){
		return args ->{
			repository.save(new Customer("Murat",21));
			repository.save(new Customer("Sadık",21));
			repository.save(new Customer("Serkan",19));
			repository.save(new Customer("Hasan",24));
			repository.save(new Customer("Cansel",27));
			repository.save(new Customer("Seda",21));
		};
		
	}
	
}
