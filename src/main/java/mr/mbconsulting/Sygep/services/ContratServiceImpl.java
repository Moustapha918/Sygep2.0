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
     *
     * @return Contrats from database
     */
    @Override
    public List<Contrat> getAll() {
        return contratRepository.findAll();
    }

    /**
     *
     * @param contrat
     * @return true if the contract is added to the database
     */
    @Override
    public boolean addContrat(Contrat contrat) {
        if(isValid(contrat)){
            contrat = contratRepository.save(contrat);

            return contrat.getId() > 0;
        }
        return false;
    }

    /**
     *
     * @param contrat
     * @return true if contrat contrsaints is valid otherwise false
     */
    private boolean isValid(Contrat contrat){
        return contrat != null && contrat.getBienImobilier() != null && contrat.getClient() != null && !contrat.getType().equals("");
    }
}
