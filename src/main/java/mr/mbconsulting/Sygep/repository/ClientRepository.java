package mr.mbconsulting.Sygep.repository;

import mr.mbconsulting.Sygep.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ClientRepository extends JpaRepository<Client,Long> {
    public List<Client> findByNom(String name);
}
