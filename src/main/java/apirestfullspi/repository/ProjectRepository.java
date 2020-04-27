package apirestfullspi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apirestfullspi.domain.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

	List<Project> findAll();
}
