package miagiles.gromed.entity.key;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinTable;

import java.io.Serializable;

@Embeddable
public class PresentationCommande implements Serializable {
    @Column(name="codeCIP7")
    @JoinTable(name="pres")
    private long presentation;

    @Column(name="numeroCommande")
    @JoinTable(name="commande")
    private long commande;

    public PresentationCommande() {
    }

    public PresentationCommande(long presentation, long commande) {
        this.presentation = presentation;
        this.commande = commande;
    }

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
