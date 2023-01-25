package miagiles.gromed.model;


import jakarta.persistence.*;

import java.util.List;

@Entity(name="utilisateur")
public class Utilisateur {

    public Utilisateur() {
    }

    public Utilisateur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String adresseMail;

    @Column
    private String prenom;

    @Column
    private String nom;

    @Column
    private String motDePasse;

    @ManyToOne
    private EtablissementSante etablissementSante;

    @OneToMany
    private List<Commande> commandes;

    public long getId() {
        return id;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
