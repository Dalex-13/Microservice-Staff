package com.nttadata.bank.service;

import com.nttadata.bank.domain.Staff;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StaffService {
	
	public Mono<Staff> save(Staff staff);

	public Flux<Staff> findAll();

	public Mono<Staff> findById(String id);

	public Mono<Staff> updateById(String id, Staff staff);

	public Mono<Void> delete(String id);
}


