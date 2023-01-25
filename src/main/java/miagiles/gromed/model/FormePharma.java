package miagiles.gromed.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="forme_pharmaceutique")
public class FormePharma {
    @Id
    @Column(name="libelle")
    private String libelle;
}
