package miagiles.gromed.model;

import jakarta.persistence.*;
import miagiles.gromed.model.key.MedicamentGroupeGenerique;

import java.util.List;

@Entity(name="medicament_de_groupe_generique")
@IdClass(MedicamentGroupeGenerique.class)
public class MedicamentDeGroupeGenerique {


    @Column(name="type")
    private String type;

    @Id
    @ManyToOne
    @JoinColumn(name="groupe_generique")
    private GroupeGenerique groupeGenerique;

    @Id
    @OneToOne
    @JoinColumn(name="medicament")
    private Medicament medicament;




}
