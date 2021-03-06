package apirestfullspi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apirestfullspi.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

	List<Person> findAll();
}
