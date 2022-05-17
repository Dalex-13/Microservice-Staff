package com.nttadata.bank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.nttadata.bank.domain.Staff;

@Repository
public interface StaffRepository extends ReactiveCrudRepository<Staff, String>{

}
