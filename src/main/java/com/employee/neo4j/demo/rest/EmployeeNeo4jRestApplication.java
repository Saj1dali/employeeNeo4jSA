
package com.employee.neo4j.demo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableNeo4jRepositories
@SpringBootApplication
public class EmployeeNeo4jRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeNeo4jRestApplication.class, args);
	}
}
