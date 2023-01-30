package miagiles.gromed.repository;


import miagiles.gromed.entity.Commande;
import miagiles.gromed.entity.Utilisateur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
    //@Query(value = "select * from utilisateur  where adresseMail =:adrresseMail and motDePasse:=mdp",nativeQuery = true)
    //Utilisateur findUserByMailAndPasswd(@Param("adresseMail") String adresseMail , @Param("mdp") String mdp);


    //@Query(value = "select * from utilisateur  where adresseMail =:adrresseMail",nativeQuery = true)
    //Utilisateur findUserByMail(String adresseMail);
    
}
