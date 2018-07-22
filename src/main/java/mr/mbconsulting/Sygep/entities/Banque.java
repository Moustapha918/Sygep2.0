package mr.mbconsulting.Sygep.entities;

import java.io.Serializable;

import java.util.List;

import javax.persistence.*;

@Entity
public class Banque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String nom;

    @OneToMany(mappedBy = "banque", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Client> clients;

    public Banque() {
    }

    public Banque(String nom) {
        this.nom = nom;
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

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
