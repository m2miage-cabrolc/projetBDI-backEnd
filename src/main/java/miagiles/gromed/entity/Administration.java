package miagiles.gromed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity(name="administration")
public class Administration {
    @Id
    @Column(name="code")
    private long code;

    @Column(name="libelle")
    private String libelle;

    @ManyToMany
    private List<Medicament> medicaments;

}
