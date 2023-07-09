package tn.spring.campproject.Wiem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.campproject.Entities.Espace;

@Repository
public interface IEspaceRepo extends JpaRepository<Espace, Long> {

}
