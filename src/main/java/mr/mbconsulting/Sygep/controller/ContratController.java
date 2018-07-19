package mr.mbconsulting.Sygep.controller;


import mr.mbconsulting.Sygep.model.Contrat;
import mr.mbconsulting.Sygep.services.ContratService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrats")
public class ContratController {

    private ContratService contratService;

    public ContratController(ContratService contratService) {
        this.contratService = contratService;
    }

    /**
     *
     * @return Contrats from database
     */
    @GetMapping
    public List<Contrat> getAll(){
        return contratService.getAll();
    }

    /**
     *
     * @param contrat
     * @return true if the contract is added to the database
     */
    @PostMapping
    public boolean addContrat(@RequestBody Contrat contrat){
        return contratService.addContrat(contrat);
    }
}
