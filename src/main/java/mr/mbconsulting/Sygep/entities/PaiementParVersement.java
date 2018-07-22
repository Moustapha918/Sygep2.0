package mr.mbconsulting.Sygep.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="versement")
public class PaiementParVersement extends Paiement {
	private String numeroRecu;

	public PaiementParVersement() {
	}

	public PaiementParVersement(String numeroRecu) {
		this.numeroRecu = numeroRecu;
	}

	public String getNumeroRecu() {
		return numeroRecu;
	}

	public void setNumeroRecu(String numeroRecu) {
		this.numeroRecu = numeroRecu;
	}
}
