package miagiles.gromed.repository;


import miagiles.gromed.entity.PresentationDeCommande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PresentationCommandeRepository extends CrudRepository<PresentationDeCommande, Long> {
    List<PresentationDeCommande> findByPresentationCommande_Commande(long commande);
}
