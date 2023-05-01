package QLHS_repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import QLHS_entities.Students;

@Repository
public interface Students_repos extends JpaRepository<Students, Long> {

}
