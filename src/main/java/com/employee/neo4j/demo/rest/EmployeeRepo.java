package com.employee.neo4j.demo.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")

public interface EmployeeRepo extends PagingAndSortingRepository<EmployeeInfo, Long> {
	
	
}


