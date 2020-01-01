package springBootStudentServiceProject.course;

import java.io.Serializable;
import java.util.List;

import springBootStudentServiceProject.student.StudentVM;

public class CourseVM implements Serializable{
	private String id;
	private String name;
	private List<StudentVM> student;
	
	public CourseVM() {
		
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
	
	public List<StudentVM> getStudent() {
		return student;
	}
	public void setStudent(List<StudentVM> student) {
		this.student = student;
	}
	
	
	public CourseVM(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public CourseVM(String id) {
		super();
		this.id = id;
	}
	public CourseVM(String id, String name, List<StudentVM> student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}

}	

