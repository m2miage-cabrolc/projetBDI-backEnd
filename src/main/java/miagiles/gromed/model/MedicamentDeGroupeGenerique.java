package miagiles.gromed.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class MedicamentDeGroupeGenerique {
    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(name="type")
    private String type;

    @OneToMany(fetch=FetchType.LAZY)
    private List<Medicament> medicaments;

    @ManyToOne(fetch=FetchType.LAZY)
    private GroupeGenerique groupeGenerique;


}
