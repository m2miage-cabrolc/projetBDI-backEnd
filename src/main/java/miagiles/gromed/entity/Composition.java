package miagiles.gromed.entity;

import jakarta.persistence.*;
import miagiles.gromed.entity.key.SubstanceMedicament;

@Entity(name="composition")
public class Composition {

    @EmbeddedId
    private SubstanceMedicament substanceMedicament;

    @Column(name="dosage")
    private String dosage;

    @Column(name="reference_dosage")
    private String reference;


    @Id
    @ManyToOne
    @JoinTable(name="medicament")
    private Medicament medicament;

    @Id
    @ManyToOne
    @JoinTable(name="substance")
    private Substance substance;




    public String getReference() {
        return reference;
    }

    public Medicament getMedicament() {
        return medicament;
    }

}
