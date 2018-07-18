package mr.mbconsulting.Sygep.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Paiement__par_cheque")
public class Paiement_par_cheque extends Paiement{
	private String num_cheque;

	public Paiement_par_cheque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNum_cheque() {
		return num_cheque;
	}

	public void setNum_cheque(String num_cheque) {
		this.num_cheque = num_cheque;
	}

	public Paiement_par_cheque(String num_cheque) {
		super();
		this.num_cheque = num_cheque;
	}

}
