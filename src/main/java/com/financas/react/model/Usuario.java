package com.financas.react.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "user", schema = "financas")
@Data
@Builder
public class Usuario {

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String nome;
	@Column(name = "password")
	private String password;

	
}
