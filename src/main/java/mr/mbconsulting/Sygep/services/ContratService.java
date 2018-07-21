package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.entities.Contrat;
import mr.mbconsulting.Sygep.repository.ContratRepository;

import java.util.List;

public interface ContratService {
    Contrat save(Contrat contrat);
    List<Contrat> getAll();
    Contrat update(Long id, Contrat contrat);
    boolean delete(Long id);

}
