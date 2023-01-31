package miagiles.gromed.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import miagiles.gromed.entity.key.PresentationCommande;

@Entity(name="pres_de_commande")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PresentationDeCommande {

    @EmbeddedId
    PresentationCommande presentationCommande;


    @Column(name="quantite")
    private int quantite;

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }



}
