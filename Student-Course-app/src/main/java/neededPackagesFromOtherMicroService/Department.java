package neededPackagesFromOtherMicroService;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Departments")
public class Department {
	

	private String id;
	@Id
	private String name;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<StudentInfo> students;
	
	public List<StudentInfo> getStudents() {
		return students;
	}
	public void setStudents(List<StudentInfo> students) {
		this.students = students;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String id, String name, List<StudentInfo> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}
	

}
