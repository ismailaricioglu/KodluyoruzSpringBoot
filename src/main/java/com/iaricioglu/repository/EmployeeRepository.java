package com.iaricioglu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//JpaRepository>CrudRepository kapsama ifadesi
@Repository
public interface EmployeeRepository extends CrudRepository {
}
