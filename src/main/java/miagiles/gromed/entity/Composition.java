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



    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }


    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
