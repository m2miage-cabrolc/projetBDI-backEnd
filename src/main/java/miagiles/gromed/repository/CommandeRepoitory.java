package miagiles.gromed.repository;


import miagiles.gromed.model.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepoitory extends CrudRepository<Commande, Long> {

}
