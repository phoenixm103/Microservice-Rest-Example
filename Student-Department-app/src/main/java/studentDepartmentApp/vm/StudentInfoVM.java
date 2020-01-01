package studentDepartmentApp.vm;

import java.io.Serializable;
import java.util.List;

import studentDepartmentApp.model.Department;

public class StudentInfoVM implements Serializable{
	String id;
	String name;
	DepartmentVM department;
	//List<CourseVM> course;

	public DepartmentVM getDepartmentVM() {
		return department;
	}
	public void setDepartment(DepartmentVM department) {
		this.department = department;
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
	
	public StudentInfoVM() {
		super();
	// TODO Auto-generated constructor stub
	}
	public StudentInfoVM(String id, String name,DepartmentVM department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public StudentInfoVM(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



 
}
