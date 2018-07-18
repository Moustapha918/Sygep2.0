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
import mr.mbconsulting.Sygep.entities.Client;
@RestController
@RequestMapping("/iscan")
class ClientController {
    @Autowired
	ClienRepostory clienRepostory;
    @Autowired
    ContratRepostory contratRepostory;
    @Autowired
    BienImobilierRepostory bienImobilierRepostory;
    @RequestMapping(value="/clients",method=RequestMethod.GET)
    public List<Client> listClient(){
    	return clienRepostory.findAll();
    	
    }
    @RequestMapping(value="/addclient",method=RequestMethod.POST)
	public Client addClient(@RequestBody Client c) {
	return clienRepostory.save(c);
} 
    @RequestMapping(value="/client/{id}",method=RequestMethod.DELETE)
	public boolean delateClient(@PathVariable Long id) {
		Client c=clienRepostory.getOne(id);
		clienRepostory.delete(c);
     return true;
}   
    @RequestMapping(value="/client/{id}",method=RequestMethod.PUT)
	public Client updaeClient(@PathVariable Long id,@RequestBody Client c) {
		c.setId(id);
    return clienRepostory.save(c);
} 

}
