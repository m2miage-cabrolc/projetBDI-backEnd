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
    @JoinColumn(name="codeCIS")
    private Medicament medicament;

    @Id
    @ManyToOne
    @JoinColumn(name="code")
    private Substance substance;

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public Substance getSubstance() {
        return substance;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
