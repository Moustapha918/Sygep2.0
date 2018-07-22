package mr.mbconsulting.Sygep.controller;

import java.util.List;

import mr.mbconsulting.Sygep.services.PaiementService;

import org.springframework.web.bind.annotation.*;

import mr.mbconsulting.Sygep.entities.Paiement;

@RestController
@RequestMapping("/paiments")
public class PaiementController {

    private PaiementService paiementService;

    public PaiementController(PaiementService paiementService) {
        this.paiementService = paiementService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Paiement> listPaiements() {
        return paiementService.getAll();

    }

    @PostMapping("/add")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean delatePaiement(@PathVariable("id") Long id) {
        return paiementService.delete(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Paiement updaePaiement(@PathVariable("id") Long id, @RequestBody Paiement paiement) {
        return paiementService.update(id,paiement);
    }

}
