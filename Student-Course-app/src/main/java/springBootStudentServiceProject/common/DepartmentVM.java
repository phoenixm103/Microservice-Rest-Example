package springBootStudentServiceProject.common;
import java.io.Serializable;
import java.util.List;

public class DepartmentVM implements Serializable{
	String id;
	String name;
	List<StudentInfoVM> students;	
	//List<CourseVM> course;

	
	public List<StudentInfoVM> getStudents() {
		return students;
	}
	public void setStudents(List<StudentInfoVM> students) {
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
	
	public DepartmentVM() {
		super();
	// TODO Auto-generated constructor stub
	}
	public DepartmentVM(String id, String name) {
		super();
		this.id = id;
		this.name = name;

	}
	public DepartmentVM(String id, String name, List<StudentInfoVM> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}



}
