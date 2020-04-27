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
import apirestfullspi.domain.Department;
import apirestfullspi.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentRest {
	
	@Autowired
	public DepartmentService departmentService;
	

	@PostMapping("/department")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {

    	department = departmentService.newDepartment(department);

        return ResponseEntity.ok().body(department);
    }
	
	@PutMapping("/department")
	public void alterDepartment(@RequestBody Department department) {
				
		departmentService.newDepartment(department);				
	}
	
	@GetMapping("/department/all")
	public List<Department> allDepartments() {
		
		return departmentService.ALLDepartment();
	}
	
	@GetMapping("/department/{id}")
	public Department getDepartment(@PathVariable long id) {
		
		return departmentService.findOneDepartment(id);
	}
		
	
	@DeleteMapping("/department/{id}")
	public void deleteDepartment(@PathVariable long id) {
		
		departmentService.deleteDepartment(id);
	}
	
}
