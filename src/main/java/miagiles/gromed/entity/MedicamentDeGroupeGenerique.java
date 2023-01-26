package miagiles.gromed.entity;

import jakarta.persistence.*;
import miagiles.gromed.entity.key.MedicamentGroupeGenerique;

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
