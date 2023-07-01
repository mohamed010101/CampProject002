package tn.spring.campproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.campproject.Entities.Produits;
@Repository
public interface IProduitsRepository extends JpaRepository<Produits, Integer> {

}
