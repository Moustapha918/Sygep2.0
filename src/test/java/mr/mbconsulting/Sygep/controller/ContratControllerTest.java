package mr.mbconsulting.Sygep.controller;

import mr.mbconsulting.Sygep.model.Contrat;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ContratControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testThatResponseIsOK() throws Exception{
        ResponseEntity<ArrayList> response = restTemplate.getForEntity("/contrats", ArrayList.class);
        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

}