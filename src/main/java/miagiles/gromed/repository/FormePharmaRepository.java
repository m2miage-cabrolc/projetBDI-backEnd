package miagiles.gromed.repository;

import miagiles.gromed.entity.FormePharma;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormePharmaRepository extends CrudRepository<FormePharma, String> {
}
