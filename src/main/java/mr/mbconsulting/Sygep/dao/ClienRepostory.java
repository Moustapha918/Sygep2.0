package  mr.mbconsulting.Sygep.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mr.mbconsulting.Sygep.entities.Client;



public interface ClienRepostory extends JpaRepository<Client, Long> {

}
