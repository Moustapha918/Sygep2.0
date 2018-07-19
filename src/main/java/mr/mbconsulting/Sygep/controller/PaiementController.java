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
import mr.mbconsulting.Sygep.entities.Paiement;
@RestController
@RequestMapping("/iscan")
public class PaiementController {
	@Autowired
	ClienRepostory clienRepostory;
    @Autowired
    ContratRepostory contratRepostory;
    @Autowired
    BienImobilierRepostory bienImobilierRepostory;
    @Autowired
    PaiementRepository paiementRepository;
    @RequestMapping(value="/paiements",method=RequestMethod.GET)
    public List<Paiement> listPaiements(){
    	return  paiementRepository.findAll();
    	
    }
    @RequestMapping(value="/addpaiement",method=RequestMethod.POST)
	public Paiement addPaiement(@RequestBody Paiement p) {
	return  paiementRepository.save(p);
} 
    @RequestMapping(value="/deletepaiement/{id}",method=RequestMethod.DELETE)
	public boolean delatePaiement(@PathVariable Long id) {
    	Paiement p= paiementRepository.getOne(id);
    	 paiementRepository.delete(p);
     return true;
}   
    @RequestMapping(value="/updatepaiement/{id}",method=RequestMethod.PUT)
	public Paiement updaePaiement(@PathVariable Long id,@RequestBody Paiement p) {
		p.setId(id);
    return  paiementRepository.save(p);
} 

}
