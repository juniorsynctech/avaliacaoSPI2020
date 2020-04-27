package apirestfullspi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apirestfullspi.domain.ProjectHistory;

@Repository
public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory, Long>{

	List<ProjectHistory> findAll();
}
