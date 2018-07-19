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
import mr.mbconsulting.Sygep.entities.BienImobilier;


@RestController
@RequestMapping("/iscan")
public class BienImobilierController {
	 @Autowired
		ClienRepostory clienRepostory;
	    @Autowired
	    ContratRepostory contratRepostory;
	    @Autowired
	    BienImobilierRepostory bienImobilierRepostory;
	    @RequestMapping(value="/bienimobiliers",method=RequestMethod.GET)
	    public List<BienImobilier> listBienImobiliers(){
	    	return bienImobilierRepostory.findAll();
	    	
	    }
	    @RequestMapping(value="/addbienimobilier",method=RequestMethod.POST)
		public BienImobilier addBienImobilier(@RequestBody BienImobilier b) {
		return bienImobilierRepostory.save(b);
	} 
	    @RequestMapping(value="/deletebienimobilier/{id}",method=RequestMethod.DELETE)
		public boolean delateBienImobilier(@PathVariable Long id) {
	    	BienImobilier b=bienImobilierRepostory.getOne(id);
			bienImobilierRepostory.delete(b);
	     return true;
	}   
	    @RequestMapping(value="/updatebienimobilier/{id}",method=RequestMethod.PUT)
		public BienImobilier updaeBienImobilier(@PathVariable Long id,@RequestBody BienImobilier b) {
			b.setId(id);
	    return bienImobilierRepostory.save(b);
	} 
	

}
