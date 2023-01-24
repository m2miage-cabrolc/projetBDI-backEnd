package miagiles.gromed.repository;

import miagiles.gromed.model.Presentation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentationRepository extends CrudRepository<Presentation, Long> {
}
