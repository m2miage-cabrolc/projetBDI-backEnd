package miagiles.gromed.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity(name = "commande")
public class Commande {

    public Commande() {
    }

    public Commande(boolean commandeType, boolean valide) {
        setCommandeType(commandeType);
        setValide(valide);
    }

    @Id
    @Column
    @GeneratedValue
    private long numeroCommande;

    @Column(name="isType")
    private boolean commandeType;

    @Column(name="nom")
    private String nomCmmande;

    @Column(name="isValid")
    private boolean valide;

    @ManyToMany
    private List<PresentationDeCommande> presentations;

    public boolean isValide() {
        return valide;
    }

    public void setValide(boolean valide) {
        this.valide = valide;
    }

    public String getNomCmmande() {
        return nomCmmande;
    }

    public void setNomCmmande(String nomCmmande) {
        this.nomCmmande = nomCmmande;
    }

    public boolean isCommandeType() {
        return commandeType;
    }

    public void setCommandeType(boolean commandeType) {
        this.commandeType = commandeType;
    }
}
