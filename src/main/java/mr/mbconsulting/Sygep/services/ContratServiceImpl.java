package mr.mbconsulting.Sygep.services;


import mr.mbconsulting.Sygep.entities.Contrat;
import mr.mbconsulting.Sygep.repository.ContratRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratServiceImpl implements ContratService {

    private ContratRepository contratRepository;

    public ContratServiceImpl(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    /**
     * @return Contrats from database
     */
    @Override
    public List<Contrat> getAll() {
        return contratRepository.findAll();
    }

    /**
     * @param contrat
     * @return true if the contract is added to the database
     */
    @Override
    public Contrat save(Contrat contrat) {
        return null;
    }

    @Override
    public Contrat update(Long id, Contrat contrat) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    /**
     * @param contrat
     * @return true if contrat contrsaints is valid otherwise false
     */
    private boolean isValid(Contrat contrat) {
        return contrat != null && contrat.getBienImmobilier() != null && contrat.getClient() != null && !contrat.getType().equals("");
    }


}
