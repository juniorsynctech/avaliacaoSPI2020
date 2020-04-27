package apirestfullspi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import apirestfullspi.domain.ProjectHistory;
import apirestfullspi.repository.ProjectHistoryRepository;

@Service
public class ProjectHistoryService {
	
	@Autowired
	private ProjectHistoryRepository historyRepository;
	
	public ProjectHistory newProject(ProjectHistory history) {
		
		return historyRepository.save(history);
	}
	public List<ProjectHistory> ALLProjectHistory() {
		
		return historyRepository.findAll();
	}
	
	public ProjectHistory findOneProjectHistory(long id) {
		
		return historyRepository.getOne(id);		
	}
	
	public ProjectHistory alterProjectHistory(ProjectHistory history) {
		
		return historyRepository.save(history);
	}
	
	public void deleteProjectHistory (long id) {
		
		historyRepository.deleteById(id);		
	}	
}
