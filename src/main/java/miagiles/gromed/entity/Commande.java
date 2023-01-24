package miagiles.gromed.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Commande {
    @Column
    @Id
    private Integer numCommande;
    @Column
    private Boolean estCommandeType;
    @Column
    private String nomCommande;
    @Column
    private String etatCommande;

}
