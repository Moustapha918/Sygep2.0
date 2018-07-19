package mr.mbconsulting.Sygep.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class BienImobilier implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	private Double prix;
	private String code;
	private String intitule;
	private Boolean etat;
	@OneToMany(mappedBy = "bienImobilier")
	private List<Contrat> contrats;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}


}
