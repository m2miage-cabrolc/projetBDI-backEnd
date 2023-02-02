package miagiles.gromed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="groupe_generique")
public class GroupeGenerique {
    @Id
    @Column(name="id")
    private long id;

    @Column(name="libelle")
    private String libelle;

    public void setId(long id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
