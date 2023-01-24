package miagiles.gromed.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity(name="voie_administration")
public class VoieAdministration {
    @Id
    @Column(name="code")
    private long code;

    @Column(name="libelle")
    private String libelle;

    @ManyToMany
    private List<Medicament> medicaments;

}
