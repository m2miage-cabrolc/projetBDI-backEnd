package miagiles.gromed.entity.key;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinTable;

import java.io.Serializable;

@Embeddable
public class SubstanceMedicament implements Serializable {

    @Column(name="codeCIS")
    @JoinTable(name="med")
    private long medicament;

    @Column(name="code")
    @JoinTable(name="substance")
    private long substance;

    public long getMedicament() {
        return medicament;
    }

    public void setMedicament(long medicament) {
        this.medicament = medicament;
    }

    public long getSubstance() {
        return substance;
    }

    public void setSubstance(long substance) {
        this.substance = substance;
    }


}
