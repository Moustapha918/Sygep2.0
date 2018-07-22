package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public Client update(Long id, Client client) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
