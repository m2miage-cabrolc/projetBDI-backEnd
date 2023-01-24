package miagiles.gromed.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EtablissementSante {

    @Id
    @Column
    private String etalissementID;
}
