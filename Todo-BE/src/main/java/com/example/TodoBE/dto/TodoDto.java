package com.example.TodoBE.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.datetime.DateFormatter;

import com.example.TodoBE.entities.enumeration.Status;

/**
 * Dto insieme dei dati dell'entity usato per  comunicare con il front-end
 * */

public class TodoDto implements Serializable {
	
	/**
	 * serialVersionUID fa si che la classe possa essere serializzata
	 * */
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String descrizione;
	private Status status;
	private String dataCreazione;
	private String dataScadenza;

	
	
	@Override
	public String toString() {
		return "TodoDto [id=" + id + ", descrizione=" + descrizione + ", status=" + status + ", dataCreazione="
				+ dataCreazione + ", dataScadenza=" + dataScadenza + "]";
	}




	public TodoDto(Long id, String descrizione, Status status, String dataCreazione,
     String dataScadenza) {
		super();
		this.id = id;
		this.descrizione = descrizione;
		this.status = Status.TODO;
		this.status = Status.DONE;
		this.status = Status.IN_PROGRESS;
		this.dataCreazione = dataCreazione;
		this.dataScadenza = dataScadenza;

	}
			
	
		

	public TodoDto() {
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


