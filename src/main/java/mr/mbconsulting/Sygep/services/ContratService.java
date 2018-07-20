package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.entities.Contrat;
import mr.mbconsulting.Sygep.repository.ContratRepository;

import java.util.List;

public interface ContratService {
    boolean addContrat(Contrat contrat);
    List<Contrat> getAll();
}
