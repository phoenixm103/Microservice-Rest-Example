package studentDepartmentApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import studentDepartmentApp.model.Department;
import studentDepartmentApp.model.StudentInfo;
import studentDepartmentApp.service.DepartmentService;
import studentDepartmentApp.service.StudentService;
import studentDepartmentApp.vm.DepartmentVM;
import studentDepartmentApp.vm.StudentInfoVM;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/departments")
	public List<DepartmentVM> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	
	@RequestMapping("/departments/{id}")
	public DepartmentVM getDepartmentById(@PathVariable String id){
		return departmentService. getDepartmentById(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/departments")
	public void addDepartment(@RequestBody Department department) {
		departmentService.addDepartment(department);

	}
}
