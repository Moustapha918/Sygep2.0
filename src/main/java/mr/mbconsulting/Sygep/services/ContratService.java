package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.entities.Contrat;


import java.util.List;

public interface ContratService {
    Contrat save(Contrat contrat);
    List<Contrat> getAll();
    Contrat update(Long id, Contrat contrat);
    boolean delete(Long id);

}
