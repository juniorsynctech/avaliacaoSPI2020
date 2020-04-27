package apirestfullspi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import apirestfullspi.domain.Project;
import apirestfullspi.service.ProjectService;

@RestController
@RequestMapping("/api")
public class ProjectRest {
	
	@Autowired
	public ProjectService projectService;
	
	@PostMapping("/project")
    public ResponseEntity<Project> saveProject(@RequestBody Project project) {

		project = projectService.newProject(project);

        return ResponseEntity.ok().body(project);
    }
	
	@PutMapping("/project")
	public void alterProject(@RequestBody Project Project) {
				
		projectService.newProject(Project);				
	}
	
	@GetMapping("/project/all")
	public List<Project> allProjects() {
		
		return projectService.ALLProject();
	}
	
	@GetMapping("/project/{id}")
	public Project getProject(@PathVariable long id) {
		
		return projectService.findOneProject(id);
	}		
	
	@DeleteMapping("/project/{id}")
	public void deleteProject(@PathVariable long id) {
		
		projectService.deleteProject(id);
	}

}
