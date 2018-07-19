package mr.mbconsulting.Sygep.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Paiement_par_versment")
public class Paiement_par_versment extends Paiement {
	private String num_recu;

	public String getNum_recu() {
		return num_recu;
	}

	public void setNum_recu(String num_recu) {
		this.num_recu = num_recu;
	}
}
