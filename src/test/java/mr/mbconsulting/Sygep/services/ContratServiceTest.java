package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.model.Contrat;
import mr.mbconsulting.Sygep.repository.ContratRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContratServiceTest {

    @MockBean
    private ContratRepository mockRepository;

    @Autowired
    private ContratService contratService;



    @Test
    public void assertThatContratServiceIsAutowired(){
        assertNotNull(contratService);
        assertNotNull(mockRepository);
    }

    @Test
    public void assertThatAddContratReturnFalseIfNotValid(){
        Contrat contrat = new Contrat();
        assertFalse(contratService.addContrat(null));
        assertFalse(contratService.addContrat(contrat));
    }


}