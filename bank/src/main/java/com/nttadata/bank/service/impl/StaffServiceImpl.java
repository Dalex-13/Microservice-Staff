package com.nttadata.bank.service.impl;

import com.nttadata.bank.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttadata.bank.domain.Staff;
import com.nttadata.bank.repository.StaffRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StaffServiceImpl implements StaffService {

	private final StaffRepository repository;

	@Override
	public Mono<Staff> save(Staff staff) {
		return repository.save(staff);
	}

	@Override
	public Flux<Staff> findAll() {
		return repository.findAll();
	}

	@Override
	public Mono<Staff> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Mono<Staff> updateById(String id, Staff staff) {
		return this.findById(id)
				.flatMap(entity -> this.save(staff))
				.switchIfEmpty( Mono.error(new Exception()));
	}


	@Override
	public Mono<Void> delete(String id) {
		return repository.deleteById(id);
	}


}
