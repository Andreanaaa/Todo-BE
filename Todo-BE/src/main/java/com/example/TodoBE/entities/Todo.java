package com.example.TodoBE.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.example.TodoBE.entities.enumeration.Status;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * Mappatura tabella
 * */

@Entity
@Table(name="todo1")
public class Todo implements Serializable {

	/**
	 * serialVersionUID fa si che la classe possa essere serializzata
	 * */
	private static final long serialVersionUID = 4506415152685582096L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="descrizione")
	private String descrizione;	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private Status status;
	@Column(name="data_creazione")
	private String dataCreazione;
	@Column(name="data_scadenza")
	private String dataScadenza;
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", descrizione=" + descrizione + ", status=" + status + ", dataCreazione="
				+ dataCreazione + ", dataScadenza=" + dataScadenza + "]";
	}
	public Todo(Long id, String descrizione, Status status, String dataCreazione, String dataScadenza) {
		super();
		this.id = id;
		this.descrizione = descrizione;
		this.status= Status.TODO;
		this.status = Status.DONE;
		this.status = Status.IN_PROGRESS;
		this.dataCreazione = dataCreazione;
		this.dataScadenza = dataScadenza;
	}
	public Todo() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(String dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	public String getDataScadenza() {
		return dataScadenza;
	}
	public void setDataScadenza(String dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	
	
	
}

