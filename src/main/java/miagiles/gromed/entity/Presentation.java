package miagiles.gromed.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name="pres")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Presentation {

    /*@Version
    private long version;*/
    @Id
    @Column
    private long codeCIP7;

    @Column
    private String libelle;

    @Column(nullable = true)
    private float prix;

    @Column
    private int stockLogique;

    @Column
    private int stockPhysique;

    @ManyToMany
    private List<Medicament> medicaments;

}
