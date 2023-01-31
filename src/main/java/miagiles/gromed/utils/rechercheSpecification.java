package miagiles.gromed.utils;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import miagiles.gromed.entity.Medicament;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class rechercheSpecification implements Specification<Medicament> {
    private String denomination;
    private Long codeCIS;

    public rechercheSpecification(String denomination , Long codeCIS){
        this.denomination=denomination;
        this.codeCIS=codeCIS;
    }
    @Override
    public Predicate toPredicate(Root<Medicament> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();

        if (denomination != null) {
            predicates.add(criteriaBuilder.like(root.get("denomination"),  denomination+"%"));
        }

        if (codeCIS != null) {
            predicates.add(criteriaBuilder.equal(root.get("codeCIS"),codeCIS ));
        }

        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
    }
}
