package mr.mbconsulting.Sygep.entities;

import java.io.Serializable;
import java.util.Date;

import java.util.List;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PAIEMENT")
public abstract class Paiement implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 

	private Date datePaiement;
	private double montant;

	@OneToMany(mappedBy = "paiement", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Contrat> contrats;

	public Paiement() {
	}

	public Paiement(Date datePaiement, double montant) {
		this.datePaiement = datePaiement;
		this.montant = montant;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public List<Contrat> getContrats() {
		return contrats;
	}

	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}
}
