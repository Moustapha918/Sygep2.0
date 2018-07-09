package mr.mbconsulting.Sygep.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import mr.mbconsulting.Sygep.model.Client;
import mr.mbconsulting.Sygep.repository.ClientRepository;

@RestController
@RequestMapping("/client")
public class ClientController implements Serializable{
	
	@Autowired
	private ClientRepository clientRepository;
	
	@RequestMapping("/")
	public String test() {
		return "test";
	}
	
	@GetMapping("/save")
	public Client saveClient(Client c) {
		clientRepository.save(c);
		return c;
	}
	@CrossOrigin
	@GetMapping(value = "/all", produces = "application/json")
	public List<Client> allClient() {


		Client client1 = new Client();
		client1.setNom("BOUFAL");
		client1.setPrenom("Salem");

		Client client3 = new Client();
		client3.setNom("Ibrahim");
		client3.setPrenom("KHADI");

		Client client2 = new Client();
		client2.setNom("Ibrahim");
		client2.setPrenom("KHADI");

		List<Client> clients = new ArrayList<>();

		clients.add(client1);
		clients.add(client2);
		clients.add(client3);

		return clients;

		//return (List<Client>) clientRepository.findAll();
	}
	
	/*@RequestMapping("/clients")
	public Page<Client> allClient(int page) {
		return  clientRepository.findAll(new PageRequest(page, 3));
	}*/
	@RequestMapping("/delete")
	public boolean deletClient(Client c) {
		 clientRepository.delete(c);
		return true;
	}
	/*@RequestMapping("/update")
	public Client updateClient(Client c) {
		 clientRepository.saveAndFlush(c);
		return c;
	}*/

}
