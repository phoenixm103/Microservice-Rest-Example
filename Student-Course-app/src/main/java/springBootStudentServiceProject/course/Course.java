package springBootStudentServiceProject.course;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import springBootStudentServiceProject.student.Student;
@Entity
@Table(name="Courses")
public class Course implements Serializable{
	
	public Course(String id) {
		super();
		this.id = id;
	}

	@Id
	private String id;
	private String name;
		
	@ManyToMany(mappedBy="course",cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private List<Student> student;
	 
	public Course() {	
	
	}

	public Course(String id, String name) {
	super();
	this.id = id;
	this.name = name;
	}
	

	public Course(String id, String name, List<Student> student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
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
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}

}	

