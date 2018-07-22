package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.entities.BienImmobilier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BienImmobilierServiceImpl implements BienImmobilierService {
    @Override
    public List<BienImmobilier> getAll() {
        return null;
    }

    @Override
    public BienImmobilier save(BienImmobilier bienImmobilier) {
        return null;
    }

    @Override
    public BienImmobilier update(Long id, BienImmobilier bienImmobilier) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
