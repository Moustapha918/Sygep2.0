package  mr.mbconsulting.Sygep.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contrat implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String type;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_idClient")
	private Client client;

	@ManyToOne(cascade=CascadeType.ALL)
	private BienImmobilier bienImmobilier;

	@ManyToOne(cascade = CascadeType.ALL)
	private Paiement paiement;

	public Contrat() {
	}

	public Contrat(String type, Client client, BienImmobilier bienimobilier) {
		super();
		this.type = type;
		this.client = client;
		
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	

	public BienImmobilier getBienImmobilier() {
		return bienImmobilier;
	}
	public void setBienImmobilier(BienImmobilier bienImmobilier) {
		this.bienImmobilier = bienImmobilier;
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

	public Paiement getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	@Override
	public String toString() {
		return "Contrat{" +
				"id=" + id +
				", type='" + type + '\'' +
				", client=" + client.getId() +
				", bienImobilier=" + bienImmobilier.getId() +
				'}';
	}
}
