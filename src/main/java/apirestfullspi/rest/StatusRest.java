package apirestfullspi.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import apirestfullspi.domain.Status;
import apirestfullspi.service.StatusService;

@RestController
@RequestMapping("/api")
public class StatusRest {
	
	@Autowired
	private StatusService statusService;
	
	@GetMapping("/status")
	public List<Status> status(){
		
		return statusService.getAll();
	}
	
	@PostMapping("/status")
	public Status addStatus(@RequestBody Status status) {
		
		return statusService.newStatus(status);
	}

}
