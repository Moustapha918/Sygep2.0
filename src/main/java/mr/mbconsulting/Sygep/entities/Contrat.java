package mr.mbconsulting.Sygep.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

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
	@OneToMany(mappedBy = "contrat")
	private List<Paiement> paiements;
	@JsonIgnore
	@ManyToOne
	private BienImobilier bienImobilier;

	public List<Paiement> getPaiements() {
		return paiements;
	}

	public void setPaiements(List<Paiement> paiements) {
		this.paiements = paiements;
	}

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
