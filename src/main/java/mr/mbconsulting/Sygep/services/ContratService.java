package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.model.Contrat;
import mr.mbconsulting.Sygep.repository.ContratRepository;

import java.util.List;

public interface ContratService {
    boolean addContrat(Contrat contrat);

    List<Contrat> getAll();
}
