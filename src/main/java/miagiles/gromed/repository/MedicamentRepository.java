package miagiles.gromed.repository;

import miagiles.gromed.entity.Medicament;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentRepository extends CrudRepository<Medicament, Long> {
}
