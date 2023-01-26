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
    @JoinTable(name="medicament")
    private Medicament medicament;

    @Id
    @ManyToOne
    @JoinTable(name="substance")
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

    public void setSubstance(long substance){
        this.substance.setCodeSubstance(substance);
    }

    public String getReference() {
        return reference;
    }

    public Medicament getMedicament() {
        return medicament;
    }

}
