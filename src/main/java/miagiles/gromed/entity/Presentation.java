package miagiles.gromed.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Presentation {
    @Column
    @Id
    private Integer codeCIP7;
    @Column
    private String libelle;
}
