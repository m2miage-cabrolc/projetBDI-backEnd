package miagiles.gromed.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Composition {

    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(name="dosage")
    private float dosage;

    @Column(name="reference_dosage")
    private String reference;

    @ManyToMany
    private List<Medicament> medicaments;
}
