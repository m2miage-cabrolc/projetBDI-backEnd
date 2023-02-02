package miagiles.gromed.repository;


import miagiles.gromed.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

    Utilisateur findByAdresseMail(String adresseMail);

    Utilisateur findByAdresseMailAndMotDePasse(String adresseMail, String motDePasse);



}
