package miagiles.gromed.repository;


import miagiles.gromed.model.EtablissementSante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtablissementSanteRepository extends CrudRepository<EtablissementSante, Long> {


}
