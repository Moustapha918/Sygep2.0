package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.entities.Paiement;

import java.util.List;

public interface PaiementService{
    List<Paiement> getAll();
    Paiement addPaiement(Paiement paiement);
    boolean delete(Long id);
    Paiement update(Long id, Paiement paiement);
}
