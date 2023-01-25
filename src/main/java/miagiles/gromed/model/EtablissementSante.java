package miagiles.gromed.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity(name="etablisssement")
public class EtablissementSante {

    @Id
    @Column(name="id")
    private long etablissementID;

    @Column(name="nom")
    private String nomEtablissement;

    @Column(name="adresse")
    private String adresse;


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

    public long getEtablissementID() {
        return etablissementID;
    }

    public void setEtablissementID(long etablissementID) {
        this.etablissementID = etablissementID;
    }

}
