package springBootStudentServiceProject.student;

import java.io.Serializable;
import java.util.List;

import springBootStudentServiceProject.course.CourseVM;

	public class StudentVM implements Serializable{
		String id;
		String name;
		List<CourseVM> course;

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
		public List<CourseVM> getCourse() {
			return course;
		}
		public void setCourse(List<CourseVM> course) {
			this.course = course;
		}
	public StudentVM() {
		super();
	// TODO Auto-generated constructor stub
}
	public StudentVM(String id, String name, List<CourseVM> course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public StudentVM(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


 
}
