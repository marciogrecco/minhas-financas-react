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

@Entity
@Table(name = "lancamento")
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(LocalDate datacadastro) {
		this.datacadastro = datacadastro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lancamento [id=");
		builder.append(id);
		builder.append(", mes=");
		builder.append(mes);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", datacadastro=");
		builder.append(datacadastro);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append(", lancamento=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

}
