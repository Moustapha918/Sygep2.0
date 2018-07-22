package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.entities.BienImmobilier;

import java.util.List;

public interface BienImmobilierService {
    List<BienImmobilier> getAll();
    BienImmobilier save(BienImmobilier bienImmobilier);
    BienImmobilier update(Long id, BienImmobilier bienImmobilier);
    boolean delete(Long id);
}
