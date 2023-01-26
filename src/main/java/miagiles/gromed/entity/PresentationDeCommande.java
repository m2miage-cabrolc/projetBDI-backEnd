package miagiles.gromed.entity;

import jakarta.persistence.*;
import miagiles.gromed.entity.key.PresentationCommande;

@Entity(name="pres_de_commande")
@IdClass(PresentationCommande.class)
public class PresentationDeCommande {

    @Column(name="quantite")
    private int quantite;

    @Id
    @JoinColumn(name="commande")
    @ManyToOne
    private Commande commande;

    @Id
    @JoinColumn(name="presentation")
    @ManyToOne
    private Presentation presentation;


    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


}
