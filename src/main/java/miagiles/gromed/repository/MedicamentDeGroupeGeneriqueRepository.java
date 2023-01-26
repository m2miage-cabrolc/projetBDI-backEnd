package miagiles.gromed.repository;

import miagiles.gromed.entity.MedicamentDeGroupeGenerique;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentDeGroupeGeneriqueRepository extends CrudRepository<MedicamentDeGroupeGenerique, Long> {
}
