package swagger.tests.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swagger.tests.entity.AlunoEntity;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Integer> {


}
