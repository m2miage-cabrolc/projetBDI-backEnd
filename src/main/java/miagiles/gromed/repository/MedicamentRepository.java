package miagiles.gromed.repository;

import miagiles.gromed.entity.Medicament;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicamentRepository extends CrudRepository<Medicament, Long>  , JpaSpecificationExecutor<Medicament> {
    @Query(value = "select * from medicament m where m.denomination LIKE :prefix% ",nativeQuery = true)
    public List<Medicament> getMedicamentByDenomination(@Param("prefix") String prefix);
}
