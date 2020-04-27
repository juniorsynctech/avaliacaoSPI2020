package apirestfullspi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apirestfullspi.domain.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long>{

	List<Status> findAll();
			
}
