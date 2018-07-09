package com.prsk.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class BienImobilier implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	public BienImobilier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public BienImobilier(String type) {
		super();
		this.type = type;
	}
	@OneToOne(mappedBy="bienImobilier")
	private Contrat  contrat;
	
	
	
	private String type ;
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
