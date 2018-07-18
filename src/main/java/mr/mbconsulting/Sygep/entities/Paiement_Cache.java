package mr.mbconsulting.Sygep.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Paiement_Cache")
public class Paiement_Cache extends Paiement {

	public Paiement_Cache() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	

}
