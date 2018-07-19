package mr.mbconsulting.Sygep.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity

public class Contrat implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	private String type;
	private Date date_contrat;
	@JsonIgnore
	@ManyToOne()
	private Client client;
	@JsonIgnore
	@OneToOne()
	private Paiement p;
	@JsonIgnore
	@OneToOne()
	private BienImobilier bienImobilier;


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Date getDate_contrat() {
		return date_contrat;
	}
	public void setDate_contrat(Date date_contrat) {
		this.date_contrat = date_contrat;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	public Paiement getP() {
		return p;
	}
	public void setP(Paiement p) {
		this.p = p;
	}
	public BienImobilier getBienImobilier() {
		return bienImobilier;
	}
	public void setBienImobilier(BienImobilier bienImobilier) {
		this.bienImobilier = bienImobilier;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
