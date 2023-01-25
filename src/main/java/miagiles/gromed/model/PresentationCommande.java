package miagiles.gromed.model;

import jakarta.persistence.*;

import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity(name="presentation_commande")
public class PresentationCommande {
    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(name="quantite")
    private int quantite;

    @ManyToMany(fetch= FetchType.LAZY)
    private List<Commande> commandes;

    @ManyToMany(fetch=FetchType.LAZY)
    private List<Presentation> presentations;

    public long getId() {
        return id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


}
