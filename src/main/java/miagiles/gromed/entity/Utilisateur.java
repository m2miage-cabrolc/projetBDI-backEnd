package miagiles.gromed.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name="utilisateur")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Utilisateur {
    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String adresseMail;

    @Column
    private String prenom;

    @Column
    private String nom;

    @Column
    private String motDePasse;

    @ManyToOne
    private EtablissementSante etablissementSante;

    @OneToMany
    private List<Commande> commandes;

    public void addCommande(Commande commande){
        commandes.add(commande);
    }


    public Commande getPanier(){
        Commande res = null;
        for (Commande c : this.commandes){
            if(c.getEtatCommande().equals("Panier")){
                res = c;
            }
        }
        return res;
    }


}
