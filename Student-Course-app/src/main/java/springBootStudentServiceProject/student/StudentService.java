package springBootStudentServiceProject.student;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import neededPackagesFromOtherMicroService.Department;
import neededPackagesFromOtherMicroService.StudentInfo;
import springBootStudentServiceProject.common.Converter;
import springBootStudentServiceProject.common.DepartmentVM;
import springBootStudentServiceProject.common.StudentInfoVM;
import springBootStudentServiceProject.course.Course;
import springBootStudentServiceProject.course.CourseVM;
import springBootStudentServiceProject.student.StudentVM;
@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public List<StudentVM> getAllStudentsOnly() {
		return Converter.getStudentVMList(studentRepository.findAll());
		
	}


	public void addStudentsOnly(Student student) {
		studentRepository.save(student);	
		
	}


	public StudentVM getStudentVMByID(String id) {
			return Converter.getStudentVMByID(studentRepository.findAll(),id);
	}


	public String getStudentDepartment(String id) {
	RestTemplate restTemplate=new RestTemplate();
	DepartmentVM department=restTemplate.getForObject("http://localhost:8087/departments/CS",DepartmentVM.class );
	List<StudentInfoVM> studentList=department.getStudents();
	StudentInfoVM stu = null;
	for(int i=0;i<studentList.size();i++) {
		StudentInfoVM studentInfoVM=studentList.get(i);
		if(studentInfoVM.getId().equals(id)) {
			stu=studentInfoVM; 
			 
		}
	}
	System.out.println ("ugi9[[[[[[[[[[  "+ stu.getName());
	//return stu.getDepartmentVM();
	return department.getName();
//	return department;// DepartmentVM;
	}


	}




		
	


