package com.nttadata.bank.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;


@Document(collection = "usuarios")
@Data
public class Staff{

	@Id
	private String id;
	
	@NotEmpty
	private String name;
	@NotNull
	private String surname;
	private String phone;
	private String accountSaving;//cuenta de ahorro
	private String accountAccount;//cuenta corriente
	private String accountPermanent;//cuenta fijo
	private String creditCard;//tarjeta de credito
	
}
