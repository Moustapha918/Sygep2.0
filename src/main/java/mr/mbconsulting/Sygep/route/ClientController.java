package mr.mbconsulting.Sygep.route;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mr.mbconsulting.Sygep.model.Client;
import mr.mbconsulting.Sygep.repository.ClientRepository;

@RestController
public class ClientController implements Serializable{
	
	@Autowired
	private ClientRepository clientRepository;
	
	@RequestMapping(value = "/", produces = {"application/json"})
	public String test() {
		return "test";
	}
	
	@PostMapping(value = "/save", produces = {"application/json"})
	public Client saveClient(Client c) {
		clientRepository.save(c);
		return c;
	}
	@RequestMapping("/all")
	public List<Client> allClient() {
		return (List<Client>) clientRepository.findAll();
	}
	
	@RequestMapping("/clients")
	public Page<Client> allClient(int page) {
		return  clientRepository.findAll(new PageRequest(page, 3));
	}
	@RequestMapping("/delete")
	public boolean deletClient(Client c) {
		 clientRepository.delete(c);
		return true;
	}
	@RequestMapping("/update")
	public Client updateClient(Client c) {
		 clientRepository.saveAndFlush(c);
		return c;
	}

}
