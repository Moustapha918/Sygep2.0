package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.entities.Paiement;
import mr.mbconsulting.Sygep.repository.PaiementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementServiceImpl implements PaiementService{

    private PaiementRepository paiementRepository;

    public PaiementServiceImpl(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    @Override
    public List<Paiement> getAll() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public Paiement update(Long id, Paiement paiement) {
        return null;
    }
}
