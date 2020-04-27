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
import apirestfullspi.domain.ProjectHistory;
import apirestfullspi.service.ProjectHistoryService;

@RestController
@RequestMapping("/api")
public class ProjectHistoryRest {

	@Autowired
	private ProjectHistoryService projectHistoryService;
	
	@PostMapping("/history")
    public ResponseEntity<ProjectHistory> saveProjectHistory(@RequestBody ProjectHistory history) {

		history = projectHistoryService.newProject(history);

        return ResponseEntity.ok().body(history);
    }
	
	@PutMapping("/history")
	public void alterProjectHistory(@RequestBody ProjectHistory ProjectHistory) {
				
		projectHistoryService.newProject(ProjectHistory);				
	}
	
	@GetMapping("/history/all")
	public List<ProjectHistory> allProjectHistorys() {
		
		return projectHistoryService.ALLProjectHistory();
	}
	
	@GetMapping("/history/{id}")
	public ProjectHistory getProjectHistory(@PathVariable long id) {
		
		return projectHistoryService.findOneProjectHistory(id);
	}		
	
	@DeleteMapping("/history/{id}")
	public void deleteProjectHistory(@PathVariable long id) {
		
		projectHistoryService.deleteProjectHistory(id);
	}	
}
