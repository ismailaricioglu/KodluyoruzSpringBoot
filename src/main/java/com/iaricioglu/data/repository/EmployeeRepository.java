package com.iaricioglu.data.repository;

import com.iaricioglu.data.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//JpaRepository>CrudRepository kapsama ifadesi
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
