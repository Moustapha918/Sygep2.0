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
import mr.mbconsulting.Sygep.dao.Paiement_cache_Repository;
import mr.mbconsulting.Sygep.entities.Paiement_Cache;


@RestController
@RequestMapping("/iscan")
public class Paiement_cache_Controller {
	@Autowired
	ClienRepostory clienRepostory;
    @Autowired
    ContratRepostory contratRepostory;
    @Autowired
    BienImobilierRepostory bienImobilierRepostory;
    @Autowired
    PaiementRepository paiementRepository;
    @Autowired
    Paiement_cache_Repository paiement_cache_Repository;
    @RequestMapping(value="/paiements_cache",method=RequestMethod.GET)
    public List<Paiement_Cache> listPaiements_cache(){
    	return  paiement_cache_Repository.findAll();
    	
    }
    @RequestMapping(value="/addpaiement_cache",method=RequestMethod.POST)
	public Paiement_Cache addPaiement_cache(@RequestBody Paiement_Cache p) {
	return  paiement_cache_Repository.save(p);
} 
    @RequestMapping(value="/deletepaiement_cache/{id}",method=RequestMethod.DELETE)
	public boolean delatePaiement_cache(@PathVariable Long id) {
    	Paiement_Cache p=paiement_cache_Repository.getOne(id);
    	 paiementRepository.delete(p);
     return true;
}   
    @RequestMapping(value="/updatepaiement_cache/{id}",method=RequestMethod.PUT)
	public Paiement_Cache updaePaiement_cache(@PathVariable Long id,@RequestBody Paiement_Cache p) {
		p.setId(id);
    return  paiement_cache_Repository.save(p);
} 

}
