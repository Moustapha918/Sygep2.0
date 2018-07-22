package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.entities.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAll();
    Client save(Client client);
    Client update(Long id, Client client);
    boolean delete(Long id);
}
