package miagiles.gromed.entity;

import jakarta.persistence.*;
import miagiles.gromed.entity.key.MedicamentGroupeGenerique;

@Entity(name="med_de_grp_generique")
public class MedicamentDeGroupeGenerique {

    @EmbeddedId
    private MedicamentGroupeGenerique medicamentGroupeGenerique;

    @Column(name="type")
    private String type;



}
