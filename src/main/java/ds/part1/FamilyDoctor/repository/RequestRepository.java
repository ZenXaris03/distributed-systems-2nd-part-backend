package ds.part1.FamilyDoctor.repository;

import ds.part1.FamilyDoctor.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

}
