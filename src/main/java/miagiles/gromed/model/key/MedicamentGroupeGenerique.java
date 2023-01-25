package miagiles.gromed.model.key;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import miagiles.gromed.model.GroupeGenerique;
import miagiles.gromed.model.Medicament;

import java.io.Serializable;

@Embeddable
public class MedicamentGroupeGenerique implements Serializable {

    @Column(name="medicament")
    private long medicament;

    @Column(name="groupe_generique")
    private long groupeGenerique;

}
