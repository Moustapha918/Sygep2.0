package mr.mbconsulting.Sygep.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class BienImobilier implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	private Double prix;
	private String code;
	private String intitule;
	private Boolean etat;
	public BienImobilier(Double prix, String code, String intitule, Boolean etat) {
		super();
		this.prix = prix;
		this.code = code;
		this.intitule = intitule;
		this.etat = etat;
	}
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public BienImobilier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BienImobilier(Double prix, String code, String intitule, Contrat c) {
		super();
		this.prix = prix;
		this.code = code;
		this.intitule = intitule;
		this.c = c;
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
	
	public Contrat getC() {
		return c;
	}
	public void setC(Contrat c) {
		this.c = c;
	}
	@OneToOne()
	private Contrat c;
	
	public BienImobilier(Double prix, String code, String intitule) {
		super();
		this.prix = prix;
		this.code = code;
		this.intitule = intitule;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
