package miagiles.gromed.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity(name="presentation")
public class Presentation {
    @Id
    @Column
    private long codeCIP7;

    @Column
    private String libelle;

    @Column
    private float prix;

    @Column
    private int stockLogique;

    @Column
    private int stockPhysique;

    @ManyToMany
    private List<Medicament> medicaments;

    public long getCodeCIP7() {
        return codeCIP7;
    }

    public void setCodeCIP7(long codeCIP7) {
        this.codeCIP7 = codeCIP7;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getStockLogique() {
        return stockLogique;
    }

    public void setStockLogique(int stockLogique) {
        this.stockLogique = stockLogique;
    }

    public int getStockPhysique() {
        return stockPhysique;
    }

    public void setStockPhysique(int stockPhysique) {
        this.stockPhysique = stockPhysique;
    }
}
