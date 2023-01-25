package miagiles.gromed.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity(name="etablisssementSante")
public class EtablissementSante {

    @Id
    @Column(name="id")
    private String etalissementID;

    @Column(name="nom")
    private String nomEtablissement;

    @Column(name="adresse")
    private String adresse;

    @OneToMany
    private List<Utilisateur> utilisateurs;

    public String getNomEtablissement() {
        return nomEtablissement;
    }

    public void setNomEtablissement(String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public void addUtilisateur(Utilisateur utilisateur){
        this.utilisateurs.add(utilisateur);
    }
}
