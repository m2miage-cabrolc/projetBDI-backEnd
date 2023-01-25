package miagiles.gromed.model.key;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SubstanceMedicament implements Serializable {

    @Column(name="medicament")
    private long medicament;

    @Column(name="substance")
    private long substance;
}
