package mr.mbconsulting.Sygep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mr.mbconsulting.Sygep.entities.Paiement;
import org.springframework.data.repository.NoRepositoryBean;


public interface PaiementRepository extends JpaRepository<Paiement, Long>{

}
