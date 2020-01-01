package springBootStudentServiceProject.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springBootStudentServiceProject.common.DepartmentVM;
import springBootStudentServiceProject.course.Course;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/students")
	public List<StudentVM> getAllStudentsOnly(){
		return studentService.getAllStudentsOnly();
	}
	
	@RequestMapping("/students/{id}/department")
	public String getStudentDepartment(@PathVariable String id){
		return studentService.getStudentDepartment(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/students")
	public void addStudents(@RequestBody Student student) {
		studentService.addStudentsOnly(student);

	}
	@RequestMapping("/students/{id}")
	 public StudentVM getStudent(@PathVariable String id) {
		 return studentService.getStudentVMByID(id);
	 }
	
	
	
	

}