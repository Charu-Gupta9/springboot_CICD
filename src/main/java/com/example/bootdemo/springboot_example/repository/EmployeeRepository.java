package com.example.bootdemo.springboot_example.repository;

import  com.example.bootdemo.springboot_example.entity.Employee;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee , Long> {

    // Repository providing db operations

    List<Employee> findAllByName(String name); //variable name as given in entity
}
