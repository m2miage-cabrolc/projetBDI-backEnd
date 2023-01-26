package miagiles.gromed.model;

import jakarta.persistence.*;
import miagiles.gromed.model.key.MedicamentGroupeGenerique;

import java.util.List;

@Entity(name="med_de_grp_generique")
@IdClass(MedicamentGroupeGenerique.class)
public class MedicamentDeGroupeGenerique {


    @Column(name="type")
    private String type;

    @Id
    @ManyToOne
    @JoinTable(name="groupe_generique")
    private GroupeGenerique groupeGenerique;

    @Id
    @OneToOne
    @JoinTable(name="medicament")
    private Medicament medicament;

    public void setGroupeGenerique(GroupeGenerique groupeGenerique) {
        this.groupeGenerique = groupeGenerique;
    }

    public void setGroupeGenerique(Long groupeGenerique){
        this.groupeGenerique.setId(groupeGenerique);
    }

    public void setMedicament(long medicament) {
        this.medicament.setCodeCIS(medicament);
    }
}
