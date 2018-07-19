package mr.mbconsulting.Sygep.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Paiement_Cache")
public class Paiement_Cache extends Paiement {


}
