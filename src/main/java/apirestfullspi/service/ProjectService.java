package apirestfullspi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import apirestfullspi.domain.Project;
import apirestfullspi.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project newProject(Project project) {
		
		return projectRepository.save(project);
	}
	
	public List<Project> ALLProject() {
		
		return projectRepository.findAll();
	}
	
	public Project findOneProject(long id) {
		
		return projectRepository.getOne(id);		
	}
	
	public Project alterProject(Project project) {
		
		return projectRepository.save(project);
	}
	
	public void deleteProject (long id) {
		
		projectRepository.deleteById(id);		
	}

}
