package com.nttadata.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nttadata.bank.domain.Staff;
import com.nttadata.bank.service.StaffService;


import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api")
public class StaffController {
	
	@Autowired
	private StaffService service;
	
	
	@PostMapping("/add")
    public Mono<Staff> post( @RequestBody Staff staff){
        log.info("creación de usuario");
        return service.save(staff);
    }

    @GetMapping("/listar")
    public Flux<Staff> listAll(){
        log.info("listar todo los usuarios");
        return service.findAll();
    }

    @GetMapping("/listar/{id}")
    public Mono<Staff> listById(@PathVariable String id){
        log.info("listando usuario por Id");
        return service.findById(id);
    }

    @PutMapping("/actualizar/{id}")
    public Mono<Staff> putById(@PathVariable String id, @RequestBody  Staff staff){
        log.info("Actualizando usuario por Id");
        return service.updateById(id, staff);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteById(@PathVariable String id){
        log.info("Borrando Usuario por Id");
        return service.delete(id);
    }
}
