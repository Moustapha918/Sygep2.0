package mr.mbconsulting.Sygep.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="espece")
public class PaiementParEspece extends Paiement {

	public PaiementParEspece() {
	}

}
