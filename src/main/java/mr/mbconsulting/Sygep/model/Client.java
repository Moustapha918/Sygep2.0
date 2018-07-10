package mr.mbconsulting.Sygep.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	public Client(String nom, List<Contrat> contrats) {
		super();
		this.nom = nom;
		this.contrats = contrats;
	}
	public Client(String nom) {
		super();
		this.nom = nom;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Contrat> getContrats() {
		return contrats;
	}
	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}
	
	private String nom;
	@OneToMany(mappedBy="client")
	private List<Contrat>  contrats=new ArrayList<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void addContrat(Contrat contrat){
		this.getContrats().add(contrat);
		contrat.setClient(this) ;
	}
}
