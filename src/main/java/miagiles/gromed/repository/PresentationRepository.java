package miagiles.gromed.repository;

import miagiles.gromed.entity.Medicament;
import miagiles.gromed.entity.Presentation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;


@Repository
public interface PresentationRepository extends CrudRepository<Presentation, Long> {




    @Query("SELECT p.medicaments from pres p join p.medicaments m where m.denomination LIKE %:denom%")
    Iterable<Medicament> findMedsByDenom (@Param("denom") String denom);


    /*@Query("SELECT p.codeCIP7, pm.codeCIS from pres p join pres.medicaments pm")
    HashMap<Long,Long> findPresMeds();*/

    Presentation findByCodeCIP7(Long codeCIP7);

}
