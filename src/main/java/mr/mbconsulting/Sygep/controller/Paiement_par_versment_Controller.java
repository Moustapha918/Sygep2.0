package mr.mbconsulting.Sygep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mr.mbconsulting.Sygep.dao.BienImobilierRepostory;
import mr.mbconsulting.Sygep.dao.ClienRepostory;
import mr.mbconsulting.Sygep.dao.ContratRepostory;
import mr.mbconsulting.Sygep.dao.PaiementRepository;
import mr.mbconsulting.Sygep.dao.Paiement_par_versment_Repository;
import mr.mbconsulting.Sygep.entities.Paiement_par_versment;

@RestController
@RequestMapping("/iscan")
public class Paiement_par_versment_Controller {
	@Autowired
	ClienRepostory clienRepostory;
    @Autowired
    ContratRepostory contratRepostory;
    @Autowired
    BienImobilierRepostory bienImobilierRepostory;
    @Autowired
    PaiementRepository paiementRepository;
    @Autowired
    Paiement_par_versment_Repository  paiement_par_versment_Repository;
    @RequestMapping(value="/paiements_versment",method=RequestMethod.GET)
    public List<Paiement_par_versment> listPaiements_par_versment(){
    	return  paiement_par_versment_Repository.findAll();
    	
    }
    @RequestMapping(value="/addpaiement_versment",method=RequestMethod.POST)
	public Paiement_par_versment addPaiement_par_versment(@RequestBody Paiement_par_versment p) {
	return  paiementRepository.save(p);
} 
    @RequestMapping(value="/deletepaiement_versment/{id}",method=RequestMethod.DELETE)
	public boolean delatePaiement_par_versment(@PathVariable Long id) {
    	Paiement_par_versment p= paiement_par_versment_Repository.getOne(id);
    	paiement_par_versment_Repository.delete(p);
     return true;
}   
    @RequestMapping(value="/updatepaiement_versment/{id}",method=RequestMethod.PUT)
	public Paiement_par_versment updaePaiement_par_versment(@PathVariable Long id,@RequestBody Paiement_par_versment p) {
		p.setId(id);
    return  paiement_par_versment_Repository.save(p);
} 

}
