package apirestfullspi.rest;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import apirestfullspi.domain.Task;
import apirestfullspi.service.TaksService;

@RestController
@RequestMapping("/api")
public class TaskRest {
	
	public TaksService taskService;
	
	@PostMapping("/task")
    public ResponseEntity<Task> saveTask(@RequestBody Task task) {

		task = taskService.newTask(task);

        return ResponseEntity.ok().body(task);
    }
	
	@PutMapping("/task")
	public void alterTask(@RequestBody Task task) {
				
		taskService.newTask(task);				
	}
	
	@GetMapping("/task/all")
	public List<Task> allTasks() {
		
		return taskService.ALLTasks();
	}
	
	@GetMapping("/task/{id}")
	public Task getTask(@PathVariable long id) {
		
		return taskService.findOneTask(id);
	}		
	
	@DeleteMapping("/task/{id}")
	public void deleteTask(@PathVariable long id) {
		
		taskService.deleteTask(id);
	}

}
