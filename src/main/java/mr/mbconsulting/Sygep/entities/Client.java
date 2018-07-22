package mr.mbconsulting.Sygep.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private String adresse;



	@ManyToOne(cascade=CascadeType.ALL)
	private Banque banque;

	@JsonIgnore
	@OneToMany(mappedBy="client")
	private List<Contrat>  contrats=new ArrayList<>();

	public Client() {
	}

	public Client(String nom, String prenom, String email, String tel, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.adresse = adresse;
	}

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	public List<Contrat> getContrats() {
		return contrats;
	}

	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}
}
