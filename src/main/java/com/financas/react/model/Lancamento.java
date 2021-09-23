package com.financas.react.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.financas.react.model.enun.StatusLancamento;
import com.financas.react.model.enun.TipoLancamento;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "lancamento")
@Data
public class Lancamento {

	@Column(name = "id")
	private Integer id;
	
	@Column(name = "descricao")
	private String descricao;

	@Column(name = "mes")
	private Integer mes;

	@Column(name = "ano")
	private Integer ano;

	@Column(name = "valor")
	private BigDecimal valor;

	@Column(name = "data_cadastro")
	@Convert(converter = Jsr310JpaConverters.class)
	private LocalDate datacadastro;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@Column(name = "tipo")
	@Enumerated(EnumType.STRING)
	private TipoLancamento tipo;

	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private StatusLancamento status;


}
