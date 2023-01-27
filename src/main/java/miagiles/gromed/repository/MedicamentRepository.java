package miagiles.gromed.repository;

import miagiles.gromed.model.Medicament;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentRepository extends CrudRepository<Medicament, Long> {
}
