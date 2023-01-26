package miagiles.gromed.repository;


import miagiles.gromed.entity.PresentationDeCommande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentationCommandeRepository extends CrudRepository<PresentationDeCommande, Long> {
}
