package apirestfullspi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String projectTitle;
	private long manager;
	private long minSalary;
	private long maxSalary;
	
	public Project() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public long getManager() {
		return manager;
	}

	public void setManager(long manager) {
		this.manager = manager;
	}

	public long getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(long minSalary) {
		this.minSalary = minSalary;
	}
	public long getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(long maxSalary) {
		this.maxSalary = maxSalary;
	}	

}
