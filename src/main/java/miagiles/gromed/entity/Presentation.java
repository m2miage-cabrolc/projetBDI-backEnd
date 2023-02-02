package miagiles.gromed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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