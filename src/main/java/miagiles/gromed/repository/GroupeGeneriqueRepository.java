package miagiles.gromed.repository;

import miagiles.gromed.model.GroupeGenerique;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeGeneriqueRepository extends CrudRepository<GroupeGenerique, Long> {
}
