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
import mr.mbconsulting.Sygep.entities.Contrat;


@RestController
@RequestMapping("/iscan")
public class ContratController {
	 	@Autowired
	    ContratRepostory contratRepostory;

	    @RequestMapping(value="/contrats",method=RequestMethod.GET)
	    public List<Contrat> listContrats(){
	    	return contratRepostory.findAll();
	    	
	    }
	    @RequestMapping(value="/addcontrat",method=RequestMethod.POST)
		public Contrat addContrat(@RequestBody Contrat c) {
		return contratRepostory.save(c);
	} 
	    @RequestMapping(value="/deletecontrat/{id}",method=RequestMethod.DELETE)
		public boolean delateContrat(@PathVariable Long id) {
	    	Contrat c=contratRepostory.getOne(id);
	    	contratRepostory.delete(c);
	     return true;
	}   
	    @RequestMapping(value="/updatecontrat/{id}",method=RequestMethod.PUT)
		public Contrat updaeContrat(@PathVariable Long id,@RequestBody Contrat c) {
			c.setId(id);
	    return contratRepostory.save(c);
	} 

}
