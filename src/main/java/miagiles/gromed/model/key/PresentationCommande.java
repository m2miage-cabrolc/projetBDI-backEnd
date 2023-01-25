package miagiles.gromed.model.key;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PresentationCommande implements Serializable {
    @Column(name="presentation")
    private long presentation;

    @Column(name="commande")
    private long commande;

    public long getCommande() {
        return commande;
    }

    public void setCommande(long commande) {
        this.commande = commande;
    }

    public long getPresentation() {
        return presentation;
    }

    public void setPresentation(long presentation) {
        this.presentation = presentation;
    }
}
