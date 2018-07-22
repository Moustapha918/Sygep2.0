package mr.mbconsulting.Sygep.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="cheque")
public class PaiementParCheque extends Paiement{
	private String numeroCheque;

	public PaiementParCheque() {
	}

	public PaiementParCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	public String getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}
}
