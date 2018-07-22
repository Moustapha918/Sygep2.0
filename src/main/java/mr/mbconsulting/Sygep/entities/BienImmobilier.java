package mr.mbconsulting.Sygep.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class BienImmobilier implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	private double prix;
	private String code;
	private String intitule;
	private boolean disponible;

	@OneToMany(mappedBy = "bienImmobilier", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Contrat> contrats;

	public BienImmobilier() {
	}

	public BienImmobilier(double prix, String code, String intitule, boolean disponible) {
		this.prix = prix;
		this.code = code;
		this.intitule = intitule;
		this.disponible = disponible;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
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

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public List<Contrat> getContrats() {
		return contrats;
	}

	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}
}
