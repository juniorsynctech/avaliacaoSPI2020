package apirestfullspi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import apirestfullspi.domain.Status;
import apirestfullspi.repository.StatusRepository;

@Service
public class StatusService {

	@Autowired
	private StatusRepository statusRepository;
	
	public List<Status> getAll(){
		
		return statusRepository.findAll();
	}
	
	public Status newStatus(Status status) {
		
		return statusRepository.save(status);
	}
	
	
}
