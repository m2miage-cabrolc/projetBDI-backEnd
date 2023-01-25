package miagiles.gromed.model;

import jakarta.persistence.*;
import miagiles.gromed.model.key.SubstanceMedicament;

import java.util.List;

@Entity(name="composition")
@IdClass(SubstanceMedicament.class)
public class Composition {

    @Column(name="dosage")
    private String dosage;

    @Column(name="reference_dosage")
    private String reference;


    @Id
    @ManyToOne
    @JoinColumn(name="medicament")
    private Medicament medicament;

    @Id
    @ManyToOne
    @JoinColumn(name="substance")
    private Substance substance;
}
