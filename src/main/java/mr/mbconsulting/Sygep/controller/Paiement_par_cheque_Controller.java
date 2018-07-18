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
import mr.mbconsulting.Sygep.dao.Paiement_par_cheque_Repository;
import mr.mbconsulting.Sygep.entities.Paiement_par_cheque;

@RestController
@RequestMapping("/iscan")
public class Paiement_par_cheque_Controller {
	@Autowired
	ClienRepostory clienRepostory;
    @Autowired
    ContratRepostory contratRepostory;
    @Autowired
    BienImobilierRepostory bienImobilierRepostory;
    @Autowired
    PaiementRepository paiementRepository;
    @Autowired
    Paiement_par_cheque_Repository paiement_par_cheque_Repository;
    @RequestMapping(value="/paiements_par_cheque",method=RequestMethod.GET)
    public List<Paiement_par_cheque> listPaiements_par_cheque(){
    	return  paiement_par_cheque_Repository.findAll();
    	
    }
    @RequestMapping(value="/addpaiement_par_cheque",method=RequestMethod.POST)
	public Paiement_par_cheque addPaiement_par_cheque(@RequestBody Paiement_par_cheque p) {
	return  paiement_par_cheque_Repository.save(p);
} 
    @RequestMapping(value="/deletepaiement_par_cheque/{id}",method=RequestMethod.DELETE)
	public boolean delatePaiement_par_cheque(@PathVariable Long id) {
    	Paiement_par_cheque p= paiement_par_cheque_Repository.getOne(id);
    	paiement_par_cheque_Repository.delete(p);
     return true;
}   
    @RequestMapping(value="/updatepaiement_par_cheque/{id}",method=RequestMethod.PUT)
	public Paiement_par_cheque updaePaiement_par_cheque(@PathVariable Long id,@RequestBody Paiement_par_cheque p) {
		p.setId(id);
    return  paiement_par_cheque_Repository.save(p);
} 

}
