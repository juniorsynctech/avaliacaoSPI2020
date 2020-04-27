package apirestfullspi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import apirestfullspi.domain.Task;
import apirestfullspi.repository.TaskRepository;

@Service
public class TaksService {

	@Autowired
	private TaskRepository taskRepository;
	
	public Task newTask(Task task) {
		
		return taskRepository.save(task);
	}
	
	public List<Task> ALLTasks() {
		
		return taskRepository.findAll();
	}
	
	public Task findOneTask(long id) {
		
		return taskRepository.getOne(id);		
	}
	
	public Task alterTask(Task task) {
		
		return taskRepository.save(task);
	}
	
	public void deleteTask(long id) {
		
		taskRepository.deleteById(id);		
	}
}
