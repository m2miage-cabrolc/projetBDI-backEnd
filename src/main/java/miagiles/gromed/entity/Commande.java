package miagiles.gromed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "commande")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Commande {


    @Id
    @Column
    @GeneratedValue
    private long numeroCommande;

    @Column(name="isType")
    private boolean commandeType;

    @Column(name="nom")
    private String nomCmmande;

    @Column(name="etatCommande")
    private String etatCommande;



}
