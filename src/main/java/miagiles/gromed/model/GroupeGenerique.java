package miagiles.gromed.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class GroupeGenerique {
    @Id
    @Column(name="id")
    private long id;

    @Column(name="libelle")
    private String libelle;

    @OneToMany
    private List<MedicamentDeGroupeGenerique> medicaments;
}