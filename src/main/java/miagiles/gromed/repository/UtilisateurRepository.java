package miagiles.gromed.repository;


import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Utilisateur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

    Utilisateur findByAdresseMail(String adresseMail);

    Utilisateur findByAdresseMailAndMotDePasse(String adresseMail, String motDePasse);



}
