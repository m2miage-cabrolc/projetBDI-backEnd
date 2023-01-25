package miagiles.gromed.repository;

import miagiles.gromed.model.Composition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompositionRepository extends CrudRepository<Composition, Long> {
}
