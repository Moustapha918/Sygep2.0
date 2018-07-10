package mr.mbconsulting.Sygep.model;

import javax.persistence.*;

@Entity
public class Payement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="contract_id")
    private Contrat contrat;
}
