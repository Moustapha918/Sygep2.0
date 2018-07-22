package mr.mbconsulting.Sygep.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mr.mbconsulting.Sygep.entities.Client;

import mr.mbconsulting.Sygep.services.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/clients")
public class ClientController implements Serializable{

	private ClientService clientService;

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	@GetMapping("/all")
	public List<Client> getAll() {


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

		//return (List<Client>) clientService.findAll();
	}

	@PostMapping("/add")
	public Client save(@RequestBody Client c) {
		return clientService.save(c);
	}

	@PutMapping("/update/{id}")
	public Client update(@PathVariable("id") Long id, @RequestBody Client client){
		return clientService.update(id,client);
	}


	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") Long id) {
		 return clientService.delete(id);
	}

}
