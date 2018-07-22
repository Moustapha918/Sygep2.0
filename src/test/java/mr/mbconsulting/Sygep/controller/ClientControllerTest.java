package mr.mbconsulting.Sygep.controller;

import mr.mbconsulting.Sygep.entities.Client;
import mr.mbconsulting.Sygep.repository.BienImobilierRepostory;
import mr.mbconsulting.Sygep.repository.ClientRepository;
import mr.mbconsulting.Sygep.repository.ContratRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@DataJpaTest

public class ClientControllerTest {


    @Autowired
    ClientRepository clienRepostory;
    @Autowired
    ContratRepository contratRepostory;
    @Autowired
    BienImobilierRepostory bienImobilierRepostory;
    @Test

    public void listClient() {
    }
    @Test
    public void addClient() {

        Client c1 = new Client();
        c1.setNom("pomme");
        c1.setPrenom("Brahim");
        c1.setAdresse("90 RUE");

        clienRepostory.save(c1);
    }

    @Test
    public void deleteClient() {
    }

    @Test
    public void updateClient() {
    }
}