package miagiles.gromed.repository;

import miagiles.gromed.entity.Medicament;
import miagiles.gromed.entity.Presentation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PresentationRepository extends CrudRepository<Presentation, Long> {



    @Query("SELECT p.medicaments from pres p join p.medicaments m where m.denomination LIKE %:denom%")
    Iterable<Medicament> findMedsByDenom (@Param("denom") String denom);

    Presentation findByCodeCIP7(Long codeCIP7);

}
