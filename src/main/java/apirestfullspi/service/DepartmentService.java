package apirestfullspi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import apirestfullspi.domain.Department;
import apirestfullspi.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department newDepartment(Department department) {
		
		return departmentRepository.save(department);
	}
	
	public List<Department> ALLDepartment() {
		
		return departmentRepository.findAll();
	}
	
	public Department findOneDepartment(long id) {
		
		return departmentRepository.getOne(id);
		
	}
	
	public Department alterDepartment(Department department) {
		
		return departmentRepository.save(department);
	}
	
	public void deleteDepartment(long id) {
		
		departmentRepository.deleteById(id);
		
	}

}
