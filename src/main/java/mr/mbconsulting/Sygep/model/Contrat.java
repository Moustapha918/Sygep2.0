package com.prsk.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Contrat implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	public Contrat(String type, Client client, BienImobilier bienimobilier) {
		super();
		this.type = type;
		this.client = client;
		
	}
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	private String type;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_idClient")
	private Client client;
	@OneToOne(cascade=CascadeType.ALL)
	//@NotEmpt
	private BienImobilier bienImobilier;
	
	public BienImobilier getBienImobilier() {
		return bienImobilier;
	}
	public void setBienImobilier(BienImobilier bienImobilier) {
		this.bienImobilier = bienImobilier;
	}
	public Contrat(String type) {
		super();
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
