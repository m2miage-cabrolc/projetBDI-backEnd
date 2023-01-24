package miagiles.gromed.repository;

import miagiles.gromed.model.PrescriptionDelivrance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionDelivranceRepository  extends CrudRepository<PrescriptionDelivrance, Long> {

}
