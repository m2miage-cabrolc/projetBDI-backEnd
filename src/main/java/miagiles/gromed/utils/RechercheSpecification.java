package miagiles.gromed.utils;

import jakarta.persistence.criteria.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import miagiles.gromed.entity.FormePharma;
import miagiles.gromed.entity.Medicament;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class RechercheSpecification implements Specification<Medicament> {
    private String denomination;
    private String formePharma;


    @Override
    public Predicate toPredicate(Root<Medicament> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        Join<FormePharma, Medicament> medicamentJoinFormePharma = root.join("formePharma", JoinType.INNER);
        if (denomination != null) {
            predicates.add(criteriaBuilder.like(root.get("denomination"),  denomination+"%"));
        }

        if (formePharma != null) {
            predicates.add(criteriaBuilder.like(medicamentJoinFormePharma.get("libelle"),"%"+formePharma+"%" ));
        }

        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
    }
}
