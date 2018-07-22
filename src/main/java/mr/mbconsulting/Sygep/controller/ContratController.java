package mr.mbconsulting.Sygep.controller;

import mr.mbconsulting.Sygep.entities.Contrat;
import mr.mbconsulting.Sygep.services.ContratService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrats")
@CrossOrigin("*")
public class ContratController {

    private Logger logger = LoggerFactory.getLogger(ContratController.class);

    private ContratService contratService;

    public ContratController(ContratService contratService) {
        this.contratService = contratService;
    }

    /**
     *
     * @return Contrats from database
     */
    @GetMapping("/all")
    public List<Contrat> getAll(){
    	return contratService.getAll();
	}

    /**
     *
     * @param contrat
     * @return true if the contract is added to the database
     */
    @PostMapping("/add")
    public Contrat addContrat(@RequestBody Contrat contrat){
        logger.info("receive object "+contrat);
        return contratService.save(contrat);
    }

    @PutMapping("/update/{id}")
    public Contrat update(@PathVariable("id") Long id, @RequestBody Contrat contrat){
    	return contratService.update(id,contrat);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") Long id){
    	return contratService.delete(id);
	}
}
