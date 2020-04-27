package apirestfullspi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apirestfullspi.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<apirestfullspi.domain.Task, Long>{

	List<Task> findAll();
}
